/*
Palindrome pair
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string of length N. You have to select two non- overlapping (no common index) non- empty substrings of odd lengths from that string such that both those substrings are palindrome. You want the product of lengths of those substring to be maximum.
Input
Input contains of a single String of length N.

Constraints
2 <= N <= 100000
String contains lowercase english letters.
Output
Print a single integer which is the maximum possible product of lengths of selected substrings.
Example
Sample input 1
aabaaba

Sample output 1
9

Explanation : we can select substring [2-4] = aba and [5-7] = aba the product of their lengths is 9.

Sample Input 2
aabababaaa

Sample Output 2
15*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public long maxProduct(String s) {
        int n = s.length();
        if (n == 2) return 1;
        int[] len = manachers(s);               // get lengths of palindromes at each element
        
        long left[] = new long[n];                // stores the max length of palindrome to left of each index
        
        int max = 1;
        left[0] = max;
        for (int i = 1; i <= n - 1; i++) {
            // does any palindrome end at i with length greater than max
            if (len[(i - max - 1 + i)/2] > max) max += 2;
            left[i] = max;
        }
        max = 1;
        long[] right = new long[n];             // stores the max length of palindrome to right of each index
        right[n - 1] = max;
        
        for (int i = n - 2; i >= 0; i--) {
            // does any palindrome start at i with length greater than max
            if (len[(i + max + 1 + i)/2] > max) max += 2;
            right[i] = max;
        }
        
        long res = 1;
        
        for (int i = 1; i < n; i++) {            
            res = Math.max(res, left[i - 1] * right[i]);
        }
        return res;
    }
    
	private int[] manachers(String s) {
        
        int len = s.length();
        int[] P = new int[len];
        int c = 0; //stores the center of the longest palindromic substring until now
        int r = 0; //stores the right boundary of the longest palindromic substring until now
        int maxLen = 0;
       
        for(int i = 0; i < len; i++) {
            //get mirror index of i
            int mirror = (2 * c) - i;
            
            //see if the mirror of i is expanding beyond the left boundary of current longest palindrome at center c
            //if it is, then take r - i as P[i]
            //else take P[mirror] as P[i]
            if(i < r) {
                P[i] = Math.min(r - i, P[mirror]);
            }
            
            //expand at i
            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);
            while(a < len && b >= 0 && s.charAt(a) == s.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }
            
            //check if the expanded palindrome at i is expanding beyond the right boundary of current longest palindrome at center c
            //if it is, the new center is i
            if(i + P[i] > r) {
                c = i;
                r = i + P[i];
            }
        }
        for (int i = 0; i < len; i++) P[i] = 1 + 2*P[i];
        return P;
	}

// }

	// Driver code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
       
		String str = sc.next();
	    Main obj = new Main();
		System.out.println(obj.maxProduct(str));
	}
}
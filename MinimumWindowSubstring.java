/*
Minimum Window Substring
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two strings s and t of lengths m and n respectively, Print the length of the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, Print 0.
Input
The first line of the input contains the string s.
The next line of the input contains the string t.

Constraints
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.
Output
Print the length of minimum window substring.
Example
Sample Input
ADOBECODEBANC
ABC

Sample Output
BANC

Explanation
The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.*/





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int Minimum_Window(char []s, char []t)
{
 
    int m[] = new int[256];
 
    // Answer
    int ans = Integer.MAX_VALUE; // length of ans
    int start = 0; // starting index of ans
    int count = 0;
    // creating map
    for (int i = 0; i < t.length; i++) {
        if (m[t[i]] == 0)
            count++;
        m[t[i]]++;
    }
 
    // References of Window
    int i = 0;
    int j = 0;
     while (j < s.length)
    {
       
        // Calculations
        m[s[j]]--;
        if (m[s[j]] == 0)
            count--;
 
        // Condition matching
        if (count == 0)
        {
            while (count == 0)
            {
               
                // Sorting ans
                if (ans > j - i + 1)
                {
                    ans = Math.min(ans, j - i + 1);
                    start = i;
                }
                m[s[i]]++;
                if (m[s[i]] > 0)
                    count++;
 
                i++;
            }
        }
        j++;
    }
 
    if (ans != Integer.MAX_VALUE){
        String haha= String.valueOf(s).substring(start, ans+start);
        return haha.length();
    }
    else
        return 0;
}
 
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
                      String s=sc.nextLine();
                      String t=sc.nextLine();
                      System.out.print(Minimum_Window(s.toCharArray(), t.toCharArray()));
    }
}


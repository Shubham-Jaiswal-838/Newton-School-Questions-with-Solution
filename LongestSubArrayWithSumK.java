/*
Longest Sub-Array with Sum K
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array containing N integers and an integer K. Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K.
Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case contains two integers N and K and the second line contains N space-separated elements of the array.

Constraints:-
1<=T<=500
1<=N,K<=10^5
-10^5<=A[i]<=10^5

Sum of N over all test cases does not exceed 10^5
Output
For each test case, print the required length of the longest Sub-Array in a new line. If no such sub-array can be formed print 0.
Example
Sample Input:
3
6 15
10 5 2 7 1 9
6 -5
-5 8 -14 2 4 12
3 6
-1 2 3

Sample Output:
4
5
0*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
                      // Your code here
                      // Scanner sc = new Scanner(System.in);
                      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      int testCases = Integer.parseInt(br.readLine());
                      while(testCases-- != 0){
                          String[] s = br.readLine().split(" ");
                          int n = Integer.parseInt(s[0]);
                          int[] arr = new int[n];
                          int k = Integer.parseInt(s[1]);
                          String[] str = br.readLine().split(" ");
                          for(int i=0; i<n; i++){
                              arr[i] = Integer.parseInt(str[i]);
                          }
                          System.out.println(lenOfLongSubarr(arr,n,k));
                      }
    }

    static int lenOfLongSubarr(int[] arr, int n, int k){
             // HashMap to store (sum, index) tuples
             HashMap<Integer, Integer> map = new HashMap<>();
             int sum = 0, maxLen = 0;
 
             // traverse the given array
             for (int i = 0; i < n; i++) {
                 
                  // accumulate sum
                  sum += arr[i];
                 
                  // when subarray starts from index '0'
                  if (sum == k)
                      maxLen = i + 1;
 
                  // make an entry for 'sum' if it is
                  // not present in 'map'
                  if (!map.containsKey(sum)) {
                      map.put(sum, i);
                  }
 
                  // check if 'sum-k' is present in 'map'
                  // or not
                  if (map.containsKey(sum - k)) {
                       
                      // update maxLength
                      if (maxLen < (i - map.get(sum - k)))
                          maxLen = i - map.get(sum - k);
                  }
             }
              
             return maxLen;            
      }

}

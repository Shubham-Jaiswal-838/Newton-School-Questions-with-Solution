/*
Max Circular Subarray Sum
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr[] of N integers arranged in a circular fashion. Your task is to find the maximum contiguous subarray sum containing at least 1 element.
Input
The first line of input contains a single integer T which denotes the number of test cases. The first line of each test case contains a single integer N which denotes the total number of elements. The second line of each test case contains N space-separated integers denoting the elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
-10^6 <= Arr[i] <= 10^6

The Sum of N over all test cases is less than equal to 10^6.
Output
For each test case print the maximum sum obtained by adding the consecutive elements.
Example
Input:
4
7
8 -8 9 -9 10 -11 12
8
10 -3 -4 7 6 5 -4 -1
8
-1 40 -14 7 6 5 -4 -1
4
-1 -2 -3 -4

Output:
22
23
52
-1

Explanation:
Testcase 1: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives the maximum sum as 22.*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static long maxCircularSum(long a[], int n)
  {
   
    if (n == 1)
      return a[0];
 
    
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
 
    // Initialize every variable with first value of
    // array.
    long curr_max = a[0], max_so_far = a[0],
    curr_min = a[0], min_so_far = a[0];
 
    // Concept of Kadane's Algorithm
    for (int i = 1; i < n; i++)
    {
 
      // Kadane's Algorithm to find Maximum subarray
      // sum.
      curr_max = Math.max(curr_max + a[i], a[i]);
      max_so_far = Math.max(max_so_far, curr_max);
       curr_min = Math.min(curr_min + a[i], a[i]);
      min_so_far = Math.min(min_so_far, curr_min);
    }
    if (min_so_far == sum) {
      return max_so_far;
    }
 
    // returning the maximum value
    return Math.max(max_so_far, sum - min_so_far);

  }
 
    public static void main (String[] args)throws IOException {
                      // Your code here
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t>0){
        int n=Integer.parseInt(br.readLine());
        long[] arr=new long[n];
        String[] str=br.readLine().split(" ");
        for(int p=0;p<str.length;p++){
            arr[p]=Long.parseLong(str[p]);
        }
        System.out.println(maxCircularSum(arr, n));
        t--;
    }
    }
}

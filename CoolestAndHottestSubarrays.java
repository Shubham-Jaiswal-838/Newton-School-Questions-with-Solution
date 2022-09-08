/*
Coolest and Hottest Subarrays
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The coolness of the subarray of an array is the sum of elements in the subarray. The coolest subarray is the subarray having the maximum coolness, while the hottest subarray is the one having minimum coolness (obviously it can be negative). The coolest and the hottest subarrays are always non-empty.

Tono believes that cool and hot are happy together. The happiness of the array is the absolute difference between the coolness of its coolest and its hottest subarray.

Given an array A consisting of N elements, find its happiness.
Input
The first line of the input contains an integer N.
The next line contains N singly spaced integers A[1], A[2],...A[N]

Constraints
1 <= N <= 200000
-1000000000 <= A[i] <= 1000000000
Output
Output a single integer, the happiness of the array.
(The output may not fit into 32 bit integer datatype, use long long integer datatype instead).
Example
Sample Input
5
-1 2 -3 1 -5

Sample Output
9

Explanation: Coolest subarray of the array is [2], while the hottest subarray of the array is [-3, 1, -5]. The happiness of the array is 2-(-7)=9.*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
          a[i] = sc.nextInt();
        long sumc = Long.MIN_VALUE,sum = 0;
        for(int i=0;i<n;i++){
            sum += a[i];
            sumc = Math.max(sum,sumc);
            if(sum<0)
              sum = 0;
        }
        sum = 0;
        long sumh = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum += a[i];
            sumh = Math.min(sum,sumh);
            if(sum>0)
              sum = 0;
        }
        long res = sumc - sumh;
        System.out.println(res);
        sc.close();
    }
}


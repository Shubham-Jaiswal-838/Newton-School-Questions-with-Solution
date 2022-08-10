/*
Maximum Contiguous Subarray Sum
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, A of length N, find the contiguous subarray within A which has the largest sum.
Input
First line of each test case contain the number of test cases.
The first line of each test case contains an integer n, the length of the array A
and the next line contains n integers.

Constraints:
1<=T<=100
1 <= N <= 10^5
-10^6 <= A[i] <= 10^6
Output
Output an integer representing the maximum possible sum of the contiguous subarray.
Example
Input:
1
5
1 2 3 4 -10

Output:
10

Explanation:-
1+2+3+4=10*/







import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static long maxSubArray(long[] nums) {
        long max = nums[0];
        long currSum = nums[0];

        for (int i=1; i<nums.length; i++) {
            currSum += nums[i];
            
            if (nums[i] > currSum) {
                currSum = nums[i];
            }

            if (currSum > max) {
                max = currSum;
            }
        }

        return max;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while(num-->0){
            int a = sc.nextInt();

            long[] arr = new long[a];

            for(int i=0; i<a; i++){
                arr[i]=sc.nextInt();
            }

            System.out.println(maxSubArray(arr));
        }
                      // Your code here
    }
}



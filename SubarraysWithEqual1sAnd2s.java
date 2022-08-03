/*
Subarrays with equal 1s and 0s
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr[] of size N containing 0s and 1s only. The task is to count the subarrays having an equal number of 0s and 1s.
Input
The first line of the input contains an integer N denoting the size of the array and the second line contains N space-separated 0s and 1s.

Constraints:-
1 <= N <= 10^6
0 <= A[i] <= 1
Output
For each test case, print the count of required sub-arrays in new line.
Example
Sample Input
7
1 0 0 1 0 1 1

Sample Output
8

The index range for the 8 sub-arrays are:
(0, 1), (2, 3), (0, 3), (3, 4), (4, 5)
(2, 5), (0, 5), (1, 6)*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static long SubarrayEqual(long arr[], int n) {

        Map<Integer, Integer> um = new HashMap<>();
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += (arr[i] == 0) ? -1 : arr[i];
            um.put(curr_sum, um.get(curr_sum) == null ? 1 : um.get(curr_sum) + 1);
        }
        long count = 0;
        for (Map.Entry<Integer, Integer> itr : um.entrySet()) {
            if (itr.getValue() > 1) {
                count += ((itr.getValue() * (itr.getValue() - 1)) / 2);
            }
        }
        if (um.containsKey(0)) {
            count += um.get(0);
        }
        return count;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int l = (int) n;
        long[] arr = new long[l];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(SubarrayEqual(arr, l));
    }
}
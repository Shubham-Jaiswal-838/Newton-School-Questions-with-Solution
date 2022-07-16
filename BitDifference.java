/*
Bit difference
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers, your task is to calculate the sum of bit difference in all pairs which can be formed.
Input
The first line of input contains a single integer N, the second line of input contains N space separated integers depicting values of the array.

Constraints:-
1 <= N <= 100000
0 <= Arr[i] <= 1000000000
Output
Print the sum of bit difference of all possible pairs.

Note:- Since the answer can be quite large print your answer modulo 109 + 7
Example
Sample Input:-
2
1 3

Sample Output:-
2

Explanation:-
(1, 1) = 0
(1, 3) = 1
(3, 1) = 1
(3, 3) = 0

Sample Input:-
2
1 2

Sample Output:-
4*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    long ans=0;
    long arr[]= new long[n];
    for(int i =0; i <n; i++){
        arr[i]= s.nextLong();

    }
            for (int i = 0; i < 32; i++) {
            long count = 0;
            for (int j = 0; j < n; j++)

                if ((arr[j] & (1 << i)) != 0)
                    count++;

            ans += (count * (n - count) * 2);

        }
        System.out.print(ans%1000000007);
    }

}
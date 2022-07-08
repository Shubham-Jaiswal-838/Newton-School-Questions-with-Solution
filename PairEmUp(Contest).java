/*
Pair Em Up (Contest)
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements where N is even. You have to pair up the elements into N/2 pairs such that each element is in exactly 1 pair. You need to find minimum possible X such that there exists a way to pair the N elements and for no pair sum of its elements is greater than X.
Input
First line contains N.
Second line contains N space separated integers, denoting array.

Constraints:
1 <= N <= 100000
1 <= elements of the array <= 1000000000
Output
Print a single integer, minimum possible X.
Example
Sample Input
4
3 1 1 4

Sample Output
5

Explanation: we can pair (1, 3) and (1, 4) so all pairs have sum less than or equal to 5.*/


import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework
class Main{
public static void main(String args[]){
int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int maxi = -1;
        for(int i=0; i<n; i++) {
            int cur = a[i] + a[n-i-1];
            if(maxi<cur)
                maxi = cur;
        }
        System.out.println(maxi);
        }
}
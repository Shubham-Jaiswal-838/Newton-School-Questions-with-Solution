/*
GCD frequency
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer array A of size N. Find the sum of GCD (Greatest Common Divisor) of all elements with their frequency.
Input
First line contains an integers N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 1000
0 <= Ai<= 10^5
Output
Print the sum of GCD of all elements with their frequency.
Example
Sample Input 1:
3
1 2 3

Output
3

Explanation:
gcd(1, 1) + gcd(2, 1) + gcd(3, 1) = 1+1+1 = 3

Sample Input 2:
6
3 6 6 9 3 3

Output
14

Explanation
gcd(3, 3) + gcd(6, 2) + gcd(6, 2) + gcd(9, 1) + gcd(3, 3) + gcd(3, 3)= 3+2+2+1+3+3= 14*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int gcd(int a, int b){
        if(b==0) return  a;
        return gcd(b, a%b);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int freq[] = new int[1000001];
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr[i] = num;
            freq[num] = freq[num]+1;
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + gcd(arr[i], freq[arr[i]]);
        }
        System.out.println(sum);
    }
}


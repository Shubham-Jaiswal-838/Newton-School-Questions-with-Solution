/*
Sum(Large)
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b your task is to print the summation of these two numbers
Input
Input contains a single line containing two space separated integers a and b.

Constraints:-
1 <= a, b <= 1020000
Output
Print the sum of a and b.
Example
Sample Input:-
3 8

Sample Output:-
11

Sample Input:-
15 1

Sample Output:-
16*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;  
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // long a = sc.nextLong();
        // // System.out.println();
        // long b= sc.nextLong();
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger(); 
        BigInteger sum = a.add(b);

        System.out.println(sum);
                      // Your code here
    }
}
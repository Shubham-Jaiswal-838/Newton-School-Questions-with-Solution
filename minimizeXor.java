/*
Minimize XOR
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.
Input
First line denotes N, the size of the array.
Next line denotes N space-separated array elements.

Constraints:
2 <= N <= 100000
0 <= A[i] <= 10^7
Output
Print a single integer denoting minimum xor value
Example
Sample Input
4
0 2 5 7

Sample Output
2

Explanation:
0 xor 2 = 2

Sample Input
4
0 4 7 9

Sample Output
3*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++){
				a[i]= sc.nextInt();
			}
			Arrays.sort(a);
			int min = a[0]^a[1];
			for(int i=0;i<n-1;i++){
				if((a[i]^a[i+1])<min)
				min=a[i]^a[i+1];
			}
			System.out.println(min);
	}
}
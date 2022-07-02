/*
Maximum difference array
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers of size N, your task is to find the maximum parity index of this array.
Parity Index is the maximum difference between two indices i and j (1 <= i <= j <= N) of an array A such that Ai < Aj.
Input
First line of contains a single integer N, next line contains N space separated integers depicting the values of array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 100000
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
Example
Sample Input:-
5
1 2 3 4 5

Sample Output:-
4

Explanation:
The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0]


Sample Input:-
5
5 4 3 2 1

Sample Output:-
-1*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
            int arr[] = new int[n];
	for(int i=0; i<n; i++){
		arr[i] = sc.nextInt();
	}

	//pre processing
	int min[] = new int[n];
	min[0] = arr[0];
	for(int i=1; i<n; i++){
		min[i] = Math.min(arr[i],min[i-1]);
	}

	int max[] = new int[n];
	max[n-1] = arr[n-1];
	for(int i=n-2; i>=0; i--){
		max[i] = Math.max(arr[i],max[i+1]);
	}

	//main task

	int i=0, j=0, diff=-1;
	while(i<n && j<n){
		if(min[i] < max[j]){
			diff = Math.max(diff,j-i);
			j = j+1;
		}else{
			i = i+1;
		}
	}
	System.out.print(diff);          // Your code here
	}
}
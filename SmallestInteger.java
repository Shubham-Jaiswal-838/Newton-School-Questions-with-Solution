/*
Smallest Integer
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers, your task is to find the smallest integer such that it cannot be represented as the sum of any subset of the given array.
Input
First line of input contains a single integer N. Next line of input contains N space-separated integers depicting the values of the array.

Constraints:-
1 <= N <= 100000
1 <= arr[i] <= 1000000
Output
Print the minimum integer that cannot be represented as sum of elements of any subset of given
Example
Sample Input:-
3
1 2 5

Sample Output:-
4

Sample Input:-
4
1 2 4 8

Sample Output:-
16*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static long findSmallest(long arr[], int n)
	{
		long res = arr[0]; // Initialize result

		Arrays.sort(arr);

		for (int i = 0; i < n; i++)
		{
		if(arr[i] > res){
			return res;
		}
		else{
			res+=arr[i];
		}
		}
			
		return res;
	}

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long[] arr = new long[num];
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        int n = arr.length;
        System.out.println(findSmallest(arr, n));
		
	}
}
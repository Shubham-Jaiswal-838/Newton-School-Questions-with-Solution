/*
Sort by Absolute Difference
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements and a number K. The task is to arrange array elements according to the absolute difference with K, i. e., element having minimum difference comes first and so on.


Note : If two or more elements are at equal distance arrange them in same sequence as in the given array.
Input
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of test case contains two space separated integers N and K. Second line of each test case contains N space separated integers.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= K <= 10^4
1 <= A[i] <= 10^4

Sum of N over all test cases does not exceed 2*10^5
Output
For each test case print the given array in the order as described above.
Example
Input:
3
5 7
10 5 3 9 2
5 6
1 2 3 4 5
4 5
2 6 8 3

Output:
5 9 10 3 2
5 4 3 2 1
6 3 2 8

Explanation:
Testcase 1: Sorting the numbers accoding to the absolute difference with 7, we have array elements as 5, 9, 10, 3, 2.
Testcase 2: Sorting the numbers according to the absolute difference with 6, we have array elements as 5 4 3 2 1.
Testcase 3: Sorting the numbers according to the absolute difference with 5, we have array elements as 6 3 2 8.*/



import java.io.*;
import java.util.*;

class Main
{

	// Function to sort an array according absolute
	// difference with x.
	static void rearrange(int[] arr, int n, int x)
	{
			TreeMap<Integer, ArrayList<Integer>> m =
									new TreeMap<>();
			
			// Store values in a map with the difference
			// with X as key
			for (int i = 0; i < n; i++)
			{
				int diff = Math.abs(x - arr[i]);
				if (m.containsKey(diff))
				{
					ArrayList<Integer> al = m.get(diff);
					al.add(arr[i]);
					m.put(diff, al);
				}
				else
				{
						ArrayList<Integer> al = new
									ArrayList<>();
						al.add(arr[i]);
						m.put(diff,al);
				}
			}

			// Update the values of array
			int index = 0;
			for (Map.Entry entry : m.entrySet())
			{
				ArrayList<Integer> al = m.get(entry.getKey());
				for (int i = 0; i < al.size(); i++)
						arr[index++] = al.get(i);
			}
	}

	// Function to print the array
	static void printArray(int[] arr, int n)
	{
			for (int i = 0; i < n; i++)
				System.out.print(arr[i] + " ");

                System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num-->0){
            int a = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[a];
            for(int i=0; i<a; i++){
                arr[i]=sc.nextInt();
            }

			int n = arr.length;
			rearrange(arr, n, x);
			printArray(arr, n);

        }
		
	}
}
/*
GCD Pairs (Contest)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of N elements. Find the maximum value of GCD(Arr[i], Arr[j]) where i != j.
Input
First line of input contains a single integer N.
Second line of input contains N space separated integers, denoting array Arr.

Constraints:
2 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Print the maximum value of GCD(Arr[i], Arr[j]) where i != j.
Example
Sample Input 1
5
2 4 5 2 2

Sample Output 1
2

Explanation: We can select index 1 and index 4, GCD(2, 2) = 2

Sample Input 2
6
4 3 4 1 6 5

Sample Output 2
4*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int findMaxGCD(int arr[], int n)
    {
        int high = 0;
        for (int i = 0; i < n; i++)
            high = Math.max(high, arr[i]);
      
        int divisors[] =new int[high + 1];
      
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= Math.sqrt(arr[i]); j++)
            {
                if (arr[i] % j == 0)
                {
                    divisors[j]++;
      
                    if (j != arr[i] / j)
                        divisors[arr[i] / j]++;
                }
            }
        }
      
        for (int i = high; i >= 1; i--)
            if (divisors[i] > 1)
                return i;
        return 1;
    }

	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print(findMaxGCD(arr,n));
	}
}

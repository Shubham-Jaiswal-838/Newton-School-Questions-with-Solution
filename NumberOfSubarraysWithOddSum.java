/*
Number of Subarrays With Odd Sum
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of integers, find the number of subarrays with an odd sum.
Input
First line contains an integers N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 10^5
1 <= Ai <= 10^5
Output
Print the number of subarrays with an odd sum.
Example
Sample Input 1:
3
1 3 5

Output
4

Explanation:
All subarrays are [1], [1, 3], [1, 3, 5], [3], [3, 5], [5]
All sub- arrays sum are [1, 4, 9, 3, 8, 5].
Odd sums are [1, 9, 3, 5] so the answer is 4.

Sample Input 2:
3
2 4 6

Output
0

Explanation:
All subarrays are [2], [2, 4], [2, 4, 6], [4], [4, 6], [6]
All sub- arrays sum are [2, 6, 12, 4, 10, 6].
All sub- arrays have even sum and the answer is 0.*/





import java.io.*;
import java.util.*;

class Main{
	static long countOddSum(long ar[], long n)
	{
		long temp[] = { 1, 0 };

		long result = 0, val = 0;

		for (int i = 0; i <= n - 1; i++) {
			// 2 is added to handle negative numbers
			val = ((val + ar[i]) % 2 + 2) % 2;

			// Increment even/odd count
			temp[(int)val]++;
		}
		// An odd can be formed by an even-odd pair
		result = temp[0] * temp[1];
		return (result);
	}

	// Driver code
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        long[] ar = new long[num];
        for(int i=0; i<num; i++){
            ar[i]=sc.nextLong();
        }
		long n = ar.length;
		System.out.println(countOddSum(ar, n));
	}
}



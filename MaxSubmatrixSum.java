/*
Max submatrix sum
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a non- empty matrix A, find the maximum sum of a non-empty submatrix.

A submatrix is a matrix formed by some contiguous rows and some contiguous columns from the given matrix.
Input
The first line contains two integers N and M denoting the rows and column of the matrix A.

1 <= N, M <= 500
-100 <= A[i][j] <= 100
Output
Print a single integer denoting the maximum submatrix sum for the given matrix
Example
Sample Input:
2 3
-1 0 1
2 -2 3

Sample Output:
4

Explanation:
Submatrix made from 3rd column gives maximum sum. All other submatrices have a less sum.*/




import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	private static int maxSumRectangle(int[][] mat)
	{
		int m = mat.length;
		int n = mat[0].length;
		int preSum[][] = new int[m + 1][n];

		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				preSum[i + 1][j] =
				preSum[i][j] + mat[i][j];
			}
		}

		int maxSum = -1;
		int minSum = Integer.MIN_VALUE;
		int negRow = 0, negCol = 0;
		int rStart = 0, rEnd = 0, cStart = 0, cEnd = 0;
		for (int rowStart = 0;
			rowStart < m;
			rowStart++)
		{
			for (int row = rowStart; row < m; row++)
			{
				int sum = 0;
				int curColStart = 0;
				for (int col = 0; col < n; col++)
				{
					sum += preSum[row + 1][col]
						- preSum[rowStart][col];
					if (sum < 0) {
						if (minSum < sum) {
							minSum = sum;
							negRow = row;
							negCol = col;
						}
						sum = 0;
						curColStart = col + 1;
					}
					else if (maxSum < sum)
					{
						maxSum = sum;
						rStart = rowStart;
						rEnd = row;
						cStart = curColStart;
						cEnd = col;
					}
				}
			}
		}

		return maxSum == -1 ? minSum : maxSum;
	}

	// Driver Code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				arr[i][j]=sc.nextInt();
			}
		}	
		System.out.println(maxSumRectangle(arr));
	}
}
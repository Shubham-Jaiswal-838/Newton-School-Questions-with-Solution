/*
Chessboard Formation
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An N x N board contains only 0s and 1s. In each move, you can swap any 2 rows with each other, or any 2 columns with each other.

What is the minimum number of moves to transform the board into a "chessboard" - a board where no 0s and no 1s are 4-directionally adjacent? If the task is impossible, return -1.
Input
The input line contains T, denoting the number of test cases. Each test case contains two lines. First-line contains N, size of the matrix. Second-line contains N*N elements of binary matrix.

Constraints:
1 <= T <= 100
2 <= N <= 50
0 <= mat[i][j] <= 1
Output
For each testcase you need to print the minimum number of swaps required.
Example
Input:
2
4
0 1 1 0
0 1 1 0
1 0 0 1
1 0 0 1
3
0 1 0
1 0 1
1 1 0

Output:
2
-1

Explanation:
One potential sequence of moves is shown below, from left to right:

0110 1010 1010
0110 --> 1010 --> 0101
1001 0101 1010
1001 0101 0101

The first move swaps the first and second columns.
The second move swaps the second and third row.*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		while(TC>0)
		{
			int n = sc.nextInt();
			int a[][] = new int[n][n];

			for(int i = 0;i<n;i++)
			{
				for(int j = 0;j<n;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println(Chess(a));

			TC--;
		}
	}

	public  static int Chess(int b[][]) 
	{
        int N = b.length, rowSum = 0, colSum = 0, rowSwap = 0, colSwap = 0;

        for (int i = 0; i < N; ++i) 
		{	
			for (int j = 0; j < N; ++j)
            	
				if ((b[0][0] ^ b[i][0] ^ b[0][j] ^ b[i][j]) == 1) 
					return -1;
		}

		for (int i = 0; i < N; ++i) 
		{
            rowSum += b[0][i];
            
			colSum += b[i][0];
            
			if (b[i][0] == i % 2) 
				rowSwap++;
            
			if (b[0][i] == i % 2) 
				colSwap++;
        }
        if (rowSum != N/2 && rowSum != (N+1)/2) 
			return -1;
        
		if (colSum != N/2 && colSum != (N+1)/2) 
			return -1;
        
		if (N % 2 == 1) 
		{
            if (colSwap % 2 == 1) 
				colSwap = N - colSwap;
            
			if (rowSwap % 2 == 1) 
				rowSwap = N - rowSwap;
        } 
		else 
		{
            colSwap = Math.min(N-colSwap, colSwap);
            
			rowSwap = Math.min(N-rowSwap, rowSwap);
        }

        return (colSwap + rowSwap) / 2;
    }
}
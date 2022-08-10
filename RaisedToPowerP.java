/*
Raised to the power p
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary NxN matrix A. Return A raised to the power p.
Print each element of the matrix modulo 10^9+7.
Input
First line contains two numbers, N and P, denoting the size of the matrix A and the power it is raised to respectively
Next N lines contain N numbers each representing the elements of the matrix A.

Contraints
1 <= N <= 100
1 <= p <= 10^9
Aij is either 0 or 1
Output
Print matrix A raised to the power p, each element modulo (10^9+7)
Example
Input
3 4
1 0 0
1 1 1
0 1 0

Output
1 0 0
7 5 3
4 3 2*/






import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	static long mod = (long) 1e9 + 7;
	static long[][] mul(long [][] A, long[][] B, int n){

		long result[][] = new long[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					result[i][j] = ((result[i][j] % mod) + ((A[i][k] * B[k][j]) % mod)) % mod;
				}
			}
		}
		return result;
	}

	static long[][] pow(long matrix[][], int n, long p){
		long result[][] = new long[n][n];
		for(int i = 0; i < n; i++){
			result[i][i] = Long.valueOf(1);
		}

		while(p > 0){
			if(p % 2 == 1){
				result = mul(result, matrix, n); //result = matrix ^ 4
			}	
			matrix = mul(matrix, matrix, n); // matrix^4
			p /= 2; //p = 1
		}

		return result; // matrix ^ 4
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long p = sc.nextLong();
		
		long matrix[][] = new long[n][n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextLong();
				matrix[i][j] %= mod;
			}
		}

		long[][] result = pow(matrix, n, p);

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
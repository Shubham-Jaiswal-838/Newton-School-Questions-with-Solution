/*
Rotate the matrix
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degree and 180 degree.
Input
First line contains N.
N lines follow each containing N space seperated integers.

2 <= N <= 100
1 <= Mat[i][j] <= 10000
Output
Output 2*N+1 lines.
First N lines should contain the Matrix rotated by 90 degrees.
Then print a blank line.
Then N lines should contain the Matrix rotated by 180 degrees.
Example
Sample Input
2
3 4
7 6

Sample Output
7 3
6 4

6 7
4 3

Sample Input:
2
1 2
3 4

Sample Output:
3 1
4 2

4 3
2 1*/




import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
        Scanner my=new Scanner(System.in);
		int N= my.nextInt();
		int arr[][]=new int[N][N];
		for(int i=N-1;i>=0;i--){
			for(int j=N-1;j>=0;j--){
				arr[i][j]=my.nextInt();
			}
		  }
		for(int i=N-1;i>=0;i--){
			for(int j=0;j<N;j++){
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
	}
		System.out.println();
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}
}
}
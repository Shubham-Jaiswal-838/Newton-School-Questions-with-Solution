/*
Transpose of a matrix
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program that creates an N*N matrix. Fill each cell with the sum of row number and column number (based on 0 indexes, ie indices begin from base 0), take its transpose and print it.
Where the transpose of a matrix is a new matrix whose rows and the columns are interchanged to that of original matrix.
Input
Input contains a single integer N.

Constraints:-
1<=N<=500
Output
Print the NxN matrix.
Example
Sample input
2

Sample output
0 1
1 2

Explanation:-
0+0 0+1
1+0 1+1

Sample Input:-
3

Sample Output:-
0 1 2
1 2 3
2 3 4*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=i+j;
            }
        }
        for(int[] transpose: arr){
            for(int tMatrix: transpose){
                System.out.print(tMatrix+" ");
            }
            System.out.println();
        }
                      // Your code here
    }
}
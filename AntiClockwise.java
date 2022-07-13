/*
Anti clockwise
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an N*N matrix. Print the elements of the matrix in anticlockwise order (see the sample for better understanding).
Input
First line contains N.
N lines follow each containing N space seperated integers.

Constraints:-
2 <= N <= 500
1 <= Mat[i][j] <= 1000
Output
Output N*N integers in a single line separated by spaces, which are the elements of the matrix in anti-clockwise order.
Example
Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample output
1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7

Sample Input
3
1 2 3
4 5 6
7 8 9

Sample output
1 4 7 8 9 6 3 2 5*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
//    public class spiral_anticlockwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int m = in.nextInt();
        int n = in.nextInt();
        int [][] arr= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int count=0;
        int mincol=0;
        int minrow=0;
        int maxrow=n-1;
        int maxcol=n-1;
        while(count<n*n){
            for(int i=minrow;i<=maxrow;i++){
                System.out.print(arr[i][mincol]+" ");
                count++;
            }
            for(int i=mincol+1;i<=maxcol;i++){
                System.out.print(arr[maxrow][i]+" ");
                count++;
            }
            for(int i=maxrow-1;i>=minrow;i--){
                System.out.print(arr[i][maxcol]+" ");
                count++;
            }
            for(int i=maxcol-1;i>mincol;i--){
                System.out.print(arr[minrow][i]+" ");
                count++;
            }
            minrow++;
            mincol++;
            maxrow--;
            maxcol--;
        }
    }
}  // Your code here
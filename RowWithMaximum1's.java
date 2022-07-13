/*
Row with maximum 1's
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a boolean matrix of size N*M in which each row is sorted your task is to print the index of the row containing maximum 1's. If multiple answer exist print the smallest one.
Input
First line contains two space separated integers denoting values of N and M. Next N lines contains M space separated integers depicting the values of the matrix.

Constraints:-
1 < = M, N < = 1000
0 < = Matrix[][] < = 1
Output
Print the smallest index (0 indexing) of a row containing the maximum number of 1's.
Example
Sample Input:-
3 5
0 1 1 1 1
0 0 0 1 1
0 0 0 1 1

Sample Output:-
0

Sample Input:-
4 4
0 1 1 1
1 1 1 1
0 0 1 1
1 1 1 1

Sample Output:-
1*/


import java.util.*;
import java.io.*;

 public class Main {
  static int rowWithMax1s(int arr[][], int n, int m)
    {
        int R = n;
        int C = m;
        // Initialize first row as row with max 1s
        int j,max_row_index = 0;
            j = C - 1;
 
        for (int i = 0; i < R; i++) {
            // Move left until a 0 is found
            while (j >= 0 && arr[i][j] == 1) {
                j = j - 1; // Update the index of leftmost 1
                       // seen so far
                max_row_index = i; // Update max_row_index
            }
        }
          if(max_row_index==0&&arr[0][C-1]==0)
              return -1;
        return max_row_index;
    }

      public static void main(String args[]){
     Scanner sc = new Scanner(System.in); 
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            arr[i][j]=sc.nextInt();

        }
    }
    System.out.println(rowWithMax1s(arr, n, m));
      }
}

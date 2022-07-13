/*
Diagonal Sum
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of size N*N, your task is to find the sum of the primary and secondary diagonal of the matrix.

For Matrix:-
M00 M01 M02
M10 M11 M12
M20 M21 M22

Primary diagonal:- M00 M11 M22
Secondary diagonal:- M02 M11 M20
Input
The first line of input contains a single integer N, The next N lines of input contains N space-separated integers depicting the values of the matrix.

Constraints:-
1 <= N <= 500
1 <= Matrix[][] <= 100000
Output
Print the sum of primary and secondary diagonal separated by a space.
Example
Sample Input:-
2
1 4
2 6

Sample Output:-
7 6

Sample Input:-
3
1 4 2
1 5 7
3 8 1

Sample Output:-
7 10*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static void diagonalSum(int[][] arrPara){
        int suml=0, sumR=0;
     for(int i=0; i<arrPara.length; i++){
         for(int j=0;  j<arrPara.length; j++){
           if(i==j){
               suml+=arrPara[i][j];

           }
           if(i+j == arrPara.length-1){
               sumR +=arrPara[i][j];

           }
         }
       
     }
     System.out.println(suml+" "+ sumR);

     
    }


     public static void main(String args[]){
     Scanner sc = new Scanner(System.in); 
    
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            arr[i][j]=sc.nextInt();

        }
    }
     diagonalSum(arr);
   
     }
}
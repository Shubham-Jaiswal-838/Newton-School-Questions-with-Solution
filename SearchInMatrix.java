/*
Search in matrix
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an n x n matrix and a number x, find whether given element present in matrix or not, every row and column is sorted in increasing order. The designed algorithm should have linear time complexity.
Input
first line contain two element n and x.
next n line contain n space separated integer i. e. element of matrix.

Constraints:
1<=n,x<=1000
Output
print "Yes" is given element is present in matrix otherwise print "No".
Example
Sample Input 1:
3 5
1 2 3
2 4 5
3 6 9
Sample Output 1:
Yes

Explanation :
5 present in given matrix at 2nd row and third column.*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m= sc.nextInt();

 boolean noPresent =  false;
        int[][] arr = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=sc.nextInt();

             
            }
            
        }
        
        // int[][] arr = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==m){
                 noPresent=true;
                break;

            }

             
            }
            
        }
        if(noPresent){
            System.out.print("Yes");
        }else {
              System.out.print("No");
        }
          
                      // Your code here
    }
}
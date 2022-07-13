/*
Grid and phrase
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an n*m grid which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?
Input
First line: Two integer n and m, where n denotes the number of rows and m denotes the number of columns in the grid
Next n lines: Each line must contain a string of length m which contains lower- case English letters only

Constraints:
1<=n, m<=100
Output
Print the number of times the word “saba” appears in the grid.

Example
Sample Input 1:
5 5
s a f e r
a m j a d
b a b o l
a a r o n
s o n g s

Sample Output 1:
2*/



import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[] ){
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        // String str=sc.nextLine();
        char ch[][]= new char[n][m];

        for(int i=0;i<n;i++){
            // str=sc.nextLine();
            for(int j=0;j<m;j++){
                ch[i][j]=sc.next().charAt(0);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ch[i][j]=='s'){
                    if(j+3<m){
                        if(ch[i][j+1]=='a' && ch[i][j+2]=='b' && ch[i][j+3]=='a'){
                            count++;
                        }
                    }
                    if(i+3<n){
                        if(ch[i+1][j]=='a' && ch[i+2][j]=='b' && ch[i+3][j]=='a'){
                            count++;
                        }
                    }
                    if(i+3<n && j+3<m){
                        if(ch[i+1][j+1]=='a' && ch[i+2][j+2]=='b' && ch[i+3][j+3]=='a'){
                            count++;
                        }
                    }
                     if(j+3<m && i-3>=0){
                        if(ch[i-1][j+1]=='a' && ch[i-2][j+2]=='b' && ch[i-3][j+3]=='a'){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
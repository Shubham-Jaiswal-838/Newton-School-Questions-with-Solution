/*
Newton School Problem
Problem Statement
Given a number N for each i (1 < = i < = N), you have to print the number except :-
For each multiple of 3, print "Newton" instead of the number.
For each multiple of 5, print "School" instead of the number.
For numbers that are multiples of both 3 and 5, print "NewtonSchool" instead of the number.
Input
The first line of the input contains N.

Constraints
1 < = N < = 1000
Output
Print N space separated number or Newton School according to the condition.
Example
Sample Input:-
3

Sample Output:-
1 2 Newton

Sample Input:-
5

Sample Output:-
1 2 Newton 4 School*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
           if(i%15==0){ 
               System.out.print("NewtonSchool"+" ");                                          
           }else if(i%5==0){
               System.out.print("School"+" ");
           }else if(i%3==0){  
                  System.out.print("Newton"+" ");
           }else{
               System.out.print(i+" ");
           }
       }
    //    1 2 Newton 4 School Newton 7 8 Newton School 11 Newton 13 14 Newton 
                      // Your code here
    }
}
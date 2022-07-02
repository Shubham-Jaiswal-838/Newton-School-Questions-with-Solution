/*
Numbers with the digit d
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers N and D, your task is to find the numbers between 1 to N which contains the digit D at least 1 time.
Input
Input contains only two integers N and D.

Constraints:-
1 < = N < = 100000
1 < = D < = 9
Output
Print all the numbers from 1 to N which contains the digit D in it separated by space in non decreasing order.
Example
Sample Input:-
20 5

Sample Output:-
5 15

Sample Input:-
15 1

Sample Output:-
1 10 11 12 13 14 15*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main{
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     int a = sc.nextInt();
     int b= sc.nextInt();
      
      String c = String.valueOf(b);
      for(int i=0; i<=a; i++){
          String d = String.valueOf(i);
          if(d.contains(c)){
              System.out.print(d+" ");
          }
      }
 }
}
/*
Vowels(contest)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string of length N, count the number of vowels present at even places.
Input
First line of input contains a single integer N. Second line contains a string of size N.

Constraints:-
1 <= N <= 100000

Note:- String will contain only lowercase english letter
Output
Print the number of vowels present at the even places
Example
Sample Input:-
12
newtonschool

Sample Output:-
2

Sample Input:-
5
basid

Sample Output:-
2*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner kb = new Scanner(System.in);
       int n = kb.nextInt();
       String s = kb.next();
       char ch[] = new char[n];
       for(int i=0; i<n; i++)
           ch[i] = s.charAt(i);
           int c=0;
           for(int i=1; i<n; i+=2){
               if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o'|| ch[i]=='u')
               c++;
               }
               System.out.println(c);
               kb.close();
           }
}
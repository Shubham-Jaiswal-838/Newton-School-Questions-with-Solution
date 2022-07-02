/*
The Dice Problem
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a cubic dice with 6 faces. All the individual faces have a numbers printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to find the number on the opposite face of the cube.
Input
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows. Each test case contains a single line of the input containing a positive integer N.

Constraints:
1 <= T <= 100
1 <= N <= 6
Output
For each testcase, print the number that is on the opposite side of the given face.
Example
Input:
2
6
2

Output:
1
5

Explanation:
Testcase 1: For dice facing number 6 opposite face will have the number 1.*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            n=sc.nextInt();
            if(n==1)
        { 
              System.out.println("6");
            
        }
        else if(n==2)
        {   System.out.println("5");
            
        }
        else if(n==3)
        {   System.out.println("4");
            
        }
        else if(n==4)
        {   System.out.println("3");
            
        }
        else if(n==5)
        {   System.out.println("2");
            
        }
        else if(n==6)
        {   System.out.println("1");
            
        }
                     
    }}}
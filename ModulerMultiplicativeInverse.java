/*
Modular multiplicative inverse
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers ‘a’ and ‘m’. The task is to find modular multiplicative inverse of ‘a’ under modulo ‘m’.
Note: Print the smallest modular multiplicative inverse.
Input
First line of input contains a single integer T denoting number of test cases, next T lines contains two space separated integers depicting value of a and m.

Constraints :-
1 < = T < = 100
1 < = m < = 100
1 < = a < = m
Output
For each test case, in a new line print the modular multiplicative inverse if exist else print -1.
Example
Sample Input:-
2
3 11
10 17

Sample Output:-
4
12*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int modInverse(int a, int m)
	{
	
		for (int x = 1; x < m; x++)
			if (((a%m) * (x%m)) % m == 1){
				return x;

            }
		    return -1;
	}

  
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){

		int a = sc.nextInt();
        int m = sc.nextInt();
	
		// Function call
		System.out.println(modInverse(a, m));
        }

	}

}
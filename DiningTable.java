/*
Dining Table
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has guests coming over to her house for dinner. She has a circular dining table of radius R and circular plates of radius r. Now she wonders if her table has enough space for all the guests, considering each guest takes one plate and the plate should lie completely inside the table.
Input
The input contains three space- separated integers N(Number of guests), R, and r.

Constraints:-
1 <= N <= 100
1 <= r, R <= 1000
Output
Print "Yes" if there is enough space, else print "No".
Example
Sample Input:-
4 10 4

Sample Output:-
Yes

Sample Input:-
5 10 4

Sample Output:-
No*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import static java.lang.Math.*;

class Main {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		double n =  sc.nextDouble();
		double R =  sc.nextDouble();
		double r =  sc.nextDouble();
		
		if(r>R || n>1&& (R-r)*sin(acos(-1.0)/n)+1e-8<r)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}            
	}
}
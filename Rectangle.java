/*
Rectangle
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Give integer values M and N. Using the character ‘*’ draw a rectangle of height M and breadth N.
Input
The input contains two integers M and N.

Constraints:-
3 <= M, N <= 20
Output
Print the rectangle as shown in the example
Example
Sample Input:-
3 3

Sample Output:-
***
* *
***

Sample Input:-
5 3

Sample Output:-
***
* *
* *
* *
****/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int B = sc.nextInt();

		for(int i = 1; i<=H; i++){
			for(int j = 1; j<=B; j++){
				if((i==1 || i==H) || (j==B || j==1)){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}

			}
			System.out.println();
		} 
	}
}
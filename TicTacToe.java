/*
Tic Tac Toe
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
Game is played in pairs.
If Rick plays against anyone, Rick wins.
If Jerry plays against anyone, Jerry Loses.
A game between any other players is a draw.
Given a pair of players, find who wins the game or if the game is draw.
Input
Input Contains two space separated characters denoting the players that will have the match.
R denotes Rick.
J denotes Jerry.
B denotes Beth.
M denotes Morty.
S denotes Summer.
Output
If the game is draw print 'D', else print the first letter of the name of the player who wins in capital.
Example
Sample Input 1
R S

Sample Output 1
R

Sample Input 2
B J

Sample Output 2
B

Sample Input 3
M S

Sample Output 3
D
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner scan = new Scanner(System.in);
					  String str = scan.nextLine();
					  String[] name = str.split(" ");
					  if (name[0].equals("R") || name[1].equals("R")){
						  System.out.println("R");
					  }
					  else if(name[0].equals("J") || name[1].equals("J")){
						  if (name[0].equals("J")){
							  System.out.println(name[1]);
						  }
						  else{
							  System.out.println(name[0]);
						  }
					  }
					  else{
						  System.out.println("D");
					  }
	}
}
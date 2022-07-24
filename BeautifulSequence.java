/*
Beautiful sequence
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has a string S consisting of lowercase English letters. He defines S′ to be the string after removing all "a" characters from S (keeping all other characters in the same order). He then generates a new string T by concatenating S and S′. In other words, T=S+S′.

You are given a string T. Your task is to find some S that Bob could have used to generate T. It can be shown that if an answer exists, it will be unique.
Input
The first line contains a single string S.

Constraints:
1<=|S|<=100000
Output
Print a string S that could have generated T. It can be shown if an answer exists, it is unique. If no string exists, print ":(" (without double quotes, there is no space between the characters).
Example
Sample Input 1:
ababacacbbcc

Sample Output 1:
ababacac

Explanations:
we have s= "ababacac", and s′= "bbcc", and t=s+s′= "ababacacbbcc".*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		String s2 = S.replaceAll("a","");

		String firstHalf = s2.substring(0, s2.length()/2);
		String secondHalf = s2.substring(s2.length()/2, s2.length());

		boolean isValid = firstHalf.equals(secondHalf);

		int sizeOfS2 = s2.length()/2;

		String ans = S.substring(0,S.length()-sizeOfS2);

		if(!isValid){
			System.out.println(":(");
		}else {
			System.out.println(ans);
		}     
	}
}
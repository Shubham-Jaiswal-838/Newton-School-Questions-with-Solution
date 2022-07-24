/*
FLAMES ?
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
They say friendship is greater than love. Why not play the famous game "FLAMES".
The rules are super simple. Given two strings (all lowercase), remove all the letters that are common to both the strings from both the strings. You cannot erase two characters corresponding to one character.
For example, in the case
String 1: saumya
String 2: ansh
You can remove only 1 'a' and 1 's' from both the strings.
Remaining strings are:
String 1: umya
String 2: nh

Now all you need to do is find the sum of the remaining strings length % 6.

Output:
If obtained value is 1, output "Friends"
If obtained value is 2, output "Love"
If obtained value is 3, output "Affection"
If obtained value is 4, output "Marriage"
If obtained value is 5, output "Enemy"
If obtained value is 0, output "Siblings"
Input
You will be given two strings on different lines.

Constraints
1 <= Length of both the strings <= 100000
Output
Output a single string, the result of FLAMES test.
Example
Sample Input:-
saumya
ansh

Sample Output:-
Siblings

Explanation:-
after deleting characters :-
str1 = umya
str2 = nh
sum = 4+2
sum%6=0*/






import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	//saumya 
	//aamsuy
    //ansh
	String res[]={"Siblings","Friends","Love","Affection","Marriage","Enemy"};
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=sc.nextLine();
	char c[]=s.toCharArray();
	char c1[]=s1.toCharArray();
	Arrays.sort(c);
	Arrays.sort(c1);
	/*for(int i=0;i<c.length;i++)
	System.out.print(c[i]+" ");
	System.out.println();
	for(int i=0;i<c1.length;i++)
	System.out.print(c1[i]+" ");*/
	int i=0,j=0,c11=0;
	while(i<c.length && j<c1.length)
	{
		int ii=c[i];
		int jj=c1[j];
		if(ii==jj)
		{
			c11++;
			i++;
			j++;
		}
		else if(ii<jj)
		i++;
		else
		j++;
	}
//	System.out.println(c);
	//System.out.println(c1);
	int sl=c.length+c1.length;
	sl-=2*c11;
//	System.out.println(c11);
	System.out.println(res[sl%6]);
	
	
	}
}
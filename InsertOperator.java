/*
Insert Operator
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a sequence of numbers of size N. You have to find if there is a way to insert + or - operator in between the numbers so that the result equals K.
Input
The first line of input contains two integers N and K. The next line of input contains N space- separated integers depicting the values of the sequence.

Constraints:-
1 <= N <= 20
-10^15 <= K <= 10^15
0 <= Numbers <=10^13
Output
Print YES if possible else print NO.
Example
Sample Input:-
4 4
1 2 3 4

Sample Output:-
YES

Sample Input:-
4 1
1 2 3 4

Sample Output:-
NO*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
  public static int rec(long [] arr,long sum,int i)
  {  
	  if(i==arr.length){
		  if(sum==0)
		  return 0;
	  
		  else
	  	return 1;}
	  return rec(arr,sum-arr[i],i+1)*rec(arr,sum+arr[i],i+1);
	
  }

	public static void main (String[] args) {
                 Scanner sc=new Scanner(System.in);
				 int n=sc.nextInt();
				 long target=sc.nextLong();
				long [] arr=new long[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextLong();
			}

			int sum=rec(arr,target,0);
            
			if(sum==0)
			System.out.println("YES");
			else
			System.out.println("NO");


	}
}
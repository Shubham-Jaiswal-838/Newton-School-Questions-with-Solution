/*
Greater is better
medium
Time Limit: 1 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of N integers, For each i (1 ≤ i ≤ N) your task is to find the value of x+y,
where x is the largest number less than i such that A[x]>A[i] and (A[x] is the element present at position x.)
y is the smallest number greater than i such that A[y]>A[i]
If there is no x < i such that A[x] > A[i], then take x=−1. Similarly, if there is no y>i such that A[y]>A[i], then take y=−1.
Input
First line consists of a single integer denoting N.
Second line consists of N space separated integers denoting the array A.

Constraints:
1 ≤ N ≤ 1000000
1 ≤ A[i] ≤ 10000000000
Output
Print N space separated integers, denoting x+y for each i(1 ≤ i ≤ N)
Example
Sample Input
5
5 4 1 3 2

Sample Output
-2 0 6 1 3

Explanation:-
For element 5:- x=-1(No element exist greater than 5 in left), y=-1 (No element exist greater than 5 in right)
For element 4:- x=1, y=-1
For element 1:- x=2, y=4
For element 3:- x=2, y=-1
For element 2:- x=4, y=-1

Sample Input
5
6 4 6 8 2

Sample Output
3 4 3 -2 3*/






import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Pair{
	long first;
	long second;
	Pair(long first, long second){
		this.first = first;
		this.second = second;
	}
}

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Pair> s = new Stack<>();
		Stack<Pair> s1 = new Stack<>();

		long a[] = new long[n];
		long b[] = new long[n];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
			while(!(s.empty())){
					if(s.peek().first>a[i]){
						break;
					}
				s.pop();
			}
		    if(s.empty()){
				b[i]=-1l;
			}
			else{
				b[i]=s.peek().second+1;
			}
			Pair p = new Pair(a[i], i);
			s.push(p);
		}

		for(int i=n-1;i>=0;i--){
			while(!(s1.empty())){
				if(s1.peek().first>a[i]){
					break;
				}
				s1.pop();
			}
			if(s1.empty()){
				b[i]+=-1;
			}
			else{
				b[i]+=s1.peek().second+1;
			}
			Pair p = new Pair(a[i], i);
			s1.push(p);
		}

		for(int i=0;i<n;i++){
			System.out.print(b[i]+" ");
		}

	}
}

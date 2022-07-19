/*
Two Bits
Easy

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer X find an integer Y such that Y has exactly two set bits in its binary representaion and abs(X- Y) is minimum.
Input
Input contains a single integer X.

Constraints
1 <= X <= 10^15
Output
Print a single integer, the minimum value of abs(X- Y).
Example
Sample input 1
5

Sample output 1
0

Explanation: Y=5.

Sample input 2
1

Sample output 2
2

Explanation: Y=3*/





import java.io.*; // for handling input/output
import java.util.*; // contains Collections 

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = Long.MAX_VALUE;
		
		for(long i = 0; i < 63; i++){
			long first = (1l << i); 
			for(long j = i + 1; j < 63; j++){
				long second = (1l << j);
				long number = first | second; 
				y = Math.min(y, Math.abs(x - number)); 
			}
		}
		System.out.println(y);

	}
}

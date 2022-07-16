/*
Too many rectangles? (Group Contest: April '21)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Why Geometry?? ?

You are given 4*N+1 distinct points on the cartesian plane. Out of these points, 4*N points represent the end points of N rectangles (with axis parallel to co-ordinate axis), while one point does not belong to any of the rectangles. Report the coordinates of the point that does not belong to any of the N rectangles.
Input
The first line of the input contains an integer N.
The next 4*N+1 lines contain two integers X and Y, the coordinates of the given points.

Constraints
1 <= N <= 100000
0 <= X, Y <= 1000000
The given points always represent N rectangles and an extra point
Output
Output space separated X and Y coordinates of the extra point.
Example
Samle Input
1
1 3
1 1
3 1
1 4
3 3

Sample Output
1 4

Explanation: (1, 1), (1, 3), (3, 1), and (3, 3) represent the end of a rectangle, while (1, 4) is the extra point.*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
        // Your code here
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		
					int n = Integer.parseInt(br.readLine());
					
					int xorx = 0;
					int xory = 0;
					
					
					for (int i = 0; i < 4*n + 1; i++) {
						String inputs[] = br.readLine().split(" ");
						int x = Integer.parseInt(inputs[0]);
						int y = Integer.parseInt(inputs[1]);
						
						xorx = xorx^x;
						xory = xory^y;
					}
					
					System.out.print(xorx + " " + xory);
					
	}
}

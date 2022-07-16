/*
Triangles love
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara loves triangles. Whenever she sees three points she connects them by straight lines to form a triangle. In triangles, her favorite one is a right-angled triangle. If the triangle is not right-angled but it can be converted into one by moving one of the points exactly by distance 1 so, that all the coordinates remain integer, she calls such triangles "Special".
Given three points A, B, and C your task is to check if the formed triangle is "Right", "Special" or "Simple".
Input
The first line of input contains the position of A(Ax, Ay). The second line of input contains the position of B(Bx, By). The third line of input contains the position of C(Cx, Cy).

Constraints:-
|X|, |Y| <= 10^9
Output
Print "Right" if the triangle is right- angled, print "Special" if the triangle can be formed into a right- angled by moving one of the points exactly by distance 1, else print "Simple".
Example
Sample Input:-
0 0
2 0
0 1

Sample Output:-
Right

Sample Input:-
-1 0
2 0
0 1

Sample Output:-
Special

Sample Input:-
-1 0
2 0
10 10

Sample Output:-
Simple*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        if(cR(x1,y1,x2,y2,x3,y3)){
            System.out.println("Right");
        } else if (cR(x1+1,y1,x2,y2,x3,y3)||cR(x1-1,y1,x2,y2,x3,y3)||cR(x1,y1-1,x2,y2,x3,y3)||cR(x1,y1+1,x2,y2,x3,y3)) {
            System.out.println("Special");
        }else if (cR(x1,y1,x2-1,y2,x3,y3)||cR(x1,y1,x2+1,y2,x3,y3)||cR(x1,y1,x2,y2-1,x3,y3)||cR(x1,y1,x2,y2+1,x3,y3)) {
            System.out.println("Special");
        }else if (cR(x1,y1,x2,y2,x3-1,y3)||cR(x1,y1,x2,y2,x3+1,y3)||cR(x1,y1,x2,y2,x3,y3-1)||cR(x1,y1,x2,y2+1,x3,y3+1)) {
            System.out.println("Special");
        } else {
            System.out.println("Simple");
        }
	}
	static boolean cR(int X1, int Y1, int X2, int Y2, int X3, int Y3) {
        int A = (int)Math.pow((X2 - X1), 2) +
                (int)Math.pow((Y2 - Y1), 2);

        int B = (int)Math.pow((X3 - X2), 2) +
                (int)Math.pow((Y3 - Y2), 2);

        int C = (int)Math.pow((X3 - X1), 2) +
                (int)Math.pow((Y3 - Y1), 2);

        if ((A > 0 && B > 0 && C > 0) &&
                (A == (B + C) || B == (A + C) ||
                        C == (A + B)))
            return true;
        else
            return false;
    }
}
/*
Geometry Exam
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has an exam of geometry in which the following question is asked:-
Given three points A, B, and C. Check if there exists a point and an angle such that if we rotate the page around the point by the angle, the new position of A is the same as the old position of B, and the new position of B is the same as the old position of C.
Input
The first line of input contains the position of A(Ax, Ay). The second line of input contains the position of B(Bx, By). The third line of input contains the position of C(Cx, Cy).

Constraints:-
|X|, |Y| <= 10^9
Output
Print "Yes" if there exists a point else print "No".
Example
Sample Input:-
0 1
1 1
1 0

Sample Output:-
Yes

Explanation:-
(0.5, 0.5) by 90

Sample Input:-
1 1
0 0
1000 1000

Sample Output:-
No*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void possibleOrNot(long a1,long a2, long b1,long b2, long c1,long c2) {
        long dis1 = (long)Math.pow(b1 - a1, 2) +
                (long) Math.pow(b2 - a2, 2);

        long dis2 = (long)Math.pow(c1 - b1, 2) + (long)Math.pow(c2 - b2, 2);
        if(dis1 != dis2)
            System.out.print("No");
        else if (b1 == ((a1 + c1) / 2.0) && b2 == ((a2 + c2) / 2.0))
            System.out.print("No");
        else
            System.out.print("Yes");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long b1 = sc.nextLong();
        long b2 = sc.nextLong();
        long c1 = sc.nextLong();
        long c2 = sc.nextLong();
        possibleOrNot(a1, a2, b1, b2, c1, c2);
    }
}
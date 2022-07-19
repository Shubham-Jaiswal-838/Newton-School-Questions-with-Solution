/*
AND OR Operation
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given the following pseudocode:

code :
res = a
for i = 1 to k
if i is odd
res = res & b
else
res = res | b

You are also given the values of a, b and k. Find the value of res.
Input
First line contains of single integer t denoting number of test cases.
Each test cases consists of 3 lines where each line consists of a single integer denoting the values of a, b and k respectively.

Constraints
1<= T <= 1e5
1<= a, b, k <= 1e18
Output
Print the final value of res for each test case in a new line
Example
Sample Input :
1
4 5 1

Sample Output :
4*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
 class Main {
     public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        long ans = a&b;
        if(k==1){
        System.out.println(ans);
        } else {
          System.out.println(b);
        }

        }
     }
 }

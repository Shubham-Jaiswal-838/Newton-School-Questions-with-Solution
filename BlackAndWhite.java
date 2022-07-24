/*
Black and White
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
How many ways are there to place a black and a white knight on an N * M chessboard such that they do not attack each other? The knights have to be placed on different squares. A knight can move two squares horizontally and one square vertically (L shaped), or two squares vertically and one square horizontally (L shaped). The knights attack each other if one can reach the other in one move.
Input
The first line contains the number of test cases T. Each of the next T lines contains two integers N and M which is size of matrix.

Constraints:
1 <= T <= 100
1 <= N, M <= 100
Output
For each testcase in a new line, print the required answer, i.e, number of possible ways to place knights.
Example
Sample Input:
3
2 2
2 3
4 5

Sample Output:
12
26
312

Explanation:
Test Case 1: We can place a black and a white knight in 12 possible ways such that none of them attacks each other.*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;


// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void main (String[] args) throws IOException {
    StringBuilder output = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int T = Integer.parseInt(s);
        for (int t=0; t<T; t++) {
            s = reader.readLine();
            int index = s.indexOf(' ');
            long N = Integer.parseInt(s.substring(0,index));
            long M = Integer.parseInt(s.substring(index+1));
            if (N < M) {
                long temp = N;
                N = M;
                M = temp;
            }
            long answer;
            if (M == 1) {
                answer = 0;
            } else if (M == 2) {
                if (N == 2) {
                    answer = 0;
                } else if (N == 3) {
                    answer = 4;
                } else {
                    answer = 2*N*M-8;
                }
            } else if (M == 3) {
                if (N == 3) {
                    answer = 16;
                } else {
                    answer = 4*N*M-20;
                }
            } else {
                answer = (N-4)*(8*M-12)+2*(4*M-6)+2*(6*M-10);
            }
            BigInteger all = BigInteger.valueOf(N*M);
            BigInteger result = all.multiply(all.add(BigInteger.ONE.negate())).add(BigInteger.valueOf(-answer));
            //System.out.println(result);
            output.append(result).append("\n");
        }
        System.out.print(output);
    }
}
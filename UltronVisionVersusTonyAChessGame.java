/*
Ultron : Vision versus Tony - A Chess Game
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Vision and Tony Stark are playing a game. There are N rooks right next to a chessboard. The chessboard has R rows and C columns. The rows are numbered from 1 to R from top to bottom. The columns are numbered from 1 to C from left to right.

Vision will place the N rooks within the R*C cells of the chessboard. He may keep multiple rooks on the same cell. You may assume that each cell is large enough to hold all of the N rooks. After placing the N rooks, some of the cells may remain empty.

Note that not all possible placements of rooks within the R*C cells are valid. If there is a rook at cell (r, c) then there should be no rooks in the cells (u, v) where u < r AND v > c.

Following the Vision’s placement of the rooks, Tony Stark will make an unlimited number of moves - including, of course, the possibility of no move at all. In each move, he may move a rook to one cell up or one cell left of its position. He cannot move a rook out of the chessboard. At the end of all the moves (i. e. not necessarily at the end of each move, but at the end of all of them), Tony Stark must also ensure that the board is valid according to the condition given above.

Tony Stark will win, if he can move the rooks into a valid arrangement where no pairs of rooks attack each other. In other words, into a valid arrangement where no pairs of rooks share the same row or the same column.

count the number of valid ways Vision can place N rooks in a chessboard with R rows and C columns such that Tony Stark cannot win. 2 initial arrangements are considered different if there is at least one cell that contains different number of rooks.
Input
Each Input contains 3 integers R, C and N respectively

Constraints:-
1 <= R <= 5003
1 <= C <= 5003
1 <= N <= 5003
Output
output a single line containing the number of valid (see the problem statement for the definition of valid) ways Vision can place the rooks such that Tony Stark cannot win. Since this number can be quite large, print the number modulo 10007.
Example
Sample Input:-
2 2 2

Sample Output:-
5

Explanation:-
Valid ways:-
1 1
0 0

1 0
1 0

2 0
0 0

0 2
0 0

0 0
2 0

Sample Input:-
2 2 1

Sample Output:-
0*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main {
public static int MOD = 10007;
public static int fact[] = new int[MOD];
public static int invfact[] = new int[MOD];
public static void buildFact(int n, int mod) {
fact[0] = 1;
for (int i = 1; i < n; i++) {
fact[i] = (fact[i - 1] * i) % mod;
}
}
public static void buildInvFact(int n, int mod) {
for (int i = 0; i < n; i++) {
invfact[i] = modPow(fact[i], mod - 2, mod);
}
}
public static int modPow(int base, int exp, int mod) {
int result = 1;
while (exp > 0) {
if ((exp & 1) == 1) {
result *= base;
if (result > mod) {
result %= mod;
}
}
exp >>= 1;
base *= base;
if (base >= mod) {
base %= mod;
}
}
return result;
}
public static List<Integer> decomposition(long n, int base) {
ArrayList<Integer> ret = new ArrayList<Integer>();
while (n > 0) {
ret.add((int) (n % base));
n /= base;
}
return ret;
}
public static int combinationBig(long n, long k, int mod) {
int result = 1;
List<Integer> decompN = decomposition(n, mod);
List<Integer> decompK = decomposition(k, mod);
int limit = Math.min(decompK.size(), decompN.size());
for (int i = 0; i < limit; i++) {
result *= comb(decompN.get(i), decompK.get(i), mod);
result %= MOD;
}
return result;
}
private static int comb(int decompN, int decompK, int mod) {
if (decompN < decompK) {
return 0;
}
int result = fact[decompN];
result *= invfact[decompK];
result %= mod;
result *= invfact[decompN - decompK];
result %= mod;
return result;
}
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*1024*2);
buildFact(MOD, MOD);
buildInvFact(MOD, MOD);
// System.out.println(combinationBig(20, 10, MOD));
StringBuilder sb = new StringBuilder();
long[] v = readArrayLine(br.readLine(), 3);
long r = v[0];
long c = v[1];
long n = v[2];
int result = combinationBig(r + n - 1, n, MOD);
result *= combinationBig(c + n - 1, n, MOD);
result %= MOD;
int result2 = 0;
if (n <= r) {
result2 = combinationBig(n + r, n, MOD);
result2 -= combinationBig(n + r, n - 1, MOD);
if (result2 < 0) {
result2 += MOD;
}
}
int result3 = 0;
if (n <= c) {
result3 = combinationBig(n + c, n, MOD);
result3 -= combinationBig(n + c, n - 1, MOD);
if (result3 < 0) {
result3 += MOD;
}
}
int substract = result2 * result3;
substract %= MOD;
result -= substract;
if (result < 0) {
result += MOD;
}
sb.append(result + "\n");
System.out.println(sb.toString());
br.close();
}
public static long[] readArrayLine(String line, int n) {
long[] ret = new long[n];
int start = 0;
int end = line.indexOf(' ', start);
for (int i = 0; i < n; i++) {
if (end > 0)
ret[i] = Long.parseLong(line.substring(start, end));
else
ret[i] = Long.parseLong(line.substring(start));
start = end + 1;
end = line.indexOf(' ', start);
}
return ret;
}
}
/*A Boolean Matrix Problem
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.
Input
The first line of input contains T denoting the number of testcases. T testcases follow.
The first line of each testcase contains m and n denoting number of rows and number of columns.
Then next m lines contain n elements denoting the elements of the matrix.

Constraints:
1 <= T <= 20
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}
Output
For each testcase, in a new line, print the modified matrix.
Example
Input:
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
0 0

Explanation:
Testcase1: rows = 5 and columns = 4
The given matrix is
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.
The final matrix is
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {

	static int MAX = 1000;
	static int a[][] = new int[MAX][MAX];

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			boolean b[] = new boolean[n];
			for(int i=0;i<n;i++){
				str = br.readLine().trim().split(" ");
				for(int j=0;j<m;j++){
					a[i][j] = Integer.parseInt(str[j]);
					if(a[i][j]==1){
						b[i]=true;
					}
				}
			}
			for(int i = 0; i < n; i++){
				if(b[i]){
					for(int j = 0; j < m; j++){
						System.out.print("1 ");
					}
				}
				else{
					for(int j = 0; j < m; j++){
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
		}
	}
}

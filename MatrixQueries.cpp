/*
Matrix Queries
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a N x M integer matrix A and Q queries of form X1 Y1 X2 Y2. Print the sum of A[i][j], for X1 <= i <= X2 and Y1 <= j <= Y2.
Input
The first line contains two integer N and M, denoting the size of the matrix.
Next N line contains M integers denoting elements of the matrix.
Next line contains a single integer Q, denoting the number of queries.
Next Q lines lines four integers X1 Y1 X2 Y2, denoting the query as mentioned in problem statement

1 <= N, M <= 100
1 <= A[i][j] <= 100
1 <= Q <= 100000
1 <= X1 <= X2 <= N
1 <= Y1 <= Y2 <= M
Output
Print Q lines containing the answer to each query.
Example
Sample Input:
2 2
1 5
2 3
3
1 1 1 1
1 1 1 2
1 1 2 2

Sample Output:
1
6
11

Explanation:
Q1: 1
Q2: 1 + 5 = 6
Q3: 1 + 5 + 2 + 3 = 11*/


#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
using namespace std;

int main() {
  int N, M, Q;
  cin >> N >> M;
  int A[N][M];
  for (int i = 0; i < N; i++)
    for (int j = 0; j < M; j++)
      cin >> A[i][j];
  cin >> Q;

  int pref[N][M];
  for (int i = 0; i < N ; i++){
    for (int j = 0; j < M; j++) {
      pref[i][j] = A[i][j];
      if (i > 0) pref[i][j] += pref[i-1][j];
      if (j > 0) pref[i][j] += pref[i][j-1];
      if (i > 0 && j > 0) pref[i][j] -= pref[i-1][j-1];
    }
  }

  while (Q--) {
    int x1, y1, x2, y2 ;
    cin >> x1 >> y1 >> x2 >> y2;
    x1 --; y1--; x2--; y2--;

    int sum = pref[x2][y2];
    if (y1 > 0) sum -= pref[x2][y1-1];
    if (x1 > 0) sum -= pref[x1-1][y2];
    if (x1 > 0 and y1 > 0) sum += pref[x1-1][y1-1];
    
    cout << sum << "\n";
  }

  return 0;
}

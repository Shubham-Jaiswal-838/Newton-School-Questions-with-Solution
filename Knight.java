/*
Knight
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an 8*8 empty chessboard in which a knight is placed at a position (X, Y). Your task is to find the number of positions knight can jump into in a single move.

Note:- Rows and Columns are numbered through 1 to N.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Knight() that takes integers X and Y as arguments.

Constraints:-
1 <= X <= 8
1 <= Y <= 8
Output
Return the number of positions Knight can jump into in a single move.
Example
Sample input:-
4 5

Sample Output:-
8

Explanation:-
Positions:- (3, 3), (5, 3), (3, 7), (5, 7), (6, 6), (6, 4), (2, 6), (2, 4)

Sample input:-
1 1

Sample Output:-
2

Explanation:-
Positions:- (3, 2), (2, 3)
*/

static int Knight(int X, int Y){
int dx[] = {1,1,2,2,-1,-1,-2,-2};
int dy[] = {2,-2,1,-1,2,-2,-1,1};
X--;
Y--;
int cnt =0;
for(int i=0; i<8; i++){
    int newX = X +dx[i],newy=Y+dy[i];
    if(newX>=0&&newX<8&&newy>=0&&newy<8)
    cnt++;
}
return cnt;
}
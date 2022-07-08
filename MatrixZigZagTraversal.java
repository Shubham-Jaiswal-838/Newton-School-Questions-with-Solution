/*
Matrix ZigZag Traversal
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-

Consider a matrix of size 5*4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20

ZigZag traversal:-

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
Input
First line of input contains two integers M and N. Next M lines contains N space- separated integers each.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[i][j] <= 100000
Output
Print the zig- zag traversal of the matrix as shown.
Example
Sample Input:-
4 3
1 2 3
4 5 6
7 8 9
10 11 12

Sample Output:-
1
4 2
7 5 3
10 8 6
11 9
12*/


import java.util.*;
import java.io.*;

public class Main {
    public void BFS(int[][] grid) {

        int H = grid.length;
        if (H == 0)
            return ;
        int L = grid[0].length;

        boolean[][] visited = new boolean[H][L];


        Queue<String> queue = new LinkedList<>();

        //add the first element position to queue
        queue.add(0 + "," + 0);

        while (queue.isEmpty() == false) {
            int size = queue.size();
            while (size > 0) {
                String x = queue.remove();
                int row = Integer.parseInt(x.split(",")[0]);
                int col = Integer.parseInt(x.split(",")[1]);

                visited[row][col] = true;
                System.out.print(grid[row][col] + " ");

                //go down if allowed
                if (row + 1 < H && !visited[row + 1][col] && !queue.contains((row + 1) + "," + col))
                    queue.add((row + 1) + "," + col); //go down
                //go right if allowed
                if (col + 1 < L && !visited[row][col + 1] && !queue.contains(row + "," + (col + 1)))
                    queue.add(row + "," + (col + 1)); //go right
                size--;
            }
            //for line break for each diagonal
            System.out.println();
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

        int [][] grid = new int[rows][cols];
        for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				grid[i][j] = sc.nextInt();
			}
		}

        Main d = new Main();
        d.BFS(grid);
    }
}

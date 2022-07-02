/*
Sara and pattern (Functional Problem)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara loves patterns, today she encounters an interesting pattern and wants to write a code that can print the pattern of a given height N. As Sara is weak in programming help her to code it.

The pattern for height 6:-

0 4 8 12 16 20
6 10 14 18 22 26
12 16 20 24 28 32
18 22 26 30 34 38
24 28 32 36 40 44
30 34 38 42 46 50
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Pattern() that takes integer N as an argument.

Constraints:-
1 <= N <= 100
Output
Print the given pattern.
Example
Sample Input:-
3

Sample Output:-
0 4 8
6 10 14
12 16 20

Sample Input:-
5

Sample Output:-
0 4 8 12 16
6 10 14 18 22
12 16 20 24 28
18 22 26 30 34
24 28 32 36 40*/

static void Pattern(int N){
//Enter your code here
for(int row=0;row<N;row++){
    int num = row*6;
    for(int col=0;col<N;col++){
        System.out.print(num+" ");
        num= num+4;
    }
    System.out.println();
}
}
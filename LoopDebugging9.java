/*
Loop debugging 9
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer n, your task is to print a right angle triangle pattern of consecutive numbers of height n.

eg:-

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function pattern() that takes integer n as a parameter.

Constraint:
1 <= n <= 100

Note:
But there is a catch here given user function has already code in it which may or may not be correct, now you need to figure out these and correct if it is required
Output
Print a right angle triangle of numbers of height n.
Example
Sample Input:
5

Sample Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Sample Input:
2

Sample Output:
1
1 2*/

static void pattern(int n){
for(int i=1;i<=n;i++){
        for(int j=1;j<=i; j++){
                System.out.print(j+" ");
        }
        System.out.println();
        
}
}
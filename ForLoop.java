/*
For Loop
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer n, For each i (1<=i<=n) if i is even print "even" else print "odd".
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions For_Loop() that takes the integer n as parameter.

Constraints:
1 <= n <= 100
Output
Print even or odd for each i (1<=i<=n) separated by white spaces.
Example
Sample Input:
5

Sample Output:
odd even odd even odd

Sample Input:
2

Sample Output:
odd even*/

public static void For_Loop(int n){
     for(int i=1; i<=n; i++){
         if(i%2==0){
            System.out.print("even"+" ");
         }else if(i%2!=0){
               System.out.print("odd"+" ");
         }else{
         System.out.print(i+" ");
         }
     }
//Enter your code here
}
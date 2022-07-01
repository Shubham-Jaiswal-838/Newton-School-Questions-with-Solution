/*
Race
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Naruto and Sasuke are on a S- Rank mission. They got bored and thought of competing in a race against each other in a horizontal plane. They decided a common spot "C" at which both of them will try to reach. Whoever reaches first wins the race, both of them run at the same speed.
Given initial positions of Naruto and Sasuke you need to tell which of them will win the race. If Naruto wins print "N" ( without the quotes ), if Sasuke wins print "S" ( without the quotes ).
if both of them reach the common spot at the same time, print "D" (for draw, without the quotes ).
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function
Race that takes the integer A (initial position of Naruto) and B (initial position of Sasuke) and C (position of common spot) as parameter.

Constraints
1 <= A, B, C <= 100
Output
Return the character according to the given scenario.
Example
Sample Input
1 2 3

Sample Output
S

Sample Input
1 3 2

Sample Output
D*/


static char Race(int A,int B,int C){
//Enter your code here
if(Math.abs(C-A)==Math.abs(B-C)){
    return 'D';
}
else if(Math.abs(C-A)>Math.abs(B-C)){
    return 'S';
}
else{
    return 'N';
}
}
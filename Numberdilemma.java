/* Number dilemma
Easy

Problem Statement
Nobita likes a number if it is stored in an integer while Doraemon likes it when it is stored in a String. Your task is to write a code so that they can easily convert an integer to a string or a string to an integer whenever they want.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the following functions:-
StringToInt() that takes String S as parameter.
IntToString() that takes the integer N as parameter.

Constraints:-
1 <= (Given Number) <= 100
Output
Return an integer in StringToInt() while return a integer integer in IntToString(). The driver code will print "Nice Job" if your code is correct otherwise "Wrong answer".
Example
Sample Input:-
5

Sample Output:-
Nice Job

Sample Input:-
12

Sample Output:-
Nice Job
*/

static int StringToInt(String S){
     int a = Integer.parseInt(S);
     return a;
//Enter your code here
}

static String IntToString(int N){
    String s = String.valueOf(N);
    return s;
//Enter your code here
}

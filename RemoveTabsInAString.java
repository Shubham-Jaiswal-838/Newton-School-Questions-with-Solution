/*
Remove tabs in a String
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a recursive program to remove all tabs or spaces from a string.
Input
The first line contains the string s.

Constraints:
0
Output
Prints the string after removing all the tabs and spaces.
Example
Sample Input:
Hello World

Sample Output:
HelloWorld

Explanation:
The string "Hello World" after removing spaces is "HelloWorld".*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static void spaceRemove(String str){
       String result = str.replaceAll(" ", "");
       System.out.println(result);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        spaceRemove(str);


                      // Your code here
    }
}
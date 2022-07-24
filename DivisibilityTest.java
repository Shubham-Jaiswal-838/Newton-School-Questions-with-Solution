/*
Divisibility Test
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a big number in form of a string A of characters from 0 to 9.
Return 1 if it's divisible by 30 and 0 otherwise.
Input
The first argument is the string A.
Output
Return 1 if it is divisible by 30 and 0 otherwise.
Note It's a functional Problem you just have to return 0 or 1.
Example
Sample Input :
3033330

Sample Output:
Yes*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
                if((number.charAt(number.length()-1)=='0')){
                      System.out.println("Yes");
                }else {
        
                 System.out.println("No");

                }
                      // Your code here
    }
}
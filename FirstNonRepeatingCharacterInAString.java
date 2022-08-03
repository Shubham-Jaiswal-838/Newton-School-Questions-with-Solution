/*
First non- repeating character in a String
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s, find the first non- repeating character in the string and return its index. If it does not exist, return -1.
Input
First line of the input contains the string s.

Constraints
1<= s. length <= 100000
Output
Print the index of the first non- repeating character in a string
Example
Input
s = "newtonschool"

Output
1

Explanation
"e" is the first non- repeating character in a string*/








import java.io.*;
import java.util.*; 
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String non = sc.nextLine();

        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < non.length(); i++) {
            if (m.get(non.charAt(i)) != null) {
                m.put(non.charAt(i), m.get(non.charAt(i)) + 1);
            } else {
                m.put(non.charAt(i), 1);
            }
        }

        for (int i = 0; i < non.length(); i++) {

            if (m.get(non.charAt(i)) == 1) {
                System.out.println(i);
                break;
            } else {
                if (i == non.length() - 1) {
                    System.out.println("-1");
                }
            }
        }
    }
}
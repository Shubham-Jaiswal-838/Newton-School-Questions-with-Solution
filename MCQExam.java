/*
MCQ Exam
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has an MCQ exam containing 100 questions this sunday but she isn't prepared. She came to know that in her exam
- >P number of Questions will have A as the correct option
- >Q number of Questions will have B as the correct option
- >R number of Questions will have C as the correct option
- >S number of Questions will have D as the correct option
Sara doesn't know the order of the questions. If Sara filled the MCQs optimally using the above information what will be the maximum of minimum marks she can get.
Input
The input contains 4 integers P, Q, R, and S.

Constraints:-
0 <= P, Q, R, S <= 100

Note:- P + Q + R + S will always be 100
Output
Print the maximum marks Sara can get.
Example
Sample Input:-
8 10 20 62

Sample Output:-
62*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int P =sc.nextInt();
        int Q = sc.nextInt();
        int R =sc.nextInt();
        int S = sc.nextInt();
        
        int total =P+Q+R+S;
            
        if(total==100){
            if(P>Q && P>R && P>S){
            System.out.println(P);
            }else if(Q>R && Q>S){
                System.out.println(Q);
            }else if(R>S){
                System.out.println(R);
            }else{
              System.out.println(S);
            }
        }  
    }
}


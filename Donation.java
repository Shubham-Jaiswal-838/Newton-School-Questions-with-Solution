/*
Donation
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
After the decimation, all world went into chaos. People had to rebuild the planet so Shield came up with a donation strategy. They feel all the rich guys need to donate more than the poor guys. So, they make a rule. They would make a donation list in which the donation of each person would be shown. But the rule is that a person can’t pay less than what has already been paid before them. Find the extra amount each person will pay, and also, tell shield the total amount of donation.
Input
The first line contains n, the total number of people donating. The next line contains n space separated integers denoting the amount of money paid by the people. The amounts are mentioned in the order in which the people paid.

Constraints:-
1 <= n <= 100000
0 <= money <= 100000
Output
The first line contains the extra money that each student has to pay after their teacher applied the rule. The second line contains the total amount collected by the teacher at the end.
Example
Sample Input:-
10
1 2 3 2 4 3 6 6 7 6

Sample Output:-
0 0 0 1 0 1 0 0 0 1
43

Sample Input:-
7
10 20 30 40 30 20 10

Sample Output:-
0 0 0 0 10 20 30
220*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int a[] = new int[n];
                int b[] = new int[n];
                long sum= 0;
                int max = 0;
                
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                    sum += a[i];
                    max = max<a[i]?a[i]:max ; 

                    if (a[i]>=max){
                        b[i]=0;
                    }
                    else{
                        b[i]= max-a[i];
                        sum += b[i];
                    }   
                }
                for(int i=0;i<n;i++){
                    System.out.print(b[i]+" ");
                }
                System.out.println();
                System.out.print(sum);

            } 
    }
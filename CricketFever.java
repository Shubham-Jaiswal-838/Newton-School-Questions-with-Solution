/*
Cricket Fever
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Everyone is so excited about the upcoming cricket championship, so they decided to have a fun event before the start, in which they will be conducting a dummy tournament but the winner will be decided on the basis of the supporters of the team. There are 2^K teams participating in this tournament named from Team 1, Team 2, to Team 2^K, and there will be exactly 2^K -1 matches (knockout tournament).

Winning Criteria: The winner of the match will be decided by the number of supporters i.e. team having more supporters will win the match. If the number of supporters are same then the winning team will be the one that has a lower team number.

There is one more twist, the supporters of the losing team will join the supporters of the team which is going against the team who eliminated their team.

Thus matches which is going to be played in tournament will take place in below format:
Match 1: team 1 vs team 2,
   winner: team 1(if team 1 supporter is more than team 2)

Match 2: team 3 vs team 4.
   winner: team 3(if team 3 supporter is more than team 4)

Match 3: team 1 vs team 3 (team 2 supporter joins team 3 and team 4 supporters joins team 1)

Your task is to find the number of supporters of the team which wins the tournament.
Input
The first line of input contains a single integer K. The next line contains 2^K space separated integers depicting the supporters of each team.

Constraints:-
1 <= K <= 16
1 <= Supporters <= 100000
Output
Print the number of supporters of the winning team.
Example
Sample Input:-
3
2 3 4 1 3 5 6 8

Sample Output:-
17

Explanation:-
1 vs 2:- 2(3)
3 vs 4:- 3(4)
5 vs 6:- 6(5)
7 vs 8:- 8(8)

2(3+1) vs 3(4+2):- 3(6)
6(5+6) vs 8(8+3):- 6(11)

3(6+11) vs 6(11+4):- 3(17)

Sample Input:-
3
4 1 2 3 4 3 2 1

Sample Output:-
11*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int findMaxPoint(int arr[], int n) {
        if (n == 2) {
            return Math.max(arr[0], arr[1]);
        }
        int ans[] = new int[n / 2];
        for (int i = 0; i < n; i += 4) {
            if (arr[i] >= arr[i + 1]) {
                ans[i / 2 + 1] = arr[i + 1];
                ans[i / 2] = arr[i];
            } else {
                ans[i / 2 + 1] = arr[i];
                ans[i / 2] = arr[i + 1];
            }

            if (arr[i + 2] >= arr[i + 3]) {
                ans[i / 2 + 1] += arr[i + 2];
                ans[i / 2] += arr[i + 3];
            } else {
                ans[i / 2 + 1] += arr[i + 3];
                ans[i / 2] += arr[i + 2];
            }
        }
        return findMaxPoint(ans, n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = (int) Math.pow(2, num);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxPoint(arr, n));

    }
}

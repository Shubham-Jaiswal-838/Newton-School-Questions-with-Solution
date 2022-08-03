/*
Counters and Lines (Group Contest April '21)
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
To enter Todo's amusement park, there are M counters. Total N people want to enter the amusement park, each of whom will line up in front of one of the counters. Any counter worker gets angry if the number of people lining up in front of him is at least 2 more than the number of people lining up in front of any of its neighbouring counters. The worker at the K-th counter works the fastest.
Find the maximum number of people that can line up in front of the K-th counter such that each counter gets at least one person and no counter worker is angry.
Input
Input contains three integers M, N and K.

Constraints:
1 <= N <= 1000000000
1 <= M <= N
1 <= K <= M
Output
Print the maximum number of people that can line up in front of the Kth counter such that each counter gets at least one person and no counter worker is angry.
Example
Sample Input 1
3 3 1

Sample Output 1
1

Explanation: Optimal Arrangement is 1 1 1.

Sample Input 2
3 6 1

Sample Output
3

Explanation: Optimal Arrangement is 3 2 1.*/




import java.io.*;
import java.util.*; 
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n, p, k; 
        n = sc.nextLong();
        p = sc.nextLong();
        k = sc.nextLong();
	    Long l = 1l, r = 10000000000l;
 
        while(l + 1 < r){
            Long m = (l + r) / 2;
            if ( get(m, k) + get(m, n - k + 1) - m > p)
                r = m;
            else l = m;
	}
 
	System.out.println((Long)l);
	}

    public static Long get(Long ed, Long cnt){
        Long d = cnt;
        if (d > ed) 
            d = ed;
        cnt -= d;
       return cnt + d * (2 * ed - d + 1) / 2;
    }
}
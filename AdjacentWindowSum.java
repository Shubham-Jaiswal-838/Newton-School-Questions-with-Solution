/*
Adjacent Window Sum
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array arr of size n and a window of size k your task is to find that whether two adjacent windows sum can be equal to the given sum. If yes print "YES" otherwise print "NO".
Input
The first line of the input contains n, k and sum.
Second line of the input contains the array arr.

Constraints
1 <= k < n <= 1e4
1 <= sum <= 1e8
1 <= arr[i] <= 1e3
Output
Print "YES" if the sum exists otherwise "NO".
Example
Sample Input 1:
5 3 21
1 2 4 3 5

Sample Output 1:
YES*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
          a[i] = sc.nextInt();
        if(findres(a,n,k,x))
          System.out.println("YES");
        else
          System.out.println("NO");
        sc.close();
    }
    static boolean findres(int[] a,int n,int k,int x){
        int sum = 0;
        for(int i=0;i<k;i++)
          sum += a[i];
        for(int i=k;i<n;i++){
            int curr_sum = sum;
            sum += a[i] - a[i-k];
            if((sum + curr_sum)==x)
              return true; 
        }
        return false;
    }
}


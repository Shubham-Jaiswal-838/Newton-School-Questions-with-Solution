/*
Travelling
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given N cities in a line and your initial position, you want to visit all the cities at least once. You can go to one coordinate P to P+D or P-D where D is the number of steps which you choose initially. Your task is to find the maximum value of D such that you can visit all the cities at least once.
Input
The first line of input contains two integers N and X(initial position). The second line of input contains N space separated integers representing the location of cities.

Constraints:-
1 <= N <= 100000
1 <= City[] <= 100000000
Output
Print the maximum value of D such that you can visit all the cities.
Example
Sample Input:-
3 3
1 7 11

Sample Output:-
2

Sample Input:-
3 81
33 105 57

Sample Output:-
24*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    public static void main (String[] args) {
                      Scanner scn = new Scanner(System.in);
                      int n= scn.nextInt();
                      int s = scn.nextInt();
                      int a[]= new int[n];
                       int arr[]= new int[n];
                      for(int i=1; i<arr.length;i++)
                      {
                          arr[i]=scn.nextInt();
                      }
                      for(int i=1; i<arr.length;i++)
                      {
                          int o=0;
                      o=arr[i]-s;
                      o= Math.abs(o);
                      a[i]=o;
                      }
                    int temp= gcd(a[0],a[1]);
                      for(int i=1; i<n-1; i++)
                      {
                       temp=gcd(temp,a[i+1]);
                      }
                     System.out.println(temp);
            }
    }
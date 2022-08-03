/*
Group of Numbers
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array a that contains N integers. All the integers in the array may not be distinct. The number of repetitions of each integer in the array is represented by ri. Your task is to print the integers in the decreasing order of their occurrence in the array.

Note
1. If ri > rj, then ai must be printed before aj.
2. If ri == rj, then among ai and aj whichever has a larger value, is printed first.

Here ri and rj is the number of repetitions of integers ai and aj in the array.
Input
The first line of the input contains an integer N.
The second line contains N space- separated integers representing the elements of array a.

Constraints
1<= N <= 1000
1<= ai <= 1000
Output
Print the space separated integers in the decreasing order of their occurrence in the array. The output must be printed in a single line.
Example
Sample input:
6
1 2 3 3 2 1

Sample Output
3 2 1*/




import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}

int maxE = -1;
for (int i = 0; i < n; i++) {
 maxE = Math.max(maxE, arr[i]);
}

int[] freq = new int[maxE + 1];
for (int i = 0; i < n; i++) {
 freq[arr[i]]++;
}

int maxF = -1;
for (int i = 0; i <= maxE; i++) {
 maxF = Math.max(maxF, freq[i]);
}

while(maxF > 0){
for(int i=maxE; i>=0;i--){
 if(maxF == freq[i]){
     System.out.print(i + " ");
 }
}
maxF--;
}}}

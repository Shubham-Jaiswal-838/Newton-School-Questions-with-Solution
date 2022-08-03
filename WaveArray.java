/*
Wave array
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an N size array of unique inyegers, your task is to print the array in a wave form, i. e a1 >= a2 <= a3 >= a4 <= a5.. . print the lexicographically smallest array possible.
Input
First line of input contains a single integer N, next line contains N space separated integers depicting the values of the array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 1000000000
Output
Print the array in wave form as mentioned.
Example
Sample Input :-
5
2 1 3 5 4

Sample Output:-
2 1 4 3 5

Sample Input:-
3
1 2 3

Sample Output:-
2 1 3*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static void swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void sortInWave(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortInWave(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
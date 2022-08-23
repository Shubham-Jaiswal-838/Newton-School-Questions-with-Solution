/*
Sum of minimum and maximum elements of subarrays
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of size N, your task is to calculate the total sum of maximum and minimum elements in each subarray of size K.
See example for better understanding.
Input
First line of input contains an two space separated integers depicting values of N and K, next line contains N space separated integers depicting values of Arr[i].

Constraints:-
1 < = k < = N < = 100000
-100000 < = Arr[i] < = 100000
Output
Print the required sum
Example
Sample Input:-
5 3
1 2 3 4 5

Sample Output:-
18

Explanation:-
For subarray 1 2 3 :- 1 + 3 = 4
For subarray 2 3 4 :- 2 + 4 = 6
For subarray 3 4 5 :- 3 + 5 = 8
total sum = 4+6+8 = 18

Sample Input:-
7 4
2 5 -1 7 -3 -1 -2

Sample Output:-
18*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long a[] = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		Deque<Integer> S = new LinkedList<>();
		Deque<Integer> G = new LinkedList<>();

		int i;
		for(i = 0; i < k; i++){
			//removing useless
			while(!S.isEmpty() && a[S.peekLast()] >= a[i]){
				S.removeLast();
			}
			while(!G.isEmpty() && a[G.peekLast()] <= a[i]){
				G.removeLast();
			}
			S.addLast(i);
			G.addLast(i);
		}
		long sum = 0;
		for(; i <n ; i++){
			sum += a[S.peekFirst()] + a[G.peekFirst()];
			
			//removing expired
			while(!S.isEmpty() && S.peekFirst() <= i - k){
				S.removeFirst();
			}
			while(!G.isEmpty() && G.peekFirst() <= i - k){
				G.removeFirst();
			}			
			//removing useless
			while(!S.isEmpty() && a[S.peekLast()] >= a[i]){
				S.removeLast();
			}
			while(!G.isEmpty() && a[G.peekLast()] <= a[i]){
				G.removeLast();
			}
			S.addLast(i);
			G.addLast(i);
		}
		sum += a[S.peekFirst()] + a[G.peekFirst()];
		System.out.println(sum);
	}
}

/*
Max Widow Sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of integers arr of size n, a window of size k. Your task is to find the sum of the maximum element from each window.
Input
The first line contains the input of n, k ie the size of array and the size of the window.
Next line contains the input of the array.

Constraints
1 <= k < n <= 1e5
1 <= arr[i] <= 1e5
Output
Print the single line containing the maximum sum.
Example
Sample Input 1:
5 3
1 2 3 4 5

Sample Output 1:
12

Sample Input 2:
6 2
2 3 1 7 8 3

Sample Output 2:
29*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		//1 2 3 1 4 5 2 3 1
		//0 1 2 3 4 5 6 7 8

		Deque<Integer> dq = new LinkedList<>();
		//First k elements just add
		
		//dq: [2]
		int i;
		for(i = 0; i < k; i++){
			//removing useless
			while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]){
				dq.removeLast();
			}
			dq.addLast(i); //index;
		}
		//1 2 3 1 4 5 2 3 1
		//0 1 2 3 4 5 6 7 8
		//dq: [2]
		//Output: 3 

		//5 3 2 1
		//6 7 8 9

		//dq: 7 8 9
		//6 <= 9 - 3
       long sum =0;
		for(; i <n ; i++){
			sum += a[dq.peekFirst()];
			
			//removing expired
			while(!dq.isEmpty() && dq.peekFirst() <= i - k){
				dq.removeFirst();
			}
			
			//removing useless
			while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]){
				dq.removeLast();
			}
			dq.addLast(i);
		}
        sum+=a[dq.peekFirst()];
		System.out.print(sum);

	}
}

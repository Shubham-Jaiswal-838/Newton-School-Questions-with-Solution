/*
Bob and Array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has an array A of N positive integers. Find the lexicographically greatest array that can be formed by applying the below operation. You are allowed to create another array B and sequentially insert elements from A to B either at the front or at back.
Input
The first line contains N - the number of elements in the array.
The second line contains N space separated integers of array A

Constraints
1 <= N <= 100000
0 <= Ai <= 10^9
Output
Print an array B containing N integers which is the lexicographically greatest permutation which can be formed by applying the above operation.
Example
Sample Input:
4
3 1 2 4

Output:
4 3 1 2

Explanation:
Step 0 :
A = { 3, 1, 2, 4 }
B = {}

Step 1 :
A = { 1, 2, 4 }
B = { 3 }

Step 2 :
A = { 2, 4 }
B = { 3, 1 }

Step 3 :
A = { 4 }
B = { 4, 3, 1 }

Step 4 :
A = { }
B = { 4, 3, 1, 2 }

Sample Input:
5
1 2 3 4 5

Output:
5 4 3 2 1

Explanation
Step 0:
A = { 1, 2, 3, 4, 5 }
B = { }

Step 1:
A = { 2, 3, 4, 5 }
B = { 1 }

Step 2:
A = { 3, 4, 5 }
B = { 2, 1 }

Step 3:
A = { 4, 5 }
B = { 3, 2, 1 }

Step 4:
A = { 5 }
B = { 4, 3, 2, 1 }

Step 5:
A = { }
B = { 5, 4, 3, 2, 1 }*/




import java.util.*;

class Main{

	static void largestPermutation(int arr[], int N)
	{

		Deque<Integer> p = new LinkedList<Integer>();

		int mx = arr[0];
		p.addLast(arr[0]);

		// Iterate the array elements
		for (int i = 1; i < N; i++) {

			if (arr[i] < mx)
				p.addLast(arr[i]);

			else {
				p.addFirst(arr[i]);

				mx = arr[i];
			}
		}

		// Print resultant permutation
		for (Iterator itr = p.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
	}

	// Driver Code

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

		int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
		int N = arr.length;

		largestPermutation(arr, N);
	}
}


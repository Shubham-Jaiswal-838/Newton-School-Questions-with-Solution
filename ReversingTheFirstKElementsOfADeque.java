/*
Reversing the first K elements of a deque
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a deque of N integers and an integer K. Reversing the first K elements of a deque and print it.
Input
First line contains an integer N and K.
Next line contains N space separated integers denoting elements of deque.

Constraints
1 <= K <= N <= 10^5
0 <= Ai<= 10^5
Output
Print N space separated integers - the elements of deque after reversing the first K elements.
Example
Sample Input 1:
5 2
1 2 3 4 5

Output
2 1 3 4 5

Explanation:
Reversing : (1 2)(3 4 5) - > (2 1)(3 4 5)

Sample Input 2:
4 3
1 3 4 2

Output
4 3 1 2

Explanation
Reversing : (1 3 4)(2) - > (4 3 1)(2)*/



import java.util.*;
import java.io.*;
class Main{

	static Queue<Integer> queue;

	// Function to reverse the first
	// K elements of the Queue
	static void reverseQueueFirstKElements(int k)
	{
		if (queue.isEmpty() == true
			|| k > queue.size())
			return;
		if (k <= 0)
			return;

		Stack<Integer> stack = new Stack<Integer>();

		// Push the first K elements into a Stack
		for (int i = 0; i < k; i++) {
			stack.push(queue.peek());
			queue.remove();
		}

		// Enqueue the contents of stack
		// at the back of the queue
		while (!stack.empty()) {
			queue.add(stack.peek());
			stack.pop();
		}

		// Remove the remaining elements and enqueue
		// them at the end of the Queue
		for (int i = 0; i < queue.size() - k; i++) {
			queue.add(queue.peek());
			queue.remove();
		}
	}

	// Utility Function to print the Queue
	static void Print()
	{
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() + " ");
			queue.remove();
		}
	}

	// Driver code
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();

		queue = new LinkedList<Integer>();
		for(int i=0; i<num; i++){
            queue.add(sc.nextInt());
        }

		// int k = 5;
		reverseQueueFirstKElements(k);
		Print();
	}
}

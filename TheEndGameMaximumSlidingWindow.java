/*
The EndGame : Maximum Sliding Window
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. You have to print the maximum in every K-sized subarray from the left to the right in the array A.
More formally, you have to print N - K + 1 integers X1, X2, ..., XN-K+1 such that Xi (1 <= i <= N - K + 1) is the maximum element in the subarray Ai, Ai+1, ..., Ai+K-1.
Input
1. The first line contains an integer N, denoting the size of the array.
2. The second line has N space- separated integers of the array A.
3. The third line contains integer K, denoting the size of the sliding window

Constraints :
1 <= N <= 10^5
10^-4 <= A[i] <= 10^4
1 <= K <= N
Output
Print the max of K numbers for each position of sliding window
Example
Sample Input:-
8
1 3 -1 -3 5 3 6 7
3

Sample Output:-
3 3 5 5 6 7

Explanation:-
Window position Max
- - - -
[1 3 -1] -3 5 3 6 7 3
1 [3 -1 -3] 5 3 6 7 3
1 3 [-1 -3 5] 3 6 7 5
1 3 -1 [-3 5 3] 6 7 5
1 3 -1 -3 [5 3 6] 7 6
1 3 -1 -3 5 [3 6 7] 7

Sample Input:-
1
1
1

Sample Output:-
1*/




import java.util.*;

class Main {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> deque = new LinkedList<>();
        for(int i = 0; i < nums.length; i++){
            if(!deque.isEmpty() && deque.peek() == i - k) deque.poll();
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) deque.pollLast();
            deque.offer(i);
            if(i >= k - 1) result[i - k + 1] = nums[deque.peek()];
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int[] arr = new int[num];
       for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }
        int k = sc.nextInt();
       arr= maxSlidingWindow(arr, k);
       for(int i: arr){
           System.out.print(i+" ");
       }
    }
}

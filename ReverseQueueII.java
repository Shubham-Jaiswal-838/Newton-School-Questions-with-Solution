/*
Reverse Queue II
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have been given a queue of integers of size N and an Integer K, you need to reverse first K elements in the queue leaving the rest elements as it is.

You can only use standard queue operations.
Input
You don't have to input anything. Just implement the reverseQueueKFirstElement function.

Constraints :
1 <= N <= 10^5
1 <= element <= 10^9
Output
You don't have to output anything.
Example
Input:
5 3
1 2 3 4 5

Output:
3 2 1 4 5*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
       // add code here.
       Stack <Integer> s=new Stack<>();
       int n=q.size();
       for(int i=0;i<k;i++){
           s.push(q.poll());
       }
       
       for(int i=0;i<k;i++){
           q.offer(s.pop());
       }
       
       for(int i=0;i<n-k;i++){
           q.offer(q.poll());
       }
       
       return q;
       
   }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<num; i++){
            q.add(sc.nextInt());
        }
         q = modifyQueue(q, k);
        for(int i:q){
            System.out.print(i+" ");
        }
                      // Your code here
    }
}


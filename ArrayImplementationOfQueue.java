/*
array implementation of queue
easy
Problem Statement
Your are given an array and Q queries. Your task is to perform these operations:-
enqueue:-this operation will add an element to your current queue.
dequeue:-this operation will delete the element from the starting of the queue
displayfront:-this operation will print the element presented at front
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
enqueue():- that takes the integer to be added and the maximum size of array as parameter.
dequeue():- that takes the queue as parameter.
displayfront() :- that takes the queue as parameter.

Constraints:
1 <= Q(Number of queries) <= 103

Custom Input:
First line of input should contains two integer number of queries Q and the size of the array N. Next Q lines contains any of the given three operations:-
enqueue x
dequeue
displayfront
Output
During a dequeue operation if queue is empty you need to print "Queue is empty", during enqueue operation if the maximum size of array is reached you need to print "Queue is full" and during displayfront operation you need to print the element which is at the front and if the queue is empty you need to print "Queue is empty".

Note:-Each msg or element is to be printed on a new line
Example
Sample Input:-
8 2
displayfront
enqueue 2
displayfront
enqueue 4
displayfront
dequeue
displayfront
enqueue 5

Sample Output:-
Queue is empty
2
2
4
Queue is full

Explanation:-here size of given array is 2 so when last enqueue operation perfomed the array was already full so we display the msg "Queue is full".

Sample input:
5 5
enqueue 4
enqueue 5
displayfront
dequeue
displayfront

Sample output:-
4
5*/





/*

  class Queue{ 
    static final int MAX = 10000; 
    int rear=0,front=0; 
    int a[] = new int[MAX]; 
}
    int rear=0,front=0; //pointer to rear and front
    int a[] //array that contain elements of queue
*/ 
public static void enqueue(int x, int size)
{
    if(rear >= size){
        System.out.println("Queue is full");
        return;
    }
    a[rear] = x;
    rear++;
}
//front = 3, rear = 3 //3 elements in the queue
public static void dequeue()
{
    if(front >= rear){
        System.out.println("Queue is empty");
        return;
    }
    front++; 
}
public static void displayfront()
{
    if(front >= rear){
        System.out.println("Queue is empty");
        return;
    }
    System.out.println(a[front]);
}

}

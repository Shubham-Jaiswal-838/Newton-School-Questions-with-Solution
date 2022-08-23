/*
operations on queue
easy
Problem Statement
Given a queue of integers and N queries. Your the task is to perform these operations:-
enqueue:-this operation will add an element to your current queue.
dequeue:-this operation will delete the element from the starting of the queue
displayfront:-this operation will print the element presented at front

Note:-if queue is empty than dequeue operation will do nothing, and 0 will be printed as a front element of queue if it is empty.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
enqueue():- that takes the queue and the integer to be added as a parameter.
dequeue:- that takes the queue as parameter.
displayfront :- that takes the queue as parameter.

Constraints:
1 <= N(Number of queries) <= 103
Output
You don't need to print anything else other than in displayfront() in which you require to print the element at front of your queue in a new line, if the queue is empty you just need to print 0.
Example
Sample Input:-
7
displayfront
enqueue 2
displayfront
enqueue 4
displayfront
dequeue
displayfront

Sample Output:-
0
2
2
4

Sample input:
5
enqueue 4
enqueue 5
displayfront
dequeue
displayfront

Sample output:-
4
5*/





// enqueue():- that takes the queue
// and the integer to be added as a parameter.
public static void enqueue(Queue<Integer> qu, int x)
    {
        qu.add(x);
    }

// dequeue():- that takes the queue as parameter.
 public static void dequeue(Queue<Integer> qu)
    {
        if(qu.size() != 0){
            qu.poll();
        }
    }

// displayfront():-  that takes the queue as parameter.
    public static void displayfront(Queue<Integer> qu)
    {
        if(qu.size() != 0){
            System.out.println(qu.peek());
        }
        else{
            System.out.println("0");
        }
    }



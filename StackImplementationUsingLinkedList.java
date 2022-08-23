/*
Stack implemetation using linked list
easy
Problem Statement
Your task is to implement a stack using a linked list and perform given queries

Note:-if stack is already empty than pop operation will do nothing and 0 will be printed as a top element of stack if it is empty.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
push():- that takes the integer to be added as a parameter.
pop():- that takes no parameter.
top() :- that takes no parameter.

Constraints:
1 <= N(number of queries) <= 103
Output
You don't need to print anything else other than in top function in which you require to print the top most element of your stack in a new line, if the stack is empty you just need to print 0.
Example
Input:
7
push 1
push 2
top
pop
top
pop
top

Output:
2
1
0*/



/*  
    
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
 */

Node top = null;
public void push(int x){
//enter your code here
    Node nd = new Node(x);
    nd.next = top;
    top = nd;
}

public void pop(){
//enter your code here
    if(top == null){
        return;
    }
    else{
        top = top.next;
    }
}

public void top(){
//enter your code here
    if(top == null){
        System.out.println(0);
    }
    else{
        System.out.println(top.val);
    }
}

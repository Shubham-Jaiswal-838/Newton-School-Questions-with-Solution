/*
Array implementation of stack
easy
Problem Statement
Your task is to implement a stack using an array and perform given queries

Note: Description of each query is given in the input and output format
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
push():- that takes the integer to be added and the maximum size of the array as a parameter.
pop():- that takes no parameter.
top() :- that takes no parameter.

Constraints:
1 <= N(number of queries) <= 103
Output
During a pop operation if the stack is empty you need to print "Stack underflow",
during push operation, if the maximum size of the array is reached you need to print "Stack overflow",
during top operation, you need to print the element which is at the top
if the stack is empty you need to print "Empty stack".

Note:- Each message or element is to be printed on a new line
Example
Sample Input:-
6 3
pop
push 3
push 2
push 4
push 6
top

Sample Output:-
Stack underflow
Stack overflow
4

Explanation:-
Here maximum size of the array is 3, so element 6 can not be added to stack

Sample input:-
8 4
push 2
top
push 4
top
push 6
top
push 8
top

Sample Output:-
2
4
6
8*/



/*
    int top=-1; // index of current top
    int a[] // array which contain element of stack 
*/
// function to add element in the stack
//x=element to be added
//size=maximum size of array
  void push(int x,int size)
    {
        if(top==size-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        
        ++top;
        a[top]=x;
    }

    // Function to pop element from stack
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return;
        }
        a[top]=0;
        top--;
    }

    void top()
    {   if(top==-1)
            System.out.println("Empty stack");
        else
            System.out.println(a[top]);
    }




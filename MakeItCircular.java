/*
Make it Circular
easy
Problem Statement
Given a singly linked list consisting of N Nodes, your task is to convert it into a circular linked list.

Note:- For custom input you will get 1 if your code is correct else you get a 0.

Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function MakeCircular() that takes head node of singly linked list as parameter.

Constraints:
1 <=N <= 1000
1 <= Node. data<= 1000
Output
Return the head node of the circular linked list.
Example
Sample Input 1:-
1- >2- >3

Sample Output 1:-
1- >2- >3- >1

Sample Input 2:-
1- >3- >2

Sample Output 2:-
1- >3- >2- >1*/




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

public static Node MakeCircular(Node head) {
//enter your code here
Node s=head;
while(s.next!=null)
s=s.next;
s.next=head;
return head;
}

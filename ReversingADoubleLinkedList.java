/*
Reversing a double linked list
easy
Problem Statement
Given a double linked list with consisting of N nodes, your task is to reverse the linked list and return the head of the modified list.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Reverse() that takes head node of the linked list as a parameter.


Constraints:
1 <= N <= 10^3
1<=value<=100
Output
Return the head of the modified linked list.
Example
Input:
6
1 2 3 4 5 6

Output:
6 5 4 3 2 1

Explanation:
After reversing the list, elements are as 6 <-> 5 <-> 4 <-> 3 <-> 2 <-> 1.*/



/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node Reverse(Node head) {
//complete this function
Node s=head;
// Just traverse the list from head to tails
while(s.next!=null)
 s=s.next;
head=s;
s.next=s.prev;
s.prev=null;
s=s.next;
Node p=s;
while(s!=null)
{
    s.next=s.prev;
    s.prev=p;
    p=s;
    s=s.next;
}

return head;
}


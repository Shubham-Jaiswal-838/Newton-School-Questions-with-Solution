/*
Add two numbers
medium
Problem Statement
Two numbers are represented in Linked List such that each digit corresponds to a node in linked list. Your task is to add these two numbers and return the sum in a linked list.

Note:-Linked list representaion of a number is from left to right i.e if the number is 123 than in linked list it is represented as 3->2->1
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function addNumber() that takes head nodes of both the linked lists as parameter.

Constraints:
1 <=numbers<=10^1000
Output
Return the head of modified linked list.
Example
Sample Input:-
1234 45643


Sample Output:-
46877*/




/*
class Node {
    Node next;
    int data;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/
   public static Node addNumber(Node l1, Node l2) {
    Node dummyHead = new Node(0);
    Node p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.data : 0;
        int y = (q != null) ? q.data: 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new Node(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new Node(carry);
    }
    return dummyHead.next;
}



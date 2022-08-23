/*
Reversing the Linked List
easy
Problem Statement
Given a linked list of N nodes. The task is to reverse the list by changing links between nodes (i.e if the list is 1->2->3->4 then it becomes 1<-2<-3<-4) and return the head of the modified list.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function ReverseLinkedList that takes head node as parameter.

Constraints:
1 <=N <= 1000
1 <= Node.data<= 100
Output
Return the head of the modified linked list.
Example
Input-1:
6
1 2 3 4 5 6

Output-1:
6 5 4 3 2 1

Explanation:
After reversing the list, elements are as 6->5->4->3->2->1.

Input-2:
5
1 2 8 4 5

Output-2:
5 4 8 2 1*/


/*
// information about the class Nodeclass Node {
    Node next;
    int val;
    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {

        Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
        return head; 
		
    }

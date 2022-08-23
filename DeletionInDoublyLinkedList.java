/*
Deletion in Doubly Linked List
easy
Problem Statement
Given a Doubly linked list consisting of N nodes and given a number K. The task is to delete the Kth node from the end of the linked list.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteElement() that takes head node and the position K as parameter.

Constraints:
1 <=K<=N<= 1000
1 <=value<= 1000
Output
Return the head of the modified Doubly linked list
Example
Input:
5 3
1 2 3 4 5

Output:
1 2 4 5

Explanation:
After deleting 3rd node from the end of the linked list, 3 will be deleted and the list will become 1, 2, 4, 5.*/




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

public static Node deleteElement(Node head, int k) {
    
    Node start = head;
    Node end = head;
    while(k-- > 0){
        end = end.next;
    }
    if(end == null){
        start = start.next;
        return start;
    }

    while(end.next != null){
        start = start.next;
        end = end.next;
    }

    //create link between s.next and s.next.next
    if(start.next.next == null){
     
        start.next = null;
        return head;
    }

    start.next = start.next.next;

    return head;

}


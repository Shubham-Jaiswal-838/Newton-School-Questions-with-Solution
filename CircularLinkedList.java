/*
Circular linked list
easy
Problem Statement
Given a linked list consisting of N nodes, your task is to check if the given list is circular or not.

Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function check() that takes head node as parameter.

Constraints:
1 <=N <= 1000
1 <= Node.data<= 1000

Output
Return 1 if the given linked list is circular else return 0.
Example
Sample Input 1:-
3 0
1 2 3

Sample Output 1:-
0

Explanation:-
1->2->3

Sample Input 2:-
3 1
1 2 3

Sample Output 2:-
1

Explanation:-
1->2->3->1.......*/



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

public static int check(Node head) {
    /*
        a. 1->2->3->4->null
        b. 1->2->3->1
    */

    Node temp = head.next;
    while(temp != null && temp != head){
        temp = temp.next;
    }
    if(temp == null)
        return 0;
    return 1;
}

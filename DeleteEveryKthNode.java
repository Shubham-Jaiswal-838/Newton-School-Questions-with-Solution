/*
Delete every Kth node
medium
Problem Statement
Given a linked list consisting of N nodes, your task is to delete every kth Node from the circular linked list until only one node is left. Also, print the intermediate lists

Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteK() that takes head node of circular linked list and the integer K as parameter.

Constraints:
1 <= K <= N <= 500
1 <= Node. data<= 1000
Output
Print the intermediate nodes until one node is left as shown in example.
Example
Sample Input:-
4 2
1 2 3 4

Sample Output:-
1->2->3->4->1
1->2->4->1
2->4->2
2->2


Sample Input:-
9 4
1 2 3 4 5 6 7 8 9

Sample Output:-
1->2->3->4->5->6->7->8->9->1
1->2->3->4->6->7->8->9->1
1->2->3->4->6->7->8->1
1->2->3->6->7->8->1
2->3->6->7->8->2
2->3->6->8->2
2->3->8->2
2->3->2
2->2*/



/*
 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static Node deleteK(Node head, int k){
//Enter your code here
printCircularList(head);
int c=0;
Node p=null;
Node s=head;
while(s!=s.next)
{
    if(c==k)
    {
        p.next=s.next;
        c=0;
        if(s==head)
        head=s.next;
        printCircularList(head);
    }
    p=s;
    c++;
    s=s.next;
}
return head;
} 

static void printCircularList(Node head)
{
   // System.out.print(head.data);
    Node s=head;
    int k=0;
    while(s!=head || k==0)
    { 
        k++;
        System.out.print(s.data+"->");
        s=s.next;
    }
    System.out.print(s.data);
    System.out.println();
}


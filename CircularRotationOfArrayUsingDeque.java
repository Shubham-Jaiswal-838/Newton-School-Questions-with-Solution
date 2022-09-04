/*
Circular Rotation of Array Using Deque
easy
Problem Statement
Given an array arr[] of N integers and another integer D, your task is to perform D right circular rotations on the array and print the modified array.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function circularRotate() which takes the deque, number of rotation and the number of elements in deque as parameters.

Constraint:
1 <= T <= 100
1 <= N <= 100000
1 <= elements <= 10000
1 <= D <= 100000
Output
You don't need to print anything you just need to complete the function.
Example
Input:
2
5
1 2 3 4 5
6
4
1 2 3 4
7

Output:
5 1 2 3 4
2 3 4 1*/



static void circularRotate(Deque<Integer> deq, int d, int n)
    {
        // Push first d elements 
        // from last to the beginning 
        for (int i = 0; i < d%n; i++) { 
            int val = deq.peekLast(); 
            deq.removeLast(); 
            deq.addFirst(val); 
        } 
    }

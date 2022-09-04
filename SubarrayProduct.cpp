/*
Subarray Product
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, A of N integers. Find the product of maximum values for every subarray of size K. Print the answer modulo 1000000007.

A subarray is any contiguous sequence of elements in an array.
Input
First line contains two integers N and K, denoting the size of array and the size of subarray respectively.
Next line contains N integers denoting the elements of the array.

1 <= K <= N <= 1000000
1 <= A[i] <= 1000000
Output
Print a single integer denoting the product of maximums for every subarray of size K modulo 1000000007
Example
Sample Input 1:
6 4
1 5 2 3 6 4

Sample Output 1:
180

Explanation:
For subarray [1, 5, 2, 3], maximum = 5
For subarray [5, 2, 3, 6], maximum = 6
For subarray [2, 3, 6, 4], maximum = 6
Therefore, ans = 5*6*6 = 180*/



#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
void printKMax(int arr[], int n, int k){
    std::deque<int> Qi(k);
    int i;
    long res = 1;
    for (i = 0; i < k; ++i){
        while ((!Qi.empty()) && arr[i] >= arr[Qi.back()])
            Qi.pop_back();
        Qi.push_back(i);
    }
    for (; i < n; ++i){
        res = (res * arr[Qi.front()])%1000000007;
        while ((!Qi.empty()) && Qi.front() <= i - k)
            Qi.pop_front();
        while ((!Qi.empty()) && arr[i] >=
                             arr[Qi.back()])
            Qi.pop_back();
        Qi.push_back(i);
    }
    res = (res * arr[Qi.front()])%1000000007;
    cout<<res<<endl;
    return;
}
int main() {
    int n,k;
    cin>>n>>k;
    int a[n];
    for(int i=0;i<n;i++)
        cin>>a[i];
    printKMax(a,n,k);
    return 0;
}


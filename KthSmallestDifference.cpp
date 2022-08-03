/*
Kth Smallest Difference
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of integers. Consider absolute difference between all the pairs of the the elements. You need to find Kth smallest absolute difference. If the size of the array is N then value of K will be less than N and more than or equal to 1.
Input
The first line of input contains number of test cases T.
The first line of each test case contains a two integers N and K denoting the number of elements in the array A and difference you need to output. The second line of each test case contains N space separated integers denoting the elements of the array A

Constraints:
1<= T <= 10
2 <= N <= 100000
1 <= K < N < 100000
0 <= A[i] <= 100000
Output
For each test case, output Kth smallest absolute difference.
Example
Input :
1
6 2
1 3 4 1 3 8

Output :
0

Explanation :
Test case 1: First smallest difference is 0, between the pair (1, 1) and second smallest absolute difference difference is also 0 between the pairs (3, 3).*/




#include<bits/stdc++.h>
using namespace std;

int countPairs(int *a, int n, int mid)
{
	int res = 0;
	for (int i = 0; i < n; ++i)


		res += upper_bound(a+i, a+n, a[i] + mid) -(a + i + 1);
	return res;
}


int kthDiff(int a[], int n, int k)
{

	sort(a, a+n);


	int low = a[1] - a[0];
	for (int i = 1; i <= n-2; ++i)
		low = min(low, a[i+1] - a[i]);


	int high = a[n-1] - a[0];


	while (low < high)
	{
		int mid = (low+high)>>1;
		if (countPairs(a, n, mid) < k)
			low = mid + 1;
		else
			high = mid;
	}

	return low;
}


int main()
{
	int t;
	cin>>t;

	for(int i=0;i<t;i++){
		int n;
		cin>>n;
		int k;
		cin>>k;

		int a[n];
		for(int j=0;j<n;j++){
			cin>>a[j];
		}
		cout << kthDiff(a, n, k)<<endl;
	}
	return 0;
}
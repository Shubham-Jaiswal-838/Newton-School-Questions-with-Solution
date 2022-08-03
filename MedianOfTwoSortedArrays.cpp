/*
Median of Two sorted Arrays
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two sorted arrays A and B of size n and m respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n))
Input
First line of input contains n, m the length of array A and B.
Next two lines contains input of array A and B.

Constraints
1 <= n, m <= 1000
-1e6 <= A[i], B[i] <= 1e6
Output
Print the median of two sorted arrays upto two decimal places.
Example
Sample Input :
2 1
1 3
2

Sample Output :
2.00*/





#include<bits/stdc++.h>
using namespace std;
#define int long long int
#define Shubham main

double getMedian(int  ar1[], int ar2[], int n, int m)
{
	int i = 0;
	int j = 0; 
	int  count;
	double m1 = -1, m2 = -1;

	for (count = 0; count <= (m + n)/2; count++)
	{

		m2=m1;
		if(i != n && j != m)
		{
			m1 = (ar1[i] > ar2[j]) ? ar2[j++] : ar1[i++];
		}
		else if(i < n)
		{
			m1 = ar1[i++];
		}

		else
		{
			m1 = ar2[j++];
		}
	}
	if((m + n) % 2 == 1){
		return m1;
	}
	else{
		return (m1+m2)/2;
	}
}
int32_t Shubham()
{
	int n1,n2;
	cin>>n1>>n2;
	int  ar1[n1];
	int ar2[n2];

	for(int i=0;i<n1;i++){
		cin>>ar1[i];
	}

	for(int i=0;i<n2;i++){
		cin>>ar2[i];
	}
	printf("%0.2f",getMedian(ar1, ar2, n1, n2));
}
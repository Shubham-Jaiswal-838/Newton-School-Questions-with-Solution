/*
Subarray minima
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array(Arr) of N Distinct integers. You have to find the sum of minimum element of all the subarrays (continous) in that array. See Sample for better understanding.
Input
The first line of input contains N, the size of the array
The second line of input contains N space-separated integers
Constraints
2 ≤ N ≤ 100000
1 ≤ Arr[i] ≤ 1000000000
Output
The output should contain single integers, the sum of minimum element of all the subarrays in that array.
Example
Sample Input
3
1 2 3

Sample Output
10

Explaination
all subarrays [1] [1,2] [1,2,3] [2] [2,3] [3]
Sum of minimums : 1 + 1 + 1 + 2 + 2 + 3 = 10*/




#include <bits/stdc++.h>
using namespace std;
#define int long long
int sumSubarrayMins(int A[], int n)
{
	int left[n], right[n];

	stack<pair<int, int> > s1, s2;

	for (int i = 0; i < n; ++i) {
		int cnt = 1;

		while (!s1.empty() && (s1.top().first) > A[i]) {
			cnt += s1.top().second;
			s1.pop();
		}

		s1.push({ A[i], cnt });
		left[i] = cnt;
	}


	for (int i = n - 1; i >= 0; --i) {
		int cnt = 1;


		while (!s2.empty() && (s2.top().first) >= A[i]) {
			cnt += s2.top().second;
			s2.pop();
		}

		s2.push({ A[i], cnt });
		right[i] = cnt;
	}

	int result = 0;

	for (int i = 0; i < n; ++i)
		result = (result + A[i] * left[i] * right[i]);

	return result;
}


int32_t main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}


	cout << sumSubarrayMins(arr, n);

	return 0;
}

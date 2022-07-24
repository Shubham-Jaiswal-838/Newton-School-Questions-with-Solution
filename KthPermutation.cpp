/*
Kth permutation
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
For a number N we have N! unique permutations. A permutation is a sequence of integers from 1 to N of length N containing each number exactly once.
For a positive integer X, X! = 1 * 2 * 3 *...* X-1 * X
Your task is to find the Kth smallest permutation when all possible permutations of size N are arranged in sorted order.
Input
Input contains only two integers, the value of N and K.

Constraints:-
1 <= N <= 10000
1 <= K <= min(N!,100000000)
Output
Print the Kth permutation in form of a string. i. e don't print spaces between two numbers.
Example
Sample Input:-
3 5

Sample Output:-
312

Explanation:-
All permutations of length 3 are:-
123
132
213
231
312
321

Sample Input:-
11 2

Sample Output:-
1234567891110*/


#include <bits/stdc++.h>
using namespace std;


int findFirstNumIndex(int& k, int n)
{

	if (n == 1)
		return 0;
	n--;

	int first_num_index;

	int n_partial_fact = n;

	while (k >= n_partial_fact
		&& n > 1) {
		n_partial_fact
			= n_partial_fact
			* (n - 1);
		n--;
	}


	first_num_index = k / n_partial_fact;

	k = k % n_partial_fact;

	return first_num_index;
}


string findKthPermutation(int n, int k)
{

	string ans = "";

	set<int> s;



	for (int i = 1; i <= n; i++)
		s.insert(i);

	set<int>::iterator itr;


	itr = s.begin();

	k = k - 1;

	for (int i = 0; i < n; i++) {

		int index
			= findFirstNumIndex(k, n - i);

		advance(itr, index);

		ans += (to_string(*itr));

	
		s.erase(itr);

		itr = s.begin();
	}
	return ans;
}

// Driver code
int main()
{

	int n , k;
	cin>>n>>k;

	string kth_perm_seq
		= findKthPermutation(n, k);

	cout << kth_perm_seq << endl;

	return 0;
}
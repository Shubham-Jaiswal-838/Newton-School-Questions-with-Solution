/*
Longest valid Parenthesis
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.
Input
Each test case have one line string S of character '(' and ')' of length N.

Constraints:
1 <= N <= 10^5
Output
Print the length of the longest valid parenthesis substring.
Example
Input
((()

Output
2

Input
)()())

Output
4*/




#include <bits/stdc++.h>
using namespace std;

int findMaxLen(string str)
{
	int n = str.length();
	stack<int> stk;
	stk.push(-1);
	int result = 0;

	for (int i = 0; i < n; i++)
	{
		if (str[i] == '(')
			stk.push(i);
		

		else
		{

			if (!stk.empty())
			{
				stk.pop();
			}
			

			if (!stk.empty())
				result = max(result, i - stk.top());

			else
				stk.push(i);
		}
	}

	return result;
}
int main()
{
	string str;
	cin>>str;
	cout << findMaxLen(str) << endl;


	return 0;
}

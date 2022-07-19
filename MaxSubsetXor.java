/*
Max subset XOR
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a set of positive integers. Find the maximum xor of a non-empty subset from the given set.
Input
The first line contains an integer N denoting the number of elements in the set.
The next line contains N integers denoting the elements of the set.

1 <= N <= 10^5
1 <= Elements of set <= 10^9
Output
Print the maximum subset Xor.
Example
Sample Input:
3
2 4 5

Sample Output:
7

Explanation:
Subset {2, 5} has the maximum xor

Sample Input:
3
9 8 5

Sample Output:
13

Explanation:
Subset {8, 5} has the maximum xor*/


import java.io.*;
import java.util.*;

class Main {

static final int INT_BITS = 32;

static int maxSubarrayXOR(int set[], int n)
{

	int index = 0;

	for (int i = INT_BITS - 1; i >= 0; i--)
	{
	int maxInd = index;
	int maxEle = Integer.MIN_VALUE;
	for (int j = index; j < n; j++) {
		
		if ((set[j] & (1 << i)) != 0 && set[j] > maxEle)
		{
		maxEle = set[j];
		maxInd = j;
		}
	}

	if (maxEle == -2147483648)
		continue;

	int temp = set[index];
	set[index] = set[maxInd];
	set[maxInd] = temp;


	maxInd = index;


	for (int j = 0; j < n; j++) {
		

		if (j != maxInd && (set[j] & (1 << i)) != 0)
		set[j] = set[j] ^ set[maxInd];
	}

	index++;
	}

	int res = 0;
	for (int i = 0; i < n; i++)
	res ^= set[i];
	return res;
}

public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
	int set[] = new int[num];

    for(int i=0; i<set.length; i++){
       set[i]=sc.nextInt();
    }

	int n = set.length;

	// System.out.print("Max subset XOR is ");
	System.out.print(maxSubarrayXOR(set, n));
}
}

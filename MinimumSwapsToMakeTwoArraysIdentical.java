/*
Minimum swaps to make two arrays identical
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two arrays of size N which have the same values but in different orders, we need to make a second array the same as a first array using a minimum number of swaps.

Note:- It is guaranteed that the elements of the array are unique
Input
First line of input contains the size of array N, second line of input contains N space separated integers depicting values of first array, third line of input contains N space separated integers depicting values of second array.

Constraints:-
1 < = N < = 10000
1 < = Arr[i] < = 1000000000
Output
Print the minimum number of swaps required to make the second array equal to first.
Example
Sample Input:-
5
1 2 3 4 5
3 1 2 5 4

Sample Output:-
3

Sample Input:-
4
3 6 4 8
4 6 8 3

Sample Output:-
2*/



import java.io.*;
import java.util.*;
class Main
{

static int minSwapsToSort(int arr[], int n)
{

	ArrayList<ArrayList<Integer>> arrPos = new ArrayList<ArrayList<Integer>>();
	for (int i = 0; i < n; i++)
	{
	arrPos.add(new ArrayList<Integer>(Arrays.asList(arr[i],i)));
	}

	// Sort the array by array element values to
	// get right position of every element as second
	// element of pair.
	Collections.sort(arrPos, new Comparator<ArrayList<Integer>>() {
	@Override
	public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
		return o1.get(0).compareTo(o2.get(0));
	}			
	});

	// To keep track of visited elements. Initialize
	// all elements as not visited or false.
	boolean[] vis = new boolean[n];

	// Initialize result
	int ans = 0;

	// Traverse array elements
	for (int i = 0; i < n; i++)
	{

	// already swapped and corrected or
	// already present at correct pos
	if (vis[i] || arrPos.get(i).get(1) == i)
		continue;

	// find out the number of node in
	// this cycle and add in ans
	int cycle_size = 0;
	int j = i;
	while (!vis[j])
	{
		vis[j] = true;

		// move to next node
		j = arrPos.get(j).get(1);
		cycle_size++;
	}

	// Update answer by adding current cycle.
	ans += (cycle_size - 1);
	}

	// Return result
	return ans;
}

// method returns minimum number of swap to make
// array B same as array A
static int minSwapToMakeArraySame(int a[], int b[], int n)
{

	// map to store position of elements in array B
	// we basically store element to index mapping.
	Map<Integer, Integer> mp
	= new HashMap<Integer, Integer>();

	for (int i = 0; i < n; i++)
	{
	mp.put(b[i], i);
	}

	// now we're storing position of array A elements
	// in array B.
	for (int i = 0; i < n; i++)
	b[i] = mp.get(a[i]);

	/* We can uncomment this section to print modified
		b array
		for (int i = 0; i < N; i++)
			cout << b[i] << " ";
		cout << endl; */

	// returning minimum swap for sorting in modified
	// array B as final answer
	return minSwapsToSort(b, n);
}

// Driver code
public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
	int a[] = new int[num];
	int b[] = new int[num];

    for(int i=0; i<num; i++){
        a[i]=sc.nextInt();
    }
    for(int i=0; i<num;i++){
        b[i]=sc.nextInt();
    }

	int n = a.length;

	System.out.println( minSwapToMakeArraySame(a, b, n));
}
}
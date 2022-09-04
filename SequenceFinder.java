/*
Sequence finder
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of 3N integers and you have to find a subsequence of length 2N of that array such that the ((sum of first N elements of that subsequence) - (sum of last N elements of that subsequence)) is maximum possible. Find that maximum value.
Input
First Line of input contains single integer N
Second line of input contains 3N space separated integers denoting the Array

Constraints
1 <= N <= 100000
1 <= Arr[i] <= 1000000000
Output
Output a single integer which is the maximum value of ((sum of first N elements of that subsequence) - (sum of last N elements of that subsequence))
Example
Sample Input 1
2
3 1 4 1 5 9

Sample Output 1
1

Explaination 1
sequece selected : 3 4 1 5


Sample Input 2
1
1 2 3

Sample Output 2
-1

Explaination 2
sequece selected : 1 2*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class MinPair implements Comparable<MinPair>{
	long value;
	int index;
	MinPair(long value, int index){
		this.value = value;
		this.index = index;
	}
	public int compareTo(MinPair mp) {
         if(this.value > mp.value){
			 return 1;
		 }
		 else if(this.value == mp.value){
			 return 0;
		 }
		 else{
			 return -1;
		 }
    }
}

class MaxPair implements Comparable<MaxPair>{
	long value;
	int index;
	MaxPair(long value, int index){
		this.value = value;
		this.index = index;
	}
	public int compareTo(MaxPair mp) {
		if(this.value > mp.value){
			 return -1;
		 }
		 else if(this.value == mp.value){
			 return 0;
		 }
		 else{
			 return 1;
		 }
    }
}

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[3*n];
		for(int i = 0; i < 3*n; i++){
			arr[i] = sc.nextLong();
		}

		PriorityQueue<MinPair> minHeap1 = new PriorityQueue<>();
		PriorityQueue<MaxPair> maxHeap = new PriorityQueue<>();
		PriorityQueue<MinPair> minHeap2 = new PriorityQueue<>();

		int c[] = new int[3*n];
		Arrays.fill(c, 1);
		long sum1 = 0, sum2 = 0;
		for(int i = 0; i < n; i++){
			minHeap1.add(new MinPair(arr[i], i));	
			sum1 += arr[i];
		}
		for(int i = n; i < 3*n; i++){
			maxHeap.add(new MaxPair(arr[i], i));
			sum2 += arr[i];
		}
		for(int i = 0; i < n; i++){
			MaxPair pair = maxHeap.remove();
			sum2 -= pair.value;
			c[pair.index] = 0;
			minHeap2.add(new MinPair(pair.value, pair.index));
		}

		long ans = sum1 - sum2;
		for(int i = n; i < 2*n; i++){
			if(c[i] == 1){
				sum2 -= arr[i];
				MinPair pair = minHeap2.remove();
				while(pair.index <= i){
					pair = minHeap2.remove();
				}
				sum2 += pair.value;
				c[pair.index] = 1;
			}
			minHeap1.add(new MinPair(arr[i], i));
			sum1 += arr[i];
			c[i] = 1;
			MinPair pair = minHeap1.remove();
			sum1 -= pair.value;
			c[pair.index] = 0;
			ans = Math.max(ans, sum1 - sum2);
		}
		System.out.println(ans);
	}
}

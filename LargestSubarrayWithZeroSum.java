/*
Largest subarray with zero sum
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[], of length N containing values in the range of negative to positive integers. You need to find the length of the largest subarray whose sum of elements is 0.
Input
The first line contains N denoting the size of the array A. Then in the next line contains N space-separated values of the array A.

Constraints:-
1 <= N <= 1e5
-1e6 <= A[i] <= 1e6
Output
Print the length of the largest subarray which has sum 0, If no subarray exist print -1.
Example
Sample Input:-
8
15 -2 2 -8 1 7 10 23

Sample Output:-
5

Explanation:-
-2 2 -8 1 7 is the required subarray

Sample Input:-
5
1 2 1 2 3

Sample Output:-
-1*/





import java.util.*;

class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
        int[] arr = new int[num];

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
        

    Map<Integer, Integer> map = new HashMap<>();

    int prefixSum = 0;
    int maxLength = -1;

    // map.put(0,-1);
    
    for(int i =0; i< arr.length; i++){
        prefixSum += arr[i];
        
        if(prefixSum == 0){
            int len = i + 1;
            maxLength = Math.max(maxLength, len);
        }
        
        if(map.containsKey(prefixSum)){
            int len = i - map.get(prefixSum);
            maxLength = Math.max(maxLength, len);
        }else{
            map.put(prefixSum, i);
        }
    }

    System.out.println(maxLength);
    
        
    }
}

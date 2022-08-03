/*
Check if array is sorted and rotated clockwise
Easy

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr[] of N distinct integers, check if this array is Sorted and Rotated clockwise.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Note:-Array can be sorted both increasingly and decreasingly
Input
The first line of input contains number of testcases T. Each testcase contains 2 lines, the first line contains N, the number of elements in array, and second line contains N space separated elements of array.

Constraints:
1 <= T <= 50
3 <= N <= 10^3
1 <= A[i] <= 10^4



Output
Print "Yes" if the given array is sorted and rotated, else Print "No", without Inverted commas.
Example
Sample Input:
2
4
3 4 1 2
3
1 3 2

Sample Output:
Yes
Yes

Explanation:
Testcase 1: The array is sorted (1, 2, 3, 4) and rotated twice (3, 4, 1, 2).
Testcase 2: The array is sorted (3, 2, 1) and rotated once (1, 3, 2).*/



import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine());
		    int arr[] = new int[(int)n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(long i=0; i<n; i++){
		        arr[(int)i] = Integer.parseInt(inputLine[(int)i]);
		    }
		long mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE; 
        long max_index = 0, min_index = 0;
        for(long i=0; i<n; i++){
            if(maxi < arr[(int)i]){
                maxi = arr[(int)i];
                max_index = i;
            }
            if(mini > arr[(int)i]){
                mini = arr[(int)i];
                min_index = i;
            }
        }
        
        int flag = 0;
        if(max_index == min_index -1)
            flag = 1;
        else if(min_index == max_index - 1)
            flag = -1;
        
        if(flag == 1){
            for(long i = 1; flag==1 && i<=max_index; ++i){
                if(arr[(int)i-1] >= arr[(int)i])
                    flag = 0;
            }
            for(long i = min_index+1; flag==1 && i<n; ++i){
                if(arr[(int)i-1] >= arr[(int)i])
                    flag = 0;
            }
            if(arr[0]<=arr[(int)n-1])
                flag = 0;
        } else if(flag == -1){
            for(long i = 1; flag ==-1 && i<=min_index; ++i){
                if(arr[(int)i-1] <= arr[(int)i])
                    flag = 0;
            }
            for(long i = max_index+1; flag==-1 && i<n; ++i){
                if(arr[(int)i-1] <= arr[(int)i])
                    flag = 0;
            }
            if(arr[0]>=arr[(int)n-1])
                flag = 0;
        }
        
        if(flag == 0)
            System.out.println("No");
        else
            System.out.println("Yes");
		}
	}
}
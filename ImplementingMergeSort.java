/*
Implementing Merge Sort
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array, your task is to sort the array using merge sort.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
arr: input array
start: starting index which is 0
end: ending index of array

Constraints
1 <= T <= 100
1 <= N <= 10^4
1 <= Arr[i] <= 10^5

Sum of 'N' over all test cases does not exceed 10^6
Output
You need to return the sorted array. The driver code will print the array in sorted form.
Example
Sample Input:
2
3
3 1 2
3
4 5 6

Sample Output:
1 2 3
4 5 6*/



static int temp[] = new int[10001]; //global array
public static void merge(int[] arr, int start, int mid, int end){
      for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
      }
      //temp = [12, 15, 37, 83, 10 13, 19, 40], j
      // arr = [10, 12, 13, 15, 19, 37, 40, 83], index
      int i = start;
      int j = mid + 1;
      int index = start;
      while(i <= mid && j <= end){
            if(temp[i] <= temp[j]){
                  arr[index] = temp[i];
                  i++;
            }
            else{
                  arr[index] = temp[j];
                  j++;
            }
            index++;
      }
      while(i <= mid){
            arr[index] = temp[i];
            index++;
            i++;
      }
      while(j <= end){
            arr[index] = temp[j];
            index++;
            j++;
      }
}

public static void mergeSort(int arr[], int start, int end){
      //if array is size 1, start == end ? 
      if(start >= end){
            //stop splitting
            return;
      }
      int mid = (start) + (end - start) / 2;
      mergeSort(arr, start , mid); //left call
      mergeSort(arr, mid+1 , end); //right call
      merge(arr, start, mid, end); //merge [start...mid] [mid+1...end]
}



public static int[] implementMergeSort(int arr[], int start, int end) //start = 0, end = n-1
{
      mergeSort(arr, start, end);
      return arr;
}
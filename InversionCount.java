/*
Inversion count
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Calculate inversion count of array of integers.
Inversion count of an array is quantisation of how much unsorted an array is. A sorted array has inversion count 0, while an unsorted array has maximum inversion count.
Formally speaking inversion count = number of pairs i, j such that i < j and a[i] > a[j].
Input
The first line contain integers N.
The second line of the input contains N singly spaces integers.

1 <= N <= 100000
1 <= A[i] <= 1000000000
Output
Output one integer the inversion count.
Example
Sample Input
5
1 1 3 2 2

Sample Output
2

Sample Input
5
5 4 3 2 1

Sample Output
10*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

      static long count = 0;

      static long temp[] = new long[100001]; //global array

      public static void merge(long[] arr, int start, int mid, int end){
            for(int i = start; i <= end; i++){
                  temp[i] = arr[i];
            }

            int i = start;
            int j = mid + 1;
            int index = start;
            while(i <= mid && j <= end){
                  if(temp[i] <= temp[j]){
                        /*no inversion*/
                        arr[index] = temp[i];
                        i++;
                  }
                  else{
                        /*inversion*/
                        arr[index] = temp[j];
                        count += mid + 1 - i; //inversion count
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

      public static void mergeSort(long arr[], int start, int end){
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

	public static void main (String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long array[] = new long[n];
            for(int i = 0; i < n; i++){
                  array[i] = sc.nextLong();
            }
            mergeSort(array, 0, n - 1);
            System.out.println(count);

	}
}
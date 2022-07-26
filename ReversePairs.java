/*
Reverse Pairs
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Print the number of reverse pairs in the array given an integer array nums.

A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] > 2 * nums[j].
Input
The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

Constraints:
0<= n <=10000
Output
Print the number of reverse pairs in the array.
Example
Sample Input 1:
4
1 3 4 5
Output 1:
0

Sample Input 2:
6
6 5 4 3 2 1
Output 2:
6*/





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] res = new int[1];
        mergeSort(nums, 0, n - 1, res);
        return res[0];
    }

    public void mergeSort(int[] nums, int start, int end, int[] res) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid, res);
        mergeSort(nums, mid + 1, end, res);

        int count = 0;
        int left = start, right = mid + 1;

        while (left <= mid) {
            if (right <= end && (nums[left] > 2 * (long)nums[right])) {
                ++count;
                ++right;
            }
            else {
                res[0] += count;
                ++left;
            }
        }
        merge(nums, start, mid, end);
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            }
            else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= end) {
            temp[k++] = nums[j++];
        }

        for (int m = start; m <= end; m++) {
            nums[m] = temp[m - start];
        }
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      int num = sc.nextInt();

      int[] arr = new int[num];
      for(int i=0; i<num; i++){
          arr[i]=sc.nextInt();

      }
      Main obj = new Main();
      System.out.println(obj.reversePairs(arr));
    }
}
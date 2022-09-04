/*
Zero Window Sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array arr of length "n" and a window of size "k". Your task is to find the window with zero sum. If there exists multiple windows, you need to print the first occurring window index and index start with 1 and if no such window exists print -1.
Input
The first line of the input contains n, k.
The second line of the input contains the value of the array.

Constraints
1 <= k < n <= 1e5
arr[i] lies in [-1, 0, 1]
Output
Print the window number, If multiple such windows exists print the first window number with zero sum, If no window exists print -1.
Example
Sample Input 1:
4 3
1 0 -1 1

Sample Output 1:
1*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
                      int n=sc.nextInt();
                      int k=sc.nextInt();
                      int arr[]=new int[n];
                      for(int p=0;p<n;p++){
                          arr[p]=sc.nextInt();
                      }
                      int i=0;
                      int j=0;
                      int sum=0;
                      int winc=0;
                      
                      while(j<n-1){
                          if((j-i+1)<k){
                              sum+=arr[j];
                              j++;
                              if((j-i+1)==k){
                                  winc++;
                                  sum+=arr[j];
                                  if(sum==0){
                                     System.out.print(winc);
                                     return;
                                  }
                              }
                          }else{
                              sum-=arr[i];
                              i++;
                              j++;
                              sum+=arr[j];
                              winc++;
                              if(sum==0){
                                  System.out.print(winc);
                                  return;
                              }

                          }

                      }
                      System.out.print("-1");
    }
}

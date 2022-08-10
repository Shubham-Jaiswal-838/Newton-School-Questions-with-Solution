/*
Total ways
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A message containing letters from A - Z is been encoded to numbers using the alphabetical order of the number i. e A - > 1, B - > 2,. , Z - >26.
Given the encoded message your task is to print the number of ways the message can be decoded.
Input
Input contains a single line containing the string S.

Constraints:-
1 < = N < = 5000

Note:- String will only contains integers from 0-9
Output
Print the number of ways to decode the message.

Note: Since answer can be quite large print your answer modulo 10^9 + 7
Example
Sample Input:-
226

Sample Output:-
2

Explanation:-
BZ VF BBF are the only possible decoded messages

Sample Input:-
102

Sample Output:-
1

Explanation:-
JB is the only possibility*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static int mod = 1000000007;

	 static int decodeMessage(int[] dp, int s, String str, int n)
  {
     
    if(s >= n)
      return 1;

    if(dp[s] != -1)
      return dp[s];
 
    int num,tc;
    num = tc = 0;
    for(int i=s;i<n;i++)
    {
      // generate the number
      num = num*10 + ((int)str.charAt(i) - '0');
 
      if(num >= 1 && num <= 26)
      {

        int c = decodeMessage(dp, i + 1, str, n);

        tc = (tc%mod + c%mod)%mod;
      }

      else
        break;
    }
 
    return (dp[s] = tc);
  }
  static int CountWays(String str)
  {
    int n = str.length();
 
    if(n == 0)
      return 1;

    int[] dp = new int[n];
    for(int i = 0; i < n; i++){
      dp[i] = -1;
    }
 
    // return the result
    return decodeMessage(dp,0,str,n);
  }
	// Driver code
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

		System.out.println(CountWays(str));
	}
}



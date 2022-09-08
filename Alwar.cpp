/*
Alwar
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
On his way to Alwar, Bunty noticed 10^K road signs (numbered 0 through 10^K −1). For each valid i, the sign with the number i had the integer i written on one side and 10^K- i-1 written on the other side.
Now, Alwar is wondering — how many road signs have exactly two distinct decimal digits written on them (on both sides in total)? Since this number may be large, compute it modulo 10^9+7.
For example, if K = 3, the two integers are written on the road sign 363 are 363 and 636, and they contain two distinct digits 3 and 6, but on the road sign 362, there are integers 362 and 637, which contain four distinct digits — 2, 3, 6 and 7. On- road signs 11, there are integers 11 and 988, which contain three distinct digits — 1, 9, and 8.
Input
The input begins with a single integer T specifying the number of test cases. The following is a description of T test cases.
Each test case's first and only line comprises a single integer K.

Constraints:
1<= T <= 10^5
1<= K <= 10^9
Output
Print a single line for each test case containing one integer — the number of road signs with exactly two digits, modulo 10^9+7.
Example
Sample Input:
1
2
Sample Output:
20*/


#include <iostream>
#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
long long binpow(long long a, long long b, long long m) {
    a %= m;
    long long res = 1;
    while (b > 0) {
        if (b & 1)
            res = res * a % m;
        a = a * a % m;
        b >>= 1;
    }
    return res%m;
}

int main() {
	// your code goes here
	int t;cin>>t;
	while(t--){
	    ll k;cin>>k;
	    ll ans=0;
	    ans=(10*binpow(2,k-1,1000000007));
	    cout<<(ans)%1000000007<<"\n";
	}
	return 0;
}


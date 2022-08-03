/*
EVM Machine
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
During the elections, Bob is in charge of conducting voting in his village, but the EVM system malfunctioned, and there was a long line of voters waiting outside to vote. The following is how the Advanced EVM Machine works.
Each time when a voter scans his VoterId Card and votes for the party of his choice, the Voter's id and Party Name are registered in the background, and if the same voter votes again, the EVM does not capture his vote, then the vote is skipped and the vote given the first time is used.
Now that you are Bob's best mate, you can't bear to see him in such a strained situation when outside voters are being very aggressive and screaming at him. Can you easily write a piece of code to save your friend's life while Bob is busy calming down the outside situation?
Input
The number N (1 ≤ N ≤ 1e5) appears on the first line. The queries to the machine are included in the next n lines. Each request consists of two strings and is written on a non- empty line. The first string is an Voter Card Id, and the second string is the Party Name, all of which are atmost 32 characters long both upper case and lower case possible.

Constraints
1 ≤ N ≤ 100000
1 ≤ Voter Id length ≤ 40
1 ≤ PartyName length ≤ 32
Output
Output a single line indicating which party has won and by how many votes. In case of a draw between parties print all the parties with the same winning vote, in lexographically increasing order on basis of Party Name.
Example
Sample Input
4
12678345 BJP
57891082 Congress
12678345 AAP
65489 TMC

Sample Output
BJP 1
Congress 1
TMC 1

Explanation : As Winning Parties here as BJP, Congress, TMC with 1 vote(s) each, but AAP vote is not considered because the same VoterId - 12678345 has done a vote again.*/








#include <bits/stdc++.h> 
using namespace std;
#define lli long long int
bool campare(pair<string,lli>&a,pair<string,lli>&b){
	if(a.second==b.second)
	return a.first<=b.first;
	return a.second>b.second;
}
int main() {
    lli n;
	cin>>n;
	unordered_map<string,lli>ms,mp;
	for(lli i=0;i<n;i++){
		string s,sp;
		cin>>s>>sp;
		if(ms.find(s)==ms.end())
			mp[sp]++;
			ms[s]++;
		
	}
	vector<pair<string,lli> >v;
	for(auto x:mp){
		v.push_back({x.first,x.second});
	}
	sort(v.begin(),v.end(),campare);
	lli g=v[0].second;
    for(lli i=0;i<v.size();i++){
		if(g==v[i].second)
		cout<<v[i].first<<" "<<v[i].second<<endl;
	}

	return 0;
}

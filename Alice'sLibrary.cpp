/*
Alice's library
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alice is rearranging her library. She takes the innermost shelf and reverses the order of books. She breaks the walls of the shelf. In the end, there will be only books and no shelf walls. Print the order of books.
Opening and closing walls of shelves are shown by '/' and '\' respectively whereas books are represented by lower case alphabets.
Input
The first line contains string s displaying her library.

Constraints
2 ≤ |s| ≤ 103
Output
Print only one string displaying Alice's library after rearrangement.
Example
Sample input
/u/love\i\

Sample Output
iloveu

Explanation
/u/love\i\
Here Alice breaks the inner most shelf and reverse the order. So the library will be /uevoli\.
Now she breaks the outermost wall and reverses the order. So the library will be iloveu.*/





#include<bits/stdc++.h>
using namespace std;

int st[1000];
int top=-1;

// function for push the element
// into stack
int pop()
{
    int l=st[top];
    top--;
    return l;
}

//function for pop
// element from stack
void push(int n)
{
    top++;
    st[top]=n;
}

//Driver program
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    string str;
    cin>>str;
    for(int i=0;i<str.size();i++)
    {
        if(str[i]=='/')
          push(i);

        if(str[i]=='\\')
        {
            int l=pop();
            char temp;
            int m=i-1;

            // this is for reverse
            // the string
            for(int j=l+1;j<=(i+l)/2;j++)
            {
                temp=str[j];
                str[j]=str[m];
                str[m]=temp;
                m--;
                
            }
            string ans="";
            // copying str into ans
            for(int j=0;str[j];j++)
            {
                if(j!=l && j!=i)
                  ans+=str[j];
            }
            str=ans;
            i=i-2;
        }

    }
    cout<<str;
    return 0;
}


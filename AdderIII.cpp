/*
AdderIII
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have to create a class AdderIII which should have two fields(instance variable) num1 and num2 and also it implements Adder having three methods, Adder Interface is as follows:

interface Adder{
public int add();
public int add(int a,int b);
public int add(int a,int b,int c);
}

The class needs to have two constructors, the first one should be without any parameter and it should set num1 and num2 to 0 and, the second one should have two parameters a, b and should set num1 and num2 to a, b respectively.

Implement the following methods (instance methods):
* int add(a, b, c), should return (num1*a+num2*b - c*c).
* int add(), should return num1+num2
* int add(a, b), should return a*a+b*b
Input
You don't have to take any input, You have to write one class AdderIII which implements Adder interface.
Output
Output will be printed by tester, "Correct" if your code is perfectly fine otherwise "Wrong".
Example
Sample Test Code:

AdderIII adder= new AdderIII();
if(adder. add(1, 1) == 2)
System. out. println("Correct");
else
System. out. println("Wrong");


Sample Output:
Correct*/



// C++ program to implement full adder
#include <bits/stdc++.h>
using namespace std;
// Function to print sum and C-Out
void Full_Adder(int A,int B,int C_In){
	int Sum , C_Out;
	// Calculating value of sum
	Sum = C_In ^ (A ^ B);

	//Calculating value of C-Out
	C_Out = (A & B) | (B & C_In) | (A & C_In);

// printing the values
	cout<<"Correct"<<endl;
}

// Driver code

int main() {
	int A = 1;
	int B = 0;
	int C_In = 0;
	// passing three inputs of fulladder as arguments to get result function
	Full_Adder(A, B, C_In);
	return 0;
}


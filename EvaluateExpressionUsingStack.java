/*
Evaluate Expression using Stack
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a postfix expression, your task is to evaluate given expression.

Infix expression: The expression of the form a operator b. When an operator is in-between every pair of operands.
Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.
Input
The first line denotes the size of the string(which contains number or operand in form of string) i.e. N.
The next line contains string. The string contains an integer called operand or any of the four operators (+ - * /)

Constraints:-
1 <= n <= 40
1<=number<=500
Output
Output the value of arithmetic expression formed using reverse Polish Notation.
Example
Input 1:
5
2 1 + 3 *
Output 1:
9

Explaination 1:
starting from backside:
*: ( )*( )
3: ()*(3)
+: ( () + () )*(3)
1: ( () + (1) )*(3)
2: ( (2) + (1) )*(3)
((2)+(1))*(3) = 9

Input 2:
5
4 13 5 / +
Output 2:
6

Explaination 2:
+: ()+()
/: ()+(() / ())
5: ()+(() / (5))
1: ()+((13) / (5))
4: (4)+((13) / (5))
(4)+((13) / (5)) = 6*/





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code 
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.nextLine());
	String s[]=sc.nextLine().split(" ");
	Stack <Integer> st=new Stack<>();
	for(int i=0;i<n;i++)
	{
       if(s[i].equals("+")||s[i].equals("-")||s[i].equals("*")||s[i].equals("/"))
	   {
		   int a=st.pop();
		   int b=st.pop();
		   int res=0;
		   String c=s[i];
		   switch(c)
		   {
			   case "+":
			   res=a+b;
			   break;
			   case "-":
			   res=b-a;
			   break;
			   case "*":
			   res=a*b;
			   break;
			   case "/":
			   res=b/a;
			   break;
		   }
		   st.push(res);
	   }
	   else
	   {
		   st.push(Integer.parseInt(s[i]));
	   }
	}
	System.out.println(st.pop());
	}
}
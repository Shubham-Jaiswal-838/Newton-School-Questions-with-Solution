/*
Infix to Postfix
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an infix expression, your task is to convert it into postfix.

Infix expression: The expression of the form a operator b. When an operator is in- between every pair of operands.
Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.

Valid operators are +, - , *, /, ^. Each operand is an uppercase english alphabet. Infix expression may contains parenthesis as '(' and ')'.

See example for better understanding.
Input
The input contains a single string of infix expression.

Constraints:-
1 <= |String| <= 40
Output
Output the Postfix expression.
Example
Sample Input:-
((A-(B/C))*((A/K)-L))

Sample Output:-
ABC/-AK/L-*

Sample Input:-
A+B

Sample Output:-
AB+*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) 
    {   Scanner kb=new Scanner(System.in);
        String infix=kb.next();
        System.out.println(infixToPostfix(infix));    
    }
    static String infixToPostfix(String exp)
    {   String result = new String("");
        Stack<Character> stack = new Stack<>();     
        for (int i = 0; i<exp.length(); ++i)
        {   char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')')
            {   while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                    stack.pop();
            }
            else // an operator is encountered
            {       while (!stack.isEmpty() && Prec(c)<= Prec(stack.peek())){
                    result += stack.pop();
             }
            stack.push(c);
            }  
        }
        while (!stack.isEmpty())
        {   if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }
    static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
}



/*
Finding roots
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to find roots of a quadratic equation using switch case.
Input
The first line of the input contains the three float values a, b, and c of equation ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25 + i2.22
-0.25 - i2.22*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    float a = (float)sc.nextFloat();
    float b =(float) sc.nextFloat();
    float c = (float)sc.nextFloat();
    float d = (float)((b*b)-(4*a*c));
    float e=(float)(-b/(2*a));
    float f=0.0f;
    float g=0.0f;
    int h = 0;
    if(d>0){
        h=1;
    }
    else if(d<0){
        h=-1;
    }
    else{
        h=0;
    }

    switch(h){

      case 1 :f=(float)Math.sqrt(d);

            g=(float)f/(2*a);

            float r1=e+g;

            float r2=e-g;

            System.out.printf("%.2f",r1);

            System.out.println();

            System.out.printf("%.2f",r2);

            break;
     
      case -1 : f=(float)Math.sqrt(-d);

            g=(float)f/(2*a);

            String str1=String.format("%.2f",e);

            String str2=String.format("%.2f",g);

            System.out.printf(str1+"+i"+str2);

            System.out.println();

            System.out.printf(str1+"-i"+str2);

            break;

      case 0 :  

            f=(float)Math.sqrt(d);

            g=(float)f/(2*a);

            System.out.printf("%.2f",e);

            break;



    }
    }
}
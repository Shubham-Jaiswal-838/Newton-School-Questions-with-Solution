/*
Shapes - Class Inheritance
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Complete the Main class. Implement the getArea() and getPerimeter() methods for the child classes Parallelogram, Rhombus, Rectangle, and Square having Abstract class Quadrilateral as a parent class.


Do not change the name of any class
Input
The first line of input contains side1, side2 and height of the parallelogram
The second line of input contains side and height of rhombus
The third line of input contains length and height of the rectangle
The fourth line of input contains side of square

If the length of any side or height for any shape is negative, then print Length of a side cannot be negative. Please Enter a positive integer.
Output
"Perimeter of Parallelogram is " + parallelogram.getPerimeter() +" and Area of Parallelogram is " + parallelogram.getArea()
"Perimeter of Rhombus is " + rhombus.getPerimeter() +" and Area of Rhombus is " + rhombus.getArea()
"Perimeter of Rectangle is " + rectangle.getPerimeter() +" and Area of Rectangle is " + rectangle.getArea()
"Perimeter of Square is " + square.getPerimeter()+ " and Area of Square is " + square.getArea()



Example
Sample Input 1:
1.0 2.0 3.0
7.0 5.0
4.0 2.0
6.0

Sample Output 2:
Perimeter of Parallelogram is 6.0 and Area of Parallelogram is 3.0

Perimeter of Rhombus is 28.0 and Area of Rhombus is 35.0

Perimeter of Rectangle is 12.0 and Area of Rectangle is 8.0

Perimeter of Square is 24.0 and Area of Square is 36.0


Sample Input 2:
3.0 9.0 7.0
6.0 4.0
-1.0 5.0
8.0

Sample Output 2:
Length of a side cannot be negative. Please Enter a positive integer*/




import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
   double side1;
   double side2;
   double side3;
   double side4;

   public Quadrilateral(double side1, double side2, double side3, double side4) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
       this.side4 = side4;
   }

   protected abstract double getArea();

   protected double getPerimeter() {
       return (side1+side2+side3+side4);
   }
}

// Implement class Parallelogram and methods getArea() and getPerimeter()
class Parallelogram extends Quadrilateral {
    //Write your code here
    double p1,p2,p3;
    Parallelogram(){
        super(-1,-1,-1,-1);
        this.p1 = -1.0;
        this.p2 = -1.0;
        this.p3 = -1.0;
    }
    Parallelogram(double p1,double p2,double p3){
        super(-1,-1,-1,-1);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double getArea(){
        return p1*p3;
    }
    public double getPerimeter() {
       return (2*p1 + 2*p2);
   }
}

// Implement class Rhombus and methods getArea() and getPerimeter()
class Rhombus extends Parallelogram {
    double r1,r2;
    Rhombus(){
        super(-1,-1,-1);
        this.r1 = -1;
        this.r2 = -1;
    }
    Rhombus(double r1,double r2){
        super(-1,-1,-1);
        this.r1 = r1;
        this.r2 = r2;
    }
    public double getArea(){
        return r1*r2;
    }
    public double getPerimeter() {
       return 4*r1;
   }
}

//Implement class Rectangle and methods getArea() and getPerimeter()
class Rectangle extends Parallelogram {
    //Write your code here
    double rec1,rec2;
    Rectangle(){
        super(-1,-1,-1);
        this.rec1 = -1;
        this.rec2 = -1;
    }
    Rectangle(double rec1,double rec2){
        this.rec1 = rec1;
        this.rec2 = rec2;
    }
    public double getArea(){
        return rec1*rec2;
    }
    public double getPerimeter() {
       return 2*(rec1+rec2);
   }
}
//Implement class Square and methods getArea() and getPerimeter()
class Square extends Rhombus {
    //Write your code here
    double s;
    Square(){
        super(-1,-1);
        this.s = -1;
    }
    Square(double s){
        this.s = s;
    }
    public double getArea(){
        return s*s;
    }
    public double getPerimeter() {
       return 4*s;
   }
}
// Do not edit the Main class
class Main {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double p1 = scan.nextDouble();
       double p2 = scan.nextDouble();
       double p3 = scan.nextDouble();
       double r1 = scan.nextDouble();
       double r2 = scan.nextDouble();
       double rec1 = scan.nextDouble();
       double rec2 = scan.nextDouble();
       double s = scan.nextDouble();
       if(p1<0||p2<0||p3<0||r1<0||r2<0||rec1<0||rec2<0||s<0)
         System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
        else{
       Parallelogram p = new Parallelogram(p1,p2,p3);
       double parea = p.getArea();
       double pperi = p.getPerimeter();
       System.out.println("Perimeter of Parallelogram is " + pperi +  " and Area of Parallelogram is " + parea);
       Rhombus r = new Rhombus(r1,r2);
       double rarea = r.getArea();
       double rperi = r.getPerimeter();
       System.out.println("Perimeter of Rhombus is " + rperi +  " and Area of Rhombus is " + rarea);
       Rectangle rec = new Rectangle(rec1,rec2);
       double recarea = rec.getArea();
       double recperi = rec.getPerimeter();
       System.out.println("Perimeter of Rectangle is " + recperi +  " and Area of Rectangle is " + recarea);
       Square sq = new Square(s);
       double sqarea = sq.getArea();
       double sqperi = sq.getPerimeter();
       System.out.println("Perimeter of Square is " + sqperi +  " and Area of Square is " + sqarea);
        }
       scan.close();
   }
}




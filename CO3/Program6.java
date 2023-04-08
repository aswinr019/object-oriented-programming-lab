/* 
Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find the area and perimeter of objects. 
*/


import java.util.Scanner;
import java.lang.Math;


interface Shape{

  double area();
  double perimeter();

}

class Circle implements Shape {

  double radius;

  Circle(double radius){
    this.radius = radius;
  }

  public double area(){
    return ( Math.PI * this.radius * this.radius);
  }

  public double perimeter(){
    return ( 2 * Math.PI * this.radius);
  }
}

class Rectangle implements Shape{

  double length , breadth;

  Rectangle(double length , double  breadth){
    this.length = length;
    this.breadth = breadth;
  }

  public double area(){
    return ( this.length * this.breadth );
  }

  public double perimeter(){
    return ( 2 * (this.length + this.breadth) );
  }
} 

class Program6{
  public static void main(String args[]){
  
    Scanner scanner = new Scanner(System.in);
    int choice;

    do{
      System.out.print("Enter a choice : \n0) exit\n1) Area and perimeter of circle\n2) Area and perimeter of rectangle\n->   ");

      choice = scanner.nextInt();
      
      switch(choice){
        case 0 : {
          System.out.println("exiting...");
          break;
        }
        case 1 : {
          System.out.print("enter the radius of circle : ");
          double radius = scanner.nextDouble();

          Circle circle = new Circle(radius);
          System.out.printf("Radius of the circle : %.2f\nArea of circle : %.2f\nPerimeter of the circle : %.2f\n\n",radius,circle.area(),circle.perimeter());
          break;
        }
        case 2 : {
          System.out.print("Enter the length and breadth of the rectangle : ");
          double length = scanner.nextDouble();
          double breadth = scanner.nextDouble();

          Rectangle rectangle = new Rectangle(length , breadth);

          System.out.printf("Length of the rectangle : %.2f\nBreadth of the rectangle : %.2f\nArea of the rectangle : %.2f\nPerimeter of the rectangle : %.2f\n\n",length,breadth,rectangle.area(),rectangle.perimeter());
          break;
        }
        default : {
          System.out.println("wrong choice!");
        }
      }
    }
    while(choice != 0);

    scanner.close();
  }
}

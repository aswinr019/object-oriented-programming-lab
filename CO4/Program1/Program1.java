/* Create a Graphics package that has classes and figures for Rectangle , Triangle , Square and Circle . Test the package by finding the area of these figures. */

import graphics.*;
import java.util.Scanner;


class Program1{

  public static void main(String args[]){
    
    int choice;
    Scanner scanner = new Scanner(System.in);

    System.out.printf("0) exit\n1) area of circle\n2) area of triangle\n3) area of square\n4) area of rectangle\n\n");
    do {
      System.out.print("Enter a choice : ");
      choice = scanner.nextInt();

      switch(choice){

        case 0 : {
          System.out.println("exiting...");
          break;
        }
        case 1 : {
          System.out.print("enter the radius of the circle : ");
          double radius = scanner.nextDouble();

          Circle circle = new Circle(radius);
          System.out.printf("radius of the circle : %.2f\narea fo the circle : %.2f\n\n",circle.getRadius(),circle.getArea()); 
          break;
        }
        case 2 : {
          System.out.print("enter the base , height , side one , side two and side three of the triangle : ");
          double base = scanner.nextDouble();
          double height = scanner.nextDouble();
          double side1 = scanner.nextDouble();
          double side2 = scanner.nextDouble();
          double side3 = scanner.nextDouble();

          Triangle triangle = new Triangle(base,height,side1,side2,side3);

          System.out.printf("base of the triangle : %.2f\nheight of the triangle : %.2f\nside one of the triangle : %.2f\nside two of the triangle : %.2f\nside three of the triangle : %.2f\narea of the triangle : %.2f\n\n",triangle.getBase(),triangle.getHeight(),triangle.getSideOne(),triangle.getSideTwo(),triangle.getSideThree(),triangle.getArea());
          break;
        }
        case 3 : {
          System.out.print("enter the side of the square : ");
          double side = scanner.nextDouble();

          Square square = new Square(side);

          System.out.printf("side of the square : %.2f\narea of the square : %.2f\n\n",square.getSide(),square.getArea());
          break;
        }
        case 4 : {
          System.out.print("enter the length and breadth of the rectangle : ");
          double length = scanner.nextDouble();
          double breadth = scanner.nextDouble();

          Rectangle rectangle = new Rectangle(length , breadth);

          System.out.printf("length of the recatngle : %.2f\nbreadth of the rectangle : %.2f\narea of the rectangle : %.2f\n\n",rectangle.getLength(),rectangle.getBreadth(),rectangle.getArea());
          break;
        }
        default : {
          System.out.println("Wrong choice!");
        }
      }

    }while( choice != 0 );
  }
}

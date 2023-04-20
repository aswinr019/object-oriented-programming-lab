/* 
 Area of different shapes using overloaded functions
 */
import java.util.Scanner;

class Shape{
  
  double area(double radius){
    return ( 3.14 * radius * radius );
  }

  double area(double base , double height){
    return ( 0.5 * base * height );
  }

  int area(int length , int breadth){
    return ( length * breadth );
  }

  int area(int side){
    return ( side * side );
  }

}

class Program1{

  public static void main(String args[]){

    int choice;
    Scanner scanner = new Scanner(System.in);
    Shape shape = new Shape();
    System.out.print("0) exit\n1) Area of circle\n2) Area of triangle\n3) Area of rectangle\n4) Area of square\n\n");
    do{
      

      System.out.print("Enter a choice : ");
      choice = scanner.nextInt();

      switch(choice){
        case 0 -> {
          System.out.println("exiting...");

        }
        case 1 -> {
          System.out.print("Enter the radius of the circle -> ");
          double radius = scanner.nextDouble();
          double area = shape.area(radius);
          System.out.printf("The area of the circle is %.2f\n",area);

        }
        case 2 -> {
          System.out.print("Enter the base and height of the triangle -> ");
          double base = scanner.nextDouble();
          double height = scanner.nextDouble();
          double area = shape.area(base,height);
          System.out.printf("The are of the triangle is %.2f\n",area);

          }
        case 3 -> {
          System.out.print("Enter the length and breadth of rectangle -> ");
          int length = scanner.nextInt();
          int breadth = scanner.nextInt();
          int area = shape.area(length,breadth);
          System.out.printf("The area of the rectangle is %d\n",area);

        }
        case 4 -> {
          System.out.print("Enter the side of the square : ");
          int side = scanner.nextInt();
          int area = shape.area(side);
          System.out.printf("The area of the square is %d\n",area);

        }

        default -> {
          System.out.println("Wrong choice!");
        }
      }
    }while(choice != 0);
    scanner.close();
  }
}

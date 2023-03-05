/* Define a class 'product' with pcode , pname and price. Create three object of the class and 
 find the product having lowest price.
*/

import java.util.Scanner;

class Product{

  int pcode;
  String pname;
  int price;

  Product(int pcode , String pname , int price){

    this.pcode = pcode;
    this.pname = pname;
    this.price = price;
  }
}


class Program1{
  public static void main(String args[]){

    int pcode[] = new int[3];
    String pname[] = new String[3];
    int price[] = new int[3];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the pcode , name , and price of the product one : ");
    pcode[0] = Integer.parseInt(scanner.nextLine());
    pname[0] = scanner.nextLine();
    price[0] = Integer.parseInt(scanner.nextLine());
    
    System.out.println("Enter the pcode , name , and price of the product two : ");
    pcode[1] = Integer.parseInt(scanner.nextLine());
    pname[1] = scanner.nextLine();
    price[1] = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter the pcode , name , and price of the product three ");
    pcode[2] = Integer.parseInt(scanner.nextLine());
    pname[2] = scanner.nextLine();
    price[2] = Integer.parseInt(scanner.nextLine());

    Product p1 = new Product(pcode[0],pname[0],price[0]);
    Product p2 = new Product(pcode[1],pname[1],price[1]);
    Product p3 = new Product(pcode[2],pname[2],price[2]);

    if(p1.price < p2.price && p1.price < p3.price ) System.out.println("Price of product one is lesser");
    else if(p2.price < p1.price && p2.price < p3.price ) System.out.println("Price of product two is lesser");
    else System.out.println("Price of product three is lesser");

    scanner.close();
  }
}

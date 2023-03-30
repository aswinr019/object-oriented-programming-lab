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
  void display(){
    System.out.printf("Product code : %d\nProduct name : %s\nProduct price : %d\n",this.pcode,this.pname,this.price);
  }
}

class Program1{
  public static void main(String args[]){

    int pcode[] = new int[3];
    String pname[] = new String[3];
    int price[] = new int[3];

    Scanner scanner = new Scanner(System.in);
    Product[] product = new Product[3];

    for(int i = 0; i < 3 ; i++){
      System.out.printf("Enter the pcode , name , and price of the product %d : ",i+1);
      pcode[i] = Integer.parseInt(scanner.nextLine());
      pname[i] = scanner.nextLine();
      price[i] = Integer.parseInt(scanner.nextLine());

      product[i] = new Product(pcode[i],pname[i],price[i]);
    }
    Product lower;

    lower = (product[0].price < product[1].price && product[0].price < product[2].price) ? product[0]: (product[1].price < product[0].price && product[1].price < product[2].price ) ? product[1] : product[2];

    System.out.println("The product with lowest price is\n----------------------------- ");
    lower.display();
    scanner.close();
  }
}

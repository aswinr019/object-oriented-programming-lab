/* Prepare bill with the given format using calculate method from interface.
 
   Order No :

   Date : 

   Product Id     Name    Quantity    Unit Price    Total
  --------------------------------------------------------
    101             A         2           25         50
    102             B         1          100        100
  --------------------------------------------------------
                                  Net.Amount :      150 
*/

import java.util.*;
import java.lang.Math;


interface Bill {
  
  void calculate();
  
}

class Order implements Bill{

    Date date;
    String[] name;
    int number,orderNo ,netAmount ;
    int[] productId, quantity, unitPrice,total; 

    Order(int number , String[] name , int[] productId , int[] quantity , int[] unitPrice){
      this.orderNo = (int)( Math.random() * 1000 );
      this.date = new Date();
      this.number = number;

      this.netAmount  = 0;
      this.productId = productId;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
      this.name = name;
  }

    public void calculate (){

      this.total = new int[this.number];

      
      for(int i = 0; i < this.number ; i++){
        this.total[i] = unitPrice[i] * quantity[i];
        this.netAmount += this.total[i];
      }
    }

    public void printBill(){

      calculate();
      System.out.println("  \t\t\t\tBILL\t\t\t\t");
      System.out.println("--------------------------------------------------------------------------\n");
      System.out.printf("Order No : %d\n\n",this.orderNo);
      System.out.printf("Date : %tD%n\n\n",this.date);
      System.out.printf("Product Id\tName\t\tQuantity\tUnit Price\tTotal Price\n");
      System.out.printf("---------------------------------------------------------------------------\n");
      for(int i = 0; i < this.number; i++){
        System.out.printf("%d\t\t%s\t\t%d\t\t%d\t\t%d\n",this.productId[i],this.name[i],this.quantity[i],this.unitPrice[i],this.total[i]);
      }
      System.out.printf("---------------------------------------------------------------------------\n");
      System.out.printf("\t\t\t\t\t\t\tNet.Amount : %d\n\n\n\n",this.netAmount);
    }
    
}

class Program7{
  public static void main(String args[]){
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many products : ");
    int number = scanner.nextInt();

    String[] name = new String[number];
    int[] productId = new int[number];
    int[] quantity = new int[number];
    int[] unitPrice = new int[number];

    for(int i = 0; i < number ; i++){
      System.out.printf("Enter the name , product id , quantity and unit price of product %d : ",i+1);
      name[i] = scanner.next();
      productId[i] = scanner.nextInt();
      quantity[i] = scanner.nextInt();
      unitPrice[i] = scanner.nextInt();
    }
      Order order = new Order(number,name,productId,quantity,unitPrice);
      order.printBill();
    
    scanner.close();
  }
}

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
    int number,order_no ,net_amount ;
    int[] product_id; 
    int[] quantity; 
    int[] unit_price; 
    int[] total; 

    Order(int number , String[] name , int[] product_id , int[] quantity , int[] unit_price){
      this.order_no = (int)( Math.random() * 1000 );
      this.date = new Date();
      this.number = number;
      this.net_amount  = 0;

      this.name = new String[number];
      this.product_id = new int[number];
      this.quantity = new int[number];
      this.unit_price = new int[number];
      this.total = new int[number];

      for(int i = 0; i < this.number ; i++){
        
        this.name[i] = name[i];
        this.product_id[i] = product_id[i];
        this.quantity[i] = quantity[i];
        this.unit_price[i] = unit_price[i];
        this.total[i] = unit_price[i] * quantity[i];
        this.net_amount += this.total[i];
    }
  }

    public void calculate(){

      System.out.println("  \t\t\t\tBILL\t\t\t\t");
      System.out.println("--------------------------------------------------------------------------\n");
      System.out.printf("Order No : %d\n\n",this.order_no);
      System.out.printf("Date : %tD%n\n\n",this.date);
      System.out.printf("Product Id\tName\t\tQuantity\tUnit Price\tTotal Price\n");
      System.out.printf("---------------------------------------------------------------------------\n");
      for(int i = 0; i < this.number; i++){
        System.out.printf("%d\t\t%s\t\t%d\t\t%d\t\t%d\n",this.product_id[i],this.name[i],this.quantity[i],this.unit_price[i],this.total[i]);
      }
      System.out.printf("---------------------------------------------------------------------------\n");
      System.out.printf("\t\t\t\t\t\t\tNet.Amount : %d\n\n\n\n",this.net_amount);
    }
    
}

class Program7{
  public static void main(String args[]){
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many products : ");
    int number = scanner.nextInt();

    String[] name = new String[number];
    int[] product_id = new int[number];
    int[] quantity = new int[number];
    int[] unit_price = new int[number];

    for(int i = 0; i < number ; i++){
      System.out.printf("Enter the name , product id , quantity and unit price of product %d : ",i+1);
      name[i] = scanner.next();
      product_id[i] = scanner.nextInt();
      quantity[i] = scanner.nextInt();
      unit_price[i] = scanner.nextInt();
    }
      Order order = new Order(number,name,product_id,quantity,unit_price);
      order.calculate();
    
    scanner.close();
  }
}

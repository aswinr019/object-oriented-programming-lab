/*
 Create a class CPU with attribute price . Create inner class Processor( no.of cores , manufacturer ) and static 
 nested class RAM ( memory , manufacturer ). Create an object of CPU and print information of Processor and RAM.
*/

import java.util.Scanner;

class CPU{
  
  int price;
  Processor processor;
  RAM ram;

  CPU(int price, int no_of_cores , String pManufacturer , int memory , String rManufacturer ){

    this.price = price;
    this.processor = new Processor(no_of_cores, pManufacturer);
    this.ram  = new RAM(memory,rManufacturer);
  }

  void display(){
    System.out.printf("\nPrice : %d$\n",price);
    System.out.println("Processor information");
    System.out.println("---------------------");
    processor.display();
    System.out.printf("\nRAM information\n");
    System.out.println("----------------");
    ram.display();
  }

  class Processor{
    
    int no_of_cores;
    String manufacturer;

    public  Processor(int no_of_cores , String manufacturer){
      
      this.no_of_cores = no_of_cores;
      this.manufacturer = manufacturer;
    }

    void display(){
      System.out.printf("Manufacturer : %s , number of cores : %d \n",manufacturer,no_of_cores);
    }
  }

  static class RAM{

    int memory;
    String manufacturer;

    public RAM(int memory , String manufacturer){
      this.memory = memory;
      this.manufacturer = manufacturer;
    }

    void display(){
      System.out.printf("Manufacturer : %s , capacity : %d GB\n",manufacturer,memory);
    }
  }
}


class Program5{
  public static void main(String args[]){
   
    Scanner scanner = new Scanner(System.in);

    int price , no_of_cores , capacity;
    String CPU_manufacturer , RAM_manufacturer;

    System.out.println("Enter the CPU manufacturer , number of cores , price , RAM manufacturer and capacity : ");
    CPU_manufacturer = scanner.nextLine();
    no_of_cores = Integer.parseInt(scanner.nextLine());
    price = Integer.parseInt(scanner.nextLine());
    RAM_manufacturer = scanner.nextLine();
    capacity = Integer.parseInt(scanner.nextLine());

    CPU cpu = new CPU(price,no_of_cores,CPU_manufacturer,capacity,RAM_manufacturer);
    cpu.display();
  }
}

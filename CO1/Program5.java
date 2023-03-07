/*
 Create a class CPU with attribute price . Create inner class Processor( no.of cores , manufacturer ) and static 
 nested class RAM ( memory , manufacturer ). Create an object of CPU and print information of Processor and RAM.
*/

import java.util.Scanner;

class CPU{
  
  int price;
  Processor processor;
  RAM ram;

  public CPU(int price, int no_of_cores , String pManufacturer , int memory , String rManufacturer ){

    this.price = price;
    this.processor = new Processor(no_of_cores, pManufacturer);
    this.ram  = new RAM(memory,rManufacturer);
  }

  void display(){
    System.out.printf("Price : %d\n",price);
    System.out.println("Processor information");
    processor.display();
    System.out.println("RAM information");
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
    
    //CPU.Processor intel = new CPU.Processor(300,6,"Intel Corporation");
    //intel.display();
    CPU cpu = new CPU(500,8,"Intel",16,"Kingston");
    cpu.display();
  }
}

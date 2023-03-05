/*
 Create a class CPU with attribute price . Create inner class Processor( no.of cores , manufacturer ) and static 
 nested class RAM ( memory , manufacturer ). Create an object of CPU and print information of Processor and RAM.
*/

import java.util.Scanner;

Class CPU{
  
  int price;

  CPU(int price){
    this.price = price;
  }

  class Processor{
    
    int no_of_cores;
    String manufacturer;

    Processor(int price , int no_of_cores , String manufacturer){
      
      this.no_of_core = no_of_cores;
      thisi.manufacturer = manufacturer;
    }
  }
}

/* 
 Define two classes. One for generating multiplication table of five and other for displaying first N prime numbers.
 Implement using threads.(Thread class)
*/


import java.util.Scanner;
import java.lang.Math;

class PrintMultiplicationTableOfFive extends Thread {

  int number;

  PrintMultiplicationTableOfFive(int number){
    this.number = number;
  }

  public void run(){

    for(int i = 1; i <= number; i++){
      System.out.printf("%d x %d = %d\n",i,5,i*5);
      try{
        Thread.sleep(2);
      }
      catch(InterruptedException e) { System.out.println("Interrupted exception!");}
    }
  }
}

class PrintFirstNPrimeNumbers extends Thread {
  int number ;

  PrintFirstNPrimeNumbers(int number){
    this.number = number;
  }

  public void run(){
    int count = 0 , num = 2;

    while(count < this.number){
      boolean IsPrime = true;

      for(int i = 2; i < (int)(Math.sqrt(num) + 1); i++){
        if ( num % i == 0){
          IsPrime = false;
          break;
        }
      }
      if(IsPrime){
        System.out.printf("%d\n",num);
        count += 1;
      }
      num += 1;
      try{
        Thread.sleep(2);
      }
      catch(InterruptedException e){ System.out.println("Interrupted exception!");} 
    }
  }
} 

public class Program5 {

  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);

    System.out.print("enter the number of table entries of five : ");
    int NoOfTableEntries = scanner.nextInt();

    System.out.print("enter the number of prime numbers : ");
    int NoOfPrimeNumbers = scanner.nextInt();

    PrintMultiplicationTableOfFive multiplication = new PrintMultiplicationTableOfFive(NoOfTableEntries);
    PrintFirstNPrimeNumbers prime = new PrintFirstNPrimeNumbers(NoOfPrimeNumbers);

    multiplication.start();
    prime.start();

    scanner.close();
  }
}

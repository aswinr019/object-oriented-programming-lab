/*
Define two classes , one for generating Fibonacci series and other for displaying even numbers in a given range. 
Implement using Threads. (Runnable Interface)
*/

import java.util.Scanner;

class PrintFirstNFibonacciNumbers implements Runnable {
  int number;

  PrintFirstNFibonacciNumbers(int number) {
    this.number = number;
  }

  public void run() {
    int num1 = 0 , num2 = 1  , num3 , count = 2;

    System.out.printf("%d\n%d\n",num1,num2);
    while(count < number){
      
      num3 = num1 + num2;  
      System.out.printf("%d\n",num3);
      num1 = num2;
      num2 = num3;
      count++;
    }
  
  }
}

class PrintEvenNumbers implements Runnable {

  int start , end;

  PrintEvenNumbers(int start , int end ){
    this.start = start;
    this.end = end;
  }

  public void run() {

    if(start % 2 != 0) start++;
    for(int i = start; i <= end; i+=2) System.out.printf("%d\n",i);    
  }
}

class Program6 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("how many numbers of fibonacci series (greater than two) : ");
    int number = scanner.nextInt();

    System.out.print("enter a starting number and an ending number :");
    int start = scanner.nextInt();
    int end = scanner.nextInt();

    Runnable fibonacci = new PrintFirstNFibonacciNumbers(number);
    Runnable even = new PrintEvenNumbers(start,end);

    Thread thread1 = new Thread(fibonacci);
    Thread thread2 = new Thread(even);

    thread1.start();
    thread2.start();
    scanner.close();
  }
}

/*
 Find the average of n positive integers , raising a user defined exception for each negative input.
 */

import java.util.Scanner;

class NegativeNumberException extends Exception {
  
  public NegativeNumberException(String message){
    super(message);
  }
}

class Program4 {

  public static void main( String args[] ){

    Scanner scanner = new Scanner(System.in);

    int number , count , sum = 0 ;
    double average;

    System.out.print("how many numbers : ");
    count = scanner.nextInt();

    for(int i = 0; i < count ; i++){

      try{
        System.out.printf("enter number %d : ",i+1);
        number = scanner.nextInt();

        if(number < 0)
          throw new NegativeNumberException("Negative numbers are not allowed!");

        sum += number;
      }
      catch(NegativeNumberException e){
        System.out.println(e.getMessage());
        i--;
      }
    }

    average = (double) sum / count ;

    System.out.printf("average : %.2f\n",average);
    scanner.close();
  }
}


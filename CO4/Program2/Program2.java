/*
 Create an arithmetic package that has classes and interfaces for the 4 basic arithmetic operations . Test the 
 package by finding the area of these figures.
 */


import arithmetic.*;
import java.util.Scanner;

class Program2 {

  public static void main(String args[]) {

    int choice;
    Scanner scanner = new Scanner(System.in);

    System.out.print("0) exit\n1) addition\n2) subtraction\n3) multiplication\n4) division\n\n");
    do {
      System.out.print("enter a choice : ");
      choice = scanner.nextInt();

      switch (choice) {
        case 0: {
          System.out.println("exiting...");
          break;
        }
        case 1: {
          System.out.print("Enter two numbers for addition : ");
          double num1 = scanner.nextDouble();
          double num2 = scanner.nextDouble();

          Addition addition = new Addition();
          System.out.printf("number one : %.2f\nnumber two : %.2f\nsum : %.2f\n", num1, num2, addition.add(num1, num2));
          break;
        }
        case 2: {
          System.out.print("Enter two numbers for subtraction : ");
          double num1 = scanner.nextDouble();
          double num2 = scanner.nextDouble();

          Subtraction subtraction = new Subtraction();
          System.out.printf("number one : %.2f\nnumber two : %.2f\ndifference : %.2f\n", num1, num2, subtraction.sub(num1, num2));
          break;
        }
        case 3: {
          System.out.print("Enter two numbers for multiplication : ");
          double num1 = scanner.nextDouble();
          double num2 = scanner.nextDouble();

          Multiplication multiplication = new Multiplication();
          System.out.printf("number one : %.2f\nnumber two : %.2f\nproduct : %.2f\n", num1, num2, multiplication.mul(num1, num2));
          break;
        }
        case 4: {
          System.out.print("Enter two numbers for division : ");
          double num1 = scanner.nextDouble();
          double num2 = scanner.nextDouble();

          Division division = new Division();
          System.out.printf("number one : %.2f\nnumber two : %.2f\nquotient : %.2f\n", num1, num2, division.div(num1, num2));
          break;
        }
        default: {
          System.out.println("wrong choice!");
        }
      }
    } while (choice != 0);
    scanner.close();
  }
}

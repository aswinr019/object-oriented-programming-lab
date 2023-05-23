/*
Maintain a list of Strings using ArrayList from collection framework, perform built-in operations. 
*/

import java.util.Scanner;
import java.util.ArrayList;


class Program10 {
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    ArrayList<String> strings = new ArrayList<String>();

    System.out.print("how many strings ? ");
    int number = scanner.nextInt();

    System.out.printf("enter %d strings : ",number);
    for(int i = 0; i  < number; i++){
      String input = scanner.next();
      strings.add(input);
    }

    System.out.print("strings are : ");
    for(int i = 0; i < number; i++)
      System.out.println(strings.get(i));

    scanner.close();
  }
}

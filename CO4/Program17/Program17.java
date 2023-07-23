/*
 Program to demonstrate the working of Map interface by adding, changing and removing
elements.
*/

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Program17 {
  public static void main(String args[]){
  
    Scanner scanner = new Scanner(System.in);
    Map<Integer,String> map = new HashMap<>();

    System.out.println("0) exit\n1) insert\n2) update\n3) delete\n4) display\n");
    int choice;
    do {

      System.out.print("enter a choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 0 ->{
          System.out.println("exiting...");
        }
        case 1 -> {

           System.out.print("how many elements: ");
          int number = scanner.nextInt();

          System.out.printf("enter %d key value pairs: ",number);
          for(int i = 0; i < number; i++){
            int key = scanner.nextInt();
	    String string = scanner.next();
	    map.put(key,string);
    }
        }
        case 2 -> {
          System.out.print("enter a valid key to update: ");
          int key = scanner.nextInt();
          System.out.print("enter a value: ");
          String value = scanner.next();
          map.put(key,value);

        }
        case 3 -> {
          System.out.print("enter a valid key to delete: ");
          int key = scanner.nextInt();
          map.remove(key);
        }
        case 4 -> {
          System.out.println("map elements: "+map);
        }
        default ->{ System.out.println("wrong choice!");}
      }
    }while(choice != 0);
    scanner.close();
  }
}

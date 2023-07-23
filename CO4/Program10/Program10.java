/*
Maintain a list of Strings using ArrayList from collection framework, perform built-in operations. 
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
		
    int choice ;
    do {
	System.out.print("\n0) Exit\n1) Convert to uppercase\n2) Convert to lowercase\n3) Reverse strings\n4) Sort strings\n5) Search string\n6) Print strings\nEnter a choice : ");
	choice = scanner.nextInt();

	switch(choice){
		case 0 -> {
			System.out.println("exititng...");
		}
		case 1 -> {
			 for(int i = 0; i  < number; i++)
				 strings.set(i,strings.get(i).toUpperCase());

			 System.out.print("after conversion: ");
			for(int i = 0; i  < number; i++)
      				 System.out.printf("%s\t",strings.get(i));
			System.out.println();
		}
		case 2 -> {
			for(int i = 0; i < number; i++)
				strings.set(i,strings.get(i).toLowerCase());

			System.out.print("after conversion: ");
			for(int i = 0; i < number; i++)
				System.out.printf("%s\t",strings.get(i));
			System.out.println();
		}
		case 3 -> {

			for(int i = 0; i < number; i++){
				StringBuilder reversed = new StringBuilder(strings.get(i)).reverse();
				strings.set(i,reversed.toString());
			}

			System.out.print("after reversing: ");
			for(int i = 0; i < number; i++)
				System.out.printf("%s\t",strings.get(i));
			System.out.println();
		}
		case 4 -> {
			System.out.print("before sorting: ");
			for(int i = 0;i < number; i++)
				System.out.printf("%s\t",strings.get(i));

			System.out.println();
			Collections.sort(strings);

			System.out.print("after sorting: ");
			for(int i = 0; i < number; i++)
				System.out.printf("%s\t",strings.get(i));
			System.out.println();
		}
		case 5 -> {
			System.out.print("enter a string to search: ");	
			String str = scanner.next();
			System.out.printf("list of strings contains %s : %s",str,strings.contains());
		}
		case 6 -> {
			System.out.print("strings are: ");
			for(int i = 0; i < number; i++)
				System.out.printf("%s\t",strings.get(i));
			System.out.println();
		}
		default -> {
			System.out.println("Wrong choice!");
		}
	}
    } while (choice != 0);
    scanner.close();
  }
}


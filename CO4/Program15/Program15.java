/*
Program to demonstrate the creation of Set object using the LinkedHashset class.
*/

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

class SetDataStructure {
	private Set<Integer> set;

	public SetDataStructure(){
		set = new LinkedHashSet<Integer>();
	}
	public void insert(int number){
		set.add(number);
	}
	public void delete(int number){
		if(set.isEmpty()) throw new RuntimeException("set is empty!");
		else  set.remove(number);
	}
	public void display(){

		if(set.isEmpty()) throw new RuntimeException("set is empty!");

		else {
			Iterator it = set.iterator();
			while(it.hasNext())
				System.out.printf("%d\t",it.next());
		}

	}
}

class Program15 {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    SetDataStructure set = new SetDataStructure();

    System.out.println("0) exit\n1) insert\n2) delete\n3) display\n");
    int choice;

    do {
	System.out.print("enter a choice: ");
	choice = scanner.nextInt();

	switch(choice){
		case 0 -> {
			System.out.println("exiting...");
		}
		case 1 -> {
			System.out.print("enter a number to insert: ");
			int number = scanner.nextInt();
			set.insert(number);
		}
		case 2 -> {
			System.out.print("enter a number to delete: ");
			int number = scanner.nextInt();
			try {
				set.delete(number);
				System.out.printf("%d removed\n",number);	
			}catch(RuntimeException e){
				System.out.println(e.getMessage());
			}
			}
		case 3 -> {
			System.out.print("set elements are: ");
			set.display();
			System.out.println();
		}
		default -> {
			System.out.println("wrong choice!");
		}
	}
    }while(choice != 0);
    scanner.close();
  }
}

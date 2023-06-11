/*
Program to demonstrate the addition and deletion of elements in deque.
*/

import java.util.*;

class DQ {
	private Deque<Integer> deque;

	public DQ(){
		deque = new ArrayDeque<Integer>();
	}

	public void insertFront(int number){
		deque.addFirst(number);
	}
	public void insertRear(int number){
		deque.addLast(number);
	}
	public int deleteFront(){
		if(deque.isEmpty())
			throw new RuntimeException("deque is empty!");
		else 
			return deque.removeFirst();
	}

	public int deleteRear(){
		if(deque.isEmpty())
			throw new RuntimeException("deque is empty!");
		else 
			return deque.removeLast();
	}

	public void display(){
		if(deque.isEmpty())
			throw new RuntimeException("deque is empty!");
		else { 
			for(int i : deque)
				System.out.printf("%d\t",i);
	
		}
	}
}

class Program14 {

  public static void main(String args[]) {

    DQ deque = new DQ();	  
    Scanner scanner = new Scanner(System.in);

    System.out.println("0) exit\n1) insert to front\n2) insert to rear\n3) delete from front\n4) delte from rear\n5)display\n");
    int choice;

    do{
	System.out.print("enter a choice: ");
	choice = scanner.nextInt();

	switch(choice){
		case 0 -> {
			System.out.println("exiting...");
		}
		case 1 -> {
			System.out.print("enter a number to insert: ");
			int number = scanner.nextInt();
			deque.insertFront(number);
		}
		case 2 -> {
			System.out.print("enter a number to insert: ");
			int number = scanner.nextInt();
			deque.insertRear(number);
		}
		case 3 -> {
			try{
				System.out.printf("%d\n",deque.deleteFront());
			}
			catch(RuntimeException e){
				System.out.println(e.getMessage());
			}
		}
		case 4 -> {
			try{
				System.out.printf("%d\n",deque.deleteRear());
			}
			catch(RuntimeException e){
				System.out.println(e.getMessage());
			}
		}
		case 5 -> {
			System.out.print("deque elements are: ");
			deque.display();
			System.out.println();
		}
		default -> {
			System.out.println("wrong choice!");
		}
	}
    }
    while(choice != 0);
    scanner.close();
  }
}

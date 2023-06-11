/*
 Program to remove an object from the Stack when the position is passed as parameter.
*/

import java.util.Scanner;
import java.util.ArrayList;

class Stack{
	private ArrayList<Integer> stack;
	private int top;

	public Stack(){
		stack = new ArrayList<Integer>();
		top = -1;
	}
	public boolean isEmpty(){
		return ( top == -1 ) ? true : false;
	}
	public void push(int element){
		stack.add(++top,element);
	}
	public int pop(){
		if( stack.isEmpty())
			throw new RuntimeException("stack is empty!");
		else
			return(stack.remove(top--));
	}
	public int popFromPosition(int position){
		if(stack.isEmpty())
			throw new RuntimeException("stack is empty!");
		else{
			top--;
			return (stack.remove(position));
		}
	}
	public void display(){
		if(stack.isEmpty())
			throw new RuntimeException("stack is empty!");
		else {
			for(int i : stack)
				System.out.printf("%d\t",i);
		}
	}
}

class Program12 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    Stack stack = new Stack();
    int choice;

    System.out.print("0) exit\n1) push\n2) pop\n3) pop from position\n4) display\n");
    do {
	System.out.print("enter a choice: ");
	choice = scanner.nextInt();

	switch(choice){
		case 0 -> {
			System.out.println("exiting...");
		}
		case 1 -> {
			System.out.print("enter a number to push: ");
			int number = scanner.nextInt();
			stack.push(number);
		}
		case 2 -> {
			try {
				int number = stack.pop();
				System.out.printf("popped number is: %d\n",number);
			}
			catch( RuntimeException e ){
				System.out.println(e.getMessage());
			}
		}
		case 3 -> {

			System.out.print("enter the position to remove element from: ");
			int position = scanner.nextInt();

			if(position >= 0){
				try{
					int number = stack.popFromPosition(position);
					System.out.printf("popped number is: %d\n",number);
				}
				catch( IndexOutOfBoundsException e ){
					System.out.println(e.getMessage());
				}
				catch( RuntimeException e ){
					System.out.println(e.getMessage());
				}
			}
			else
				System.out.println("please enter valid position!");
		}
		case 4 -> {
			try {
				System.out.print("stack elements are: ");
				stack.display();
			}
			catch(RuntimeException e ){
				System.out.println(e.getMessage());
			}
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

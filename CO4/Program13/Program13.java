/*
Program to demonstrate the creation of queue object using the PriorityQueue class.
*/

import java.util.*;

class Queue {

	private PriorityQueue<Integer> priorityqueue ;

	public Queue(){
		priorityqueue = new PriorityQueue<Integer>();
	}
	public void enqueue(int number){
		priorityqueue.add(number);
	}

	public int dequeue(){
		if(priorityqueue.isEmpty())
			throw new RuntimeException("queue is empty!");
		else
			return priorityqueue.poll();
	}

	public void display(){
		if(priorityqueue.isEmpty())
			throw new RuntimeException("queue is empty!");
		else {
			for(int i : priorityqueue)
				System.out.printf("%d\t",i);
		}
	}
}

class Program13 {
  public static void main(String args[]) {
  
    Scanner scanner = new Scanner(System.in);

    Queue queue = new Queue();

    System.out.println("0) exit\n1) enqueue\n2) dequeue\n3) display\n");
    int choice;

    do{
	System.out.print("enter a choice: ");
	choice = scanner.nextInt();

	switch(choice){
		case 0 ->{
			System.out.println("exiting...");
		}
		case 1 -> {
			System.out.print("enter a number to insert: ");
			int number = scanner.nextInt();
			queue.enqueue(number);
		}
		case 2 -> {
			try{
				int number = queue.dequeue();
				System.out.printf("dequeued number is: %d\n",number);
			}
			catch(RuntimeException e){
				System.out.println(e.getMessage());
			}
		}
		case 3 -> {
			try{
				System.out.print("queue elements are: ");
				queue.display();
				System.out.println();
			}
			catch(RuntimeException e ){
				System.out.println(e.getMessage());
			}
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

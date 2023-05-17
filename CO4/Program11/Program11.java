/*
 Program to remove all the elements from a linked list.
*/

import java.util.LinkedList;
import java.util.Scanner;

class Linkedlist {

  private LinkedList<Integer> linkedlist;

  public Linkedlist() {
    linkedlist = new LinkedList<Integer>();
  }

  public boolean isEmpty() {
    return (linkedlist.size() == 0) ? true : false;
  }

  public void addElementToFront(int element) {
    linkedlist.addFirst(element);
  }

  public void addElementToBack(int element) {
    linkedlist.addLast(element);
  }

  public int removeElementFromFront() {

    if (linkedlist.size() == 0)
      throw new RuntimeException("linked list is empty");
    else
      return (linkedlist.removeFirst());
  }

  public int removeElementFromBack() {
    if (linkedlist.size() == 0)
      throw new RuntimeException("linked list is empty");
    else
      return (linkedlist.removeLast());
  }

  public void removeAllElements() {
    if (linkedlist.size() == 0)
      throw new RuntimeException("linked list is empty");
    else
      linkedlist.clear();
  }

  public void display() {

    for (int i : linkedlist) {
      System.out.printf("%d\t", i);
    }
  }
}

class Program11 {

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    Linkedlist linkedlist = new Linkedlist();
    int choice;

    System.out.println(
        "0) exit\n1) add element to front of linked list\n2) add element to back of linked list\n3) remove element from front of linked list\n4) remove element from back of the linked list\n5) remove all elements from linked list\n6) print all elements of linked list\n\n");
    do {
      System.out.print("Enter a choice -> ");
      choice = scanner.nextInt();
      switch (choice) {
        case 0 -> {
          System.out.println("exiting...");
        }
        case 1 -> {
          System.out.print("enter a number to insert to front of linked list : ");
          int number = scanner.nextInt();
          linkedlist.addElementToFront(number);
        }
        case 2 -> {
          System.out.print("enter a number to insert to back of linked list : ");
          int number = scanner.nextInt();
          linkedlist.addElementToBack(number);
        }
        case 3 -> {

          try {

            int number = linkedlist.removeElementFromFront();
            System.out.printf("removed element is %d\n", number);

          } catch (RuntimeException e) {

            System.out.println(e.getMessage());
          }

        }
        case 4 -> {

          try {

            int number = linkedlist.removeElementFromBack();
            System.out.printf("removed element is %d\n", number);
          } catch (RuntimeException e) {

            System.out.println(e.getMessage());
          }

        }
        case 5 -> {
          try {

            System.out.println("all elements deleted!");
            linkedlist.removeAllElements();
          } catch (RuntimeException e) {

            System.out.println(e.getMessage());
          }

        }
        case 6 -> {

          try {

            System.out.print("linkedlist elements are : ");
            linkedlist.display();
            System.out.println();
          } catch (RuntimeException e) {

            System.out.println(e.getMessage());
          }

        }
        default -> {
          System.out.println("wrong choice!");
        }
      }
    } while (choice != 0);
    scanner.close();
  }
}

/*
Write a Java program to compare two hash set.
*/

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Program16 {
  public static void main(String args[]) {

  Scanner scanner = new Scanner(System.in);
  HashSet<Integer> set1 = new HashSet<>();
  HashSet<Integer> set2 = new HashSet<>();
  System.out.print("how many numbers in hashset one? ");
  int number = scanner.nextInt();

  System.out.printf("enter %d numbers: ",number);
  for(int i =0; i < number; i++){
	int n = scanner.nextInt();
	set1.add(n);
  }
  System.out.print("how many numbers  hashset two? ");
  number = scanner.nextInt();
  System.out.printf("enter %d numbers: ",number);
  for(int i = 0; i < number; i++){
	int n = scanner.nextInt();
	set2.add(n);
  }

  System.out.println("hashset one: "+set1);
  System.out.println("hashset two: "+set2);
  System.out.printf("are the hashsets equal? %s\n",set1.equals(set2));
  scanner.close();
  }
}

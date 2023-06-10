/*
Using generic method perform bubble sort. 
*/

import java.util.Scanner;

class BubbleSort<T extends Comparable<T>> {

  private T[] items;

  public BubbleSort(T[] items) {
    this.items = items;
  }

  public void bubbleSort() {

    for (int i = 0; i < items.length - 1; i++) {
      for (int j = 0; j < items.length - i - 1; j++) {
        if (items[j].compareTo(items[j + 1]) > 0) {

          swap(j, j + 1);
        }
      }
    }
  }

  private void swap(int i, int j) {

    T temp = items[i];
    items[i] = items[j];
    items[j] = temp;
  }

  public T[] getSortedArray() {
    return items;
  }
}

class Program9 {
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    int choice;

    do {

      System.out.print("0) exit\n1) integer data \n2) string data \n3) double data\nenter a choice : ");
      choice = scanner.nextInt();
      switch (choice) {

        case 0 -> {

          System.out.println("exiting...");
          break;
        }
        case 1 -> {

          System.out.print("how many numbers ? ");
          int number = scanner.nextInt();

          Integer[] numbers = new Integer[number];

          System.out.printf("enter %d numbers : ", number);
          for (int i = 0; i < number; i++) {
            numbers[i] = scanner.nextInt();
            
          }
          BubbleSort<Integer> bs = new BubbleSort<>(numbers);

          System.out.printf("before sorting : ");
          for (int i = 0; i < number; i++) {
            System.out.printf("%d\t", numbers[i]);
          }
          System.out.println();


          bs.bubbleSort();
          numbers = bs.getSortedArray();

          System.out.printf("after sorting : ");
          for (int i = 0; i < number; i++) {
            System.out.printf("%d\t", numbers[i]);
          }
          System.out.println();
        }

        case 2 -> {

          System.out.print("how many strings ? ");
          int number = scanner.nextInt();

          String[] strings = new String[number];

          System.out.printf("enter %d numbers : ", number);
          for (int i = 0; i < number; i++) {
            strings[i] = scanner.next();
            
          }
          BubbleSort<String> bs = new BubbleSort<>(strings);

          System.out.printf("before sorting : ");
          for (int i = 0; i < number; i++) {
            System.out.printf("%s\t", strings[i]);
          }
          System.out.println();


          bs.bubbleSort();
          strings = bs.getSortedArray();

          System.out.printf("after sorting : ");
          for (int i = 0; i < number; i++) {
            System.out.printf("%s\t", strings[i]);
          }
          System.out.println();
        }

        case 3 -> {

          System.out.print("how many numbers ? ");
          int number = scanner.nextInt();

          Double[] numbers = new Double[number];

          System.out.printf("enter %d numbers : ", number);
          for (int i = 0; i < number; i++) {
            numbers[i] = scanner.nextDouble();
            
          }
          BubbleSort<Double> bs = new BubbleSort<>(numbers);

          System.out.printf("before sorting : ");
          for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t", numbers[i]);
          }
          System.out.println();


          bs.bubbleSort();
          numbers = bs.getSortedArray();

          System.out.printf("after sorting : ");
          for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t", numbers[i]);
          }
          System.out.println();
        }

        default -> {
          System.out.println("wrong choice!");
        }

      }
    } while (choice != 0);
    scanner.close();
  }
}

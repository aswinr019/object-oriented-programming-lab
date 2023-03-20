/* Program to sort strings  */

import java.util.*;


class Program6{
  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of strings to sort: ");
    int n = scanner.nextInt();
    
    String array[] = new String[n];
    System.out.printf("Enter %d strings to sort:\n",n);

    for(int i = 0; i < n ; i++){
      array[i] = scanner.next();
    }

    System.out.printf("Before sorting:\n");
    for(int i = 0; i < n; i++){
      System.out.printf("%s\t",array[i]);
    }
    Arrays.sort(array);
    System.out.printf("\nAfter sorting:\n");
    for(int i = 0; i < n ; i++){
      System.out.printf("%s\t",array[i]);
    }
    scanner.close();
  }
}

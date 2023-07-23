/*
 Program to Convert HashMap to TreeMap.
*/

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;


class Program18 {

  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    Map<Integer, String> hashMap = new HashMap<>();

    System.out.print("how many elements: ");
    int number = scanner.nextInt();

    System.out.printf("enter %d key value pairs: ",number);
    for(int i = 0; i < number; i++){
      int key = scanner.nextInt();
      String string = scanner.next();
      hashMap.put(key,string);
}
  System.out.println("hash map elements: "+hashMap);

    Map<Integer, String> treeMap = new TreeMap<>(hashMap);

    System.out.println("tree map elements: "+treeMap);
    scanner.close();
  }
}

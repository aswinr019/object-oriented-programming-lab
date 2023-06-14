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
    Map<Integer, String> treeMap = new TreeMap<>(hashMap);
    scanner.close();
  }
}

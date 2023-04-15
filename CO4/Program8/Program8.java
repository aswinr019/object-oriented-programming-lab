/*
 Program to create a generic stack and do the Push and Pop operations.
*/


import java.util.Scanner;
import java.util.ArrayList;


class Stack<T> {

  private ArrayList<T> items;
  int top;

  Stack() {
    items = new ArrayList<T>();
    this.top = 0;
  }

  int push(T item) {

    items.add(item);
    top++;
    return ( items.size() -1 );
  }

  T pop() {

    if(items.isEmpty()) throw new RuntimeException("stack is empty");
    else  return items.remove( (items.size() - 1));
  }

  int getSize() {
    if(items.isEmpty()) throw new RuntimeException("stack is empty");
    else  return  items.size() ; 
  }

   T getItem(int index) {
    if (items.isEmpty() ) throw new RuntimeException("stack is empty");
    else return (items.get(index));
  }
}


class Program8 {

  public static void main(String args[]) {
  
    Scanner scanner = new Scanner(System.in);

    int type , choice  ;

    System.out.print("1) Integer\n2) String\n3) Double\nenter the type of the array you want to create : ");
    type = scanner.nextInt();
    switch(type){
    
      case 1 -> {
        Stack<Integer> stack = new Stack<Integer>();    

        do {
      
          System.out.print("0) exit\n1) push\n2) pop\n3) size\n4) display\nenter a choice: ");
          choice = scanner.nextInt();

          switch(choice){

            case 1 -> {

              System.out.print("enter an element to push : ");

              int number = scanner.nextInt();
              stack.push(number);
            }
            case 2 -> {

              try {
                System.out.println(stack.pop());
              }
              catch (RuntimeException e){
                System.out.println(e.getMessage());
              }
            }
            case 3 -> {
              try{
                System.out.println(stack.getSize());
              }
              catch(RuntimeException e) {
                System.out.println(e.getMessage());
              }
            }
            case 4 -> {

              try{
                for(int i = 0; i < stack.getSize()  ; i++){
                  System.out.println(stack.getItem(i));
                }
              }catch(RuntimeException e) {
                System.out.println(e.getMessage());
              }
            }
          }
        }
        while(choice != 0);
      }

      case 2 -> {
        Stack<String> stack = new Stack<String>();
      }

      case 3 -> {
        Stack<Double> stack = new Stack<Double>();
      }

      default -> {
        System.out.println("invalid type!");
      }
    }
    scanner.close();
  }
}

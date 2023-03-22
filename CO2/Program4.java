/* Program to create a class for Employee  having attributes eNo,eName,eSalary. Read n employee information 
 and search for a given employee given eNo , using  the concept of array of objects*/


import java.util.Scanner;

class Employee{
  int eNo , eSalary;
  String eName;

  void getInfo(int eNo, String eName, int eSalary){
    this.eNo = eNo;
    this.eName = eName;
    this.eSalary = eSalary;
  }

  void display(){
    System.out.println("Employee information");
    System.out.println("--------------------");
    System.out.printf("employee number : %d\n",this.eNo);
    System.out.printf("employee name : %s\n",this.eName);
    System.out.printf("employee salary : %d\n",this.eSalary);
  }
}


class Program4{
  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many employees : ");
    int number = scanner.nextInt();

    Employee emp[] = new Employee[number];

    for(int i = 0; i < number; i++){
      System.out.printf("Enter the employee number , name , and salary of employee %d\n",i+1);
      int no = Integer.parseInt(scanner.nextLine());
      String name = scanner.nextLine();
      int salary = Integer.parseInt(scanner.nextLine());
      emp[i].getInfo(no,name,salary);
    }

    for(int i = 0; i < number; i++){
      emp[i].display();
    }
  }
}

/* Create a class 'Employee' with data members Empid , Name , Salary , Address and constructor to initialize
 the data members. Create another class 'Teacher' that inherit the properties of class Employee and contain 
 its own data members Department and Subject taught and constructors to initialize the data members and also 
 include a display function to display all data members. Use array of objects to display details of N teachers  */


import java.util.Scanner;

class Employee{
  
  int empid, salary;
  String name, address;

  Employee(int empid, String name , int salary , String address){
    this.empid = empid;
    this.name = name;
    this.salary = salary;
    this.address  = address;
  }
}

class Teacher extends Employee{

  String department , subject;

  Teacher(int empid , String name , int salary , String address, String department , String subject){
    super(empid , name , salary , address );
    this.department = department;
    this.subject = subject;
  }

  void display(){
    System.out.printf("Employee Id : %d\nName : %s\nSalary : %d\nAddress : %s\nDepartment : %s\nSubject : %s\n\n\n",this.empid,this.name,this.salary,this.address,this.department,this.subject);
  }
}

class Program2{

  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);
    System.out.print("How many teachers : ");
    int number = scanner.nextInt();

    Teacher[] teacher = new Teacher[number];

    for(int i = 0; i < number ; i++){
      System.out.printf("Enter the employee id , name , salary , address , department and subject of teacher %d\n",i+1);
      int empid = scanner.nextInt();
      String name = scanner.next();
      int salary = scanner.nextInt();
      String address = scanner.next();
      String department = scanner.next();
      String subject = scanner.next();

      teacher[i] = new Teacher(empid,name,salary,address,department,subject);
    }

    System.out.printf("Employee Information\n-------------------\n");
    for(int i = 0 ; i < number; i++){
      teacher[i].display();
    }
    scanner.close();
  }

}

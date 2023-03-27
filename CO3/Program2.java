/* Create a class 'Employee' with data members Empid , Name , Salary , Address and constructor to initialize
 the data members. Create another class 'Teacher' that inherit the properties of class Employee and contain 
 its own data members Department and Subject taught and constructors to initialize the data members and also 
 include a display function to display all data members. Use array of objects to display details of N teachers  */


import java.util.Scanner;

class Employee{
  
  int Empid, Salary;
  String Name, Address;

  Employee(int Empid, String Name , int Salary , String Address){
    this.Empid = Empid;
    this.Name = Name;
    this.Salary = Salary;
    this.Address  = Address;
  }
}

class Teacher extends Employee{

  String Department , Subject;

  Teacher(int Empid , String Name , int Salary , String Address, String Department , String Subject){
    super(Empid , Name , Salary , Address );
    this.Department = Department;
    this.Subject = Subject;
  }

  void display(){
    System.out.printf("Employee Id : %d\nName : %s\nSalary : %d\nAddress : %s\nDepartment : %s\nSubject : %s\n\n\n",this.Empid,this.Name,this.Salary,this.Address,this.Department,this.Subject);
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

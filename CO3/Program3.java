/* 
 Create a class 'Person' with data members name, gender, address, Age and a constructor to initialize 
 the data members and another class 'Employee' that inherit the properties of the class Person and also 
 contain its own data members like empid, compnayName, qualification, salary and its own constructor.
 Create another class 'Teacher' that inherits the properties of class Employee and contains its own data 
 members like subject, department, teacherId and also contain constructors and methods to display the data 
 members. Use the array of objects to display details of N teachers.
 */

import java.util.Scanner;

class Person{
  
  String name , gender , address;
  int age;

  Person(String name , String gender , String address , int age){
    this.name = name;
    this.gender = gender;
    this.address = address;
    this.age = age;
  }
}

class Employee extends Person{

  int empid , salary;
  String compnayName , qualification;

  Employee(String name , String gender , String address , int age, int empid , String compnayName , String qualification , int salary ){

    super(name, gender, address, age);
    this.empid = empid;
    this.compnayName = compnayName;
    this.qualification = qualification;
    this.salary = salary;
  }
}

class Teacher extends Employee{

  String subject , department;
  int teacherId;

  Teacher(String name , String address , String gender, int age , int empid , String compnayName , String qualification, int salary , String subject , String department , int teacherId ){
    super(name , address, gender,  age , empid , compnayName , qualification, salary);
    this.subject = subject;
    this.department = department;
    this.teacherId = teacherId;
  }
  void display(){
    System.out.printf("Teacher name : %s\nTeacher address : %s\ngender : %s\nTeacher age : %d\nEmployment Id : %d\nSchool name : %s\nqualification : %s\nsalary : %d\nTeaching subject : %s\nTeaching department : %s\nTeacher Id : %d\n\n",this.name,this.address,this.gender,this.age,this.empid,this.compnayName, this.qualification,this.salary,this.subject,this.department,this.teacherId);
  }
}


class Program3{
  public static void main(String args[]){

    int number;
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many teachers : ");
    number = scanner.nextInt();
    Teacher[] teacher = new Teacher[number];

    for(int i = 0; i < number; i++){
      System.out.printf("Enter the name , address , gender , age , employee id , company name , qualification , salary , subject taught , department and teacher id of teacher %d\n",i+1);

      String name = scanner.next();
      String address = scanner.next();
      String gender = scanner.next();
      int age = Integer.parseInt(scanner.next());
      int empid = Integer.parseInt(scanner.next());
      String compnayName = scanner.next();
      String qualification = scanner.next();
      int salary = Integer.parseInt(scanner.next());
      String subject = scanner.next();
      String department = scanner.next();
      int teacherId = Integer.parseInt(scanner.next());

      teacher[i] = new Teacher(name,address,gender,age,empid,compnayName,qualification,salary,subject,department,teacherId);
    }

    System.out.printf("\n\nTeacher Information\n------------------\n");
    for(int i = 0; i < number; i++ ){
      teacher[i].display();
    }
    scanner.close();
  }
}

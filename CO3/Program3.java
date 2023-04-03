/* 
 Create a class 'Person' with data members Name, Gender, Address, Age and a constructor to initialize 
 the data members and another class 'Employee' that inherit the properties of the class Person and also 
 contain its own data members like Empid, Company_name, Qualification, Salary and its own constructor.
 Create another class 'Teacher' that inherits the properties of class Employee and contains its own data 
 members like Subject, Department, Teacherid and also contain constructors and methods to display the data 
 members. Use the array of objects to display details of N teachers.
 */

import java.util.Scanner;

class Person{
  
  String Name , Gender , Address;
  int Age;

  Person(String Name , String Gender , String Address , int Age){
    this.Name = Name;
    this.Gender = Gender;
    this.Address = Address;
    this.Age = Age;
  }
}

class Employee extends Person{

  int Empid , Salary;
  String Company_name , Qualification;

  Employee(String Name , String Gender , String Address , int Age, int Empid , String Company_name , String Qualification , int Salary ){

    super(Name, Gender, Address, Age);
    this.Empid = Empid;
    this.Company_name = Company_name;
    this.Qualification = Qualification;
    this.Salary = Salary;
  }
}

class Teacher extends Employee{

  String Subject , Department;
  int Teacherid;

  Teacher(String Name , String Address , String Gender, int Age , int Empid , String Company_name , String Qualification, int Salary , String Subject , String Department , int Teacherid ){
    super(Name , Address, Gender,  Age , Empid , Company_name , Qualification, Salary);
    this.Subject = Subject;
    this.Department = Department;
    this.Teacherid = Teacherid;
  }
  void display(){
    System.out.printf("Teacher Name : %s\nTeacher Address : %s\nGender : %s\nTeacher Age : %d\nEmployment Id : %d\nSchool Name : %s\nQualification : %s\nSalary : %d\nTeaching Subject : %s\nTeaching Department : %s\nTeacher Id : %d\n\n",this.Name,this.Address,this.Gender,this.Age,this.Empid,this.Company_name, this.Qualification,this.Salary,this.Subject,this.Department,this.Teacherid);
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
      String company_name = scanner.next();
      String qualification = scanner.next();
      int salary = Integer.parseInt(scanner.next());
      String subject = scanner.next();
      String department = scanner.next();
      int teacherid = Integer.parseInt(scanner.next());

      teacher[i] = new Teacher(name,address,gender,age,empid,company_name,qualification,salary,subject,department,teacherid);
    }

    System.out.printf("\n\nTeacher Information\n------------------\n");
    for(int i = 0; i < number; i++ ){
      teacher[i].display();
    }
    scanner.close();
  }
}

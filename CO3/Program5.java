/* Create a class Student and Sports. Create another class Result inherited from Student and Sports. Display 
the academic and sports scores of a student. 
*/


import java.util.Scanner;


class Student{
  String name;
  int roll_no;

  Student(String name , int roll_no){
    this.name = name;
    this.roll_no = roll_no;
  }

}

class Sports extends Student{

  int sports_score;
  
  Sports(String name , int roll_no ,int sports_score){

    super(name,roll_no);
    this.sports_score = sports_score;
  }

}

class Result extends Sports {
  
  int accademic_score , total;

  Result(String name , int roll_no , int sports_score , int accademic_score){
    super(name,roll_no,sports_score);
    this.accademic_score = accademic_score;
    this.total = this.accademic_score + this.sports_score;
  }

  void display(){
    System.out.printf("Student name : %s\nStudent roll no : %d\nSports score : %d\nAccademic score : %d\nTotal score: %d\n",this.name,this.roll_no,this.sports_score,this.accademic_score,(this.total));
  }
}


class Program5{

  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    String name ;
    int roll_no, s_score , a_score;

    System.out.print("Enter the name , roll no , sports core and accademic score of student : ");
    name = scanner.next();
    roll_no = Integer.parseInt(scanner.next());
    s_score = Integer.parseInt(scanner.next());
    a_score = Integer.parseInt(scanner.next());

    Result result = new Result(name,roll_no,s_score,a_score);
    System.out.printf("\nStudent information\n------------------\n");
    result.display();
    scanner.close();
  }
}

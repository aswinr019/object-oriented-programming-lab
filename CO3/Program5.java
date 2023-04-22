/* Create a class Student and Sports. Create another class Result inherited from Student and Sports. Display 
the academic and sports scores of a student. 
*/


import java.util.Scanner;


class Student{
  String name;
  int rollNo;

  Student(String name , int rollNo){
    this.name = name;
    this.rollNo = rollNo;
  }

}

class Sports extends Student{

  int sportsScore;
  
  Sports(String name , int rollNo ,int sportsScore){

    super(name,rollNo);
    this.sportsScore = sportsScore;
  }

}

class Result extends Sports {
  
  int accademicScore , total;

  Result(String name , int rollNo , int sportsScore , int accademicScore){
    super(name,rollNo,sportsScore);
    this.accademicScore = accademicScore;
    this.total = this.accademicScore + this.sportsScore;
  }

  void display(){
    System.out.printf("Student name : %s\nStudent roll no : %d\nSports score : %d\nAccademic score : %d\nTotal score: %d\n",this.name,this.rollNo,this.sportsScore,this.accademicScore,(this.total));
  }
}


class Program5{

  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    String name ;
    int rollNo, s_score , a_score;

    System.out.print("Enter the name , roll no , sports core and accademic score of student : ");
    name = scanner.next();
    rollNo = scanner.nextInt();
    s_score = scanner.nextInt();
    a_score = scanner.nextInt();

    Result result = new Result(name,rollNo,s_score,a_score);
    System.out.printf("\nStudent information\n------------------\n");
    result.display();
    scanner.close();
  }
}

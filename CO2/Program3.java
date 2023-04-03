/* Perform string manipulations */
import java.util.Scanner;

class StringFunctions{

  String upper(String str){
    return str.toUpperCase();
  }  

  String lower(String str){
    return str.toLowerCase();
  }

  String concat(String str1, String str2){
    return String.join("",str1,str2);
  }

  int len(String str){
    return str.length();
  }

  String replace(String str1, String str2, String str3){
    return str1.replace(str2,str3);
  }
  String[] split(String str){

    return ( str.split(" "));
  }
}

class Program3{
  public static void main(String args[]){
    
    Scanner scanner = new Scanner(System.in);
    StringFunctions sf = new StringFunctions();

    int option;
    boolean flag = true;

    System.out.printf("0) exit\n1) to uppercase\n2) to lowercase\n3) concat two string\n4) length of a string\n5) replace string\n6) split string\n\n");
    
    while(flag){

      System.out.println("Enter a choice : ");
      option = scanner.nextInt();

      switch(option){
        case 0 : {
          System.out.println("exiting...");
          flag = false;
          break;
        }
        case 1 : {
          System.out.println("Enter a string to convert to uppercase : ");         
          String str = scanner.next();
          System.out.printf("Uppercase : %s\n",sf.upper(str));
          break;
        }
        case 2: {
          System.out.println("Enter a string to convert to lowercase : ");
          String str = scanner.next();
          System.out.printf("Lowercase : %s\n",sf.lower(str));
          break;
        }
        case 3: {
         System.out.println("Enter the first string : ");
         String str1 = scanner.next();
         System.out.println("Enter the second string : ");
         String str2 = scanner.next();
         System.out.printf("Concated string : %s\n",sf.concat(str1,str2));
         break;
        }
        case 4: {
          System.out.println("Enter the string to find length : ");
          String str = scanner.next();
          System.out.printf("The length of the string is :  %d\n",sf.len(str));
          break;
        }
        case 5: {
          System.out.println("Enter the string : ");
          String str1 = scanner.next();
          System.out.println("Enter the substring to replace : ");
          String str2 = scanner.next();
          System.out.println("Enter the substring to be replaced with : ");
          String str3 = scanner.next();
          System.out.printf("The new string : %s\n",sf.replace(str1,str2,str3));
          break;
        }
        case 6 : {
          System.out.print("Enter a string to split (split at whitespcae) : ");
           scanner.nextLine();
          String str = scanner.nextLine();
          String[] words = sf.split(str);
          System.out.print("String after split : ");
          for(int i = 0 ; i < words.length ; i++){
            System.out.printf("%s\t",words[i]);
          }
          System.out.println();
          break;
        }
        default: {
          System.out.println("Wrong choice!!\n");
        }
      }
    }
    scanner.close();
  }
}

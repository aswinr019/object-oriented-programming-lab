/*
 Write a user defined exception class to authenticate the username and password.
 */

import java.util.Scanner;

class AuthenticationException extends Exception {
  
  public AuthenticationException(String message){
    super(message);
  }
}

class User {
  private String username , password ;

  public User(String username , String password ){
    this.username = username;
    this.password = password;
    System.out.println("account created!");
  }

  private boolean isValidUser(String username , String password ){

    return (this.username.equals(username) && this.password.equals(password));
  }

  public void login(String username , String password ) throws AuthenticationException {

    if(!isValidUser(username,password))
      throw new AuthenticationException("invalid username or password!");
    else
      System.out.println("logged-in successfully");
  }

}


class Program3 {

  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);

    System.out.print("enter a username and password to create an account : ");
    String username = scanner.next();
    String password = scanner.next(); 

    User user = new User(username,password);

    System.out.print("enter the username and password to login : ");
    username = scanner.next();
    password = scanner.next();

    try {
      user.login(username,password);
    }
    catch( AuthenticationException e ){
      System.out.println(e.getMessage());
    }
    catch( Exception e ){
      System.out.println("Something went wrong!");
    }
    scanner.close();
  }
}

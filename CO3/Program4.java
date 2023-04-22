/* Write a program that has class Publisher , Book , Literature and fiction. Read the information and print the
details of the book from either the category , using inheritance. */

import java.util.Scanner;

class Publisher {

  String publisher;

  Publisher(String publisher) {
    this.publisher = publisher;
  }
}

class Book extends Publisher{

  String author;
  int noOfPages,price;

  Book(String publisher , String author , int noOfPages, int price){
    super(publisher);
    this.author = author;
    this.noOfPages = noOfPages;
    this.price = price;
  }
}

class Literature extends Book {

  String litName;

  Literature(String publisher, String author, int noOfPages, int price, String litName) {
    super(publisher, author, noOfPages, price);
    this.litName = litName;
  }

  void display() {
    System.out.printf(
        "\nBook Name : %s\nGenere : Literature\nAuthor : %s\nPublisher : %s\nNumber of pages : %d\nPrice : %d\n\n",
        this.litName, this.author, this.publisher, this.noOfPages, this.price);
  }
}

class Fiction extends Book {

  String fictName;

  Fiction(String publisher, String author, int noOfPages, int price, String fictName) {
    super(publisher, author, noOfPages, price);
    this.fictName = fictName;
  }

  void display() {
    System.out.printf(
        "\nBook Name : %s\nGenere : Fiction\nAuthor : %s\nPublisher : %s\nNumber of pages : %d\nPrice : %d\n\n",
        this.fictName, this.author, this.publisher, this.noOfPages, this.price);
  }

}

class Program4 {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do{
      System.out.print("enter a choice :\n0) exit\n1) Literature book\n2) Fiction book\n\n-> ");
      choice = scanner.nextInt();

      switch (choice) {

        case 0 -> {
          System.out.println("exiting...");
        }

        case 1 -> {
          System.out.printf("Enter the book title , author name , publisher name , price and number of pages of literature : ");
          String title = scanner.next();
          String author = scanner.next();
          String publisher = scanner.next();
          int price = scanner.nextInt();
          int pageNo = scanner.nextInt();

          Literature lit = new Literature(publisher, author, pageNo, price, title);

          System.out.print("Literature details\n-----------------\n");
          lit.display();
        }

        case 2 -> {
          System.out.printf("Enter the book title , author name , publisher name , price and number of pages of fiction : ");
          String title = scanner.next();
          String author = scanner.next();
          String publisher = scanner.next();
          int price = scanner.nextInt();
          int pageNo = scanner.nextInt();

          Fiction fict = new Fiction(publisher, author, pageNo, price, title);

          System.out.print("Literature details\n-----------------\n");
          fict.display();
        }
        default -> {
          System.out.println("Wrong choice");
        }
      }
    } while (choice != 0);

    scanner.close();
  }
}

/* Write a program that has class Publisher , Book , Literature and fiction. Read the information and print the
details of the book from either the category , using inheritence */

import java.util.Scanner;

class Publisher {

  String publisher;

  Publisher(String publisher) {
    this.publisher = publisher;
  }
}

class Book extends Publisher{

  String author;
  int no_of_pages,price;

  Book(String publisher , String author , int no_of_pages, int price){
    super(publisher);
    this.author = author;
    this.no_of_pages = no_of_pages;
    this.price = price;
  }
}

class Literature extends Book {

  String lit_name;

  Literature(String publisher, String author, int no_of_pages, int price, String lit_name) {
    super(publisher, author, no_of_pages, price);
    this.lit_name = lit_name;
  }

  void display() {
    System.out.printf(
        "\nBook Name : %s\nGenere : Literature\nAuthor : %s\nPublisher : %s\nNumber of pages : %s\nPrice : %s\n\n",
        this.lit_name, this.author, this.publisher, this.no_of_pages, this.price);
  }
}

class Fiction extends Book {

  String fict_name;

  Fiction(String publisher, String author, int no_of_pages, int price, String fict_name) {
    super(publisher, author, no_of_pages, price);
    this.fict_name = fict_name;
  }

  void display() {
    System.out.printf(
        "\nBook Name : %s\nGenere : Fiction\nAuthor : %s\nPublisher : %s\nNumber of pages : %s\nPrice : %s\n\n",
        this.fict_name, this.author, this.publisher, this.no_of_pages, this.price);
  }

}

class Program4 {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do{
      System.out.print("enter a choice :\n0) exit\n1)Literature book\n2)Fiction book\n\n-> ");
      choice = scanner.nextInt();

      switch (choice) {

        case 0: {
          System.out.println("exiting...");
          break;
        }

        case 1: {
          System.out.printf("Enter the book title , author name , publisher name , price and number of pages of literature : ");
          String title = scanner.next();
          String author = scanner.next();
          String publisher = scanner.next();
          int price = Integer.parseInt(scanner.next());
          int page_no = Integer.parseInt(scanner.next());

          Literature lit = new Literature(publisher, author, page_no, price, title);

          System.out.print("Literature details\n-----------------\n");
          lit.display();
          break;
        }

        case 2: {
          System.out
              .printf("Enter the book title , author name , publisher name , price and number of pages of fiction : ");
          String title = scanner.next();
          String author = scanner.next();
          String publisher = scanner.next();
          int price = Integer.parseInt(scanner.next());
          int page_no = Integer.parseInt(scanner.next());

          Fiction fict = new Fiction(publisher, author, page_no, price, title);

          System.out.print("Literature details\n-----------------\n");
          fict.display();
          break;
        }
        default: {
          System.out.println("Wrong choice");
        }
      }
    } while (choice != 0);

    scanner.close();
  }
}

/*
 Add two complex numbers 
*/

import java.util.Scanner;

class Complex{

  int real;
  int imaginary;

  Complex(int real , int imaginary){
    this.real = real;
    this.imaginary = imaginary;
  }

  Complex add(Complex c2){
    Complex sum = new Complex(this.real + c2.real , this.imaginary + c2.imaginary);
    return sum;
  }

  void display(){
    System.out.printf("%d + %di\n",this.real,this.imaginary);
  }

}

class Program3{

  public static void main(String args[]){

    int real[] = new int[2];
    int imaginary[] = new int[2];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the real and imaginary part of first complex number : ");
    real[0] = scanner.nextInt();
    imaginary[0] = scanner.nextInt();

    System.out.println("Enter the real and imaginary part of second complex number : ");
    real[1] = scanner.nextInt();
    imaginary[1] = scanner.nextInt();

    Complex complex1 = new Complex(real[0],imaginary[0]);
    Complex complex2 = new Complex(real[1],imaginary[1]);

    System.out.print("Complex number one : ");
    complex1.display();
    
    System.out.print("Complex number two : ");
    complex2.display();
    
    System.out.print("Sum of complex number one and two : ");
    Complex complex3 = complex1.add(complex2);
    complex3.display();

    scanner.close();
  }
}

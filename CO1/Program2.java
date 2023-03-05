/*
Read two matrices from the console and perform matrix addition.
*/

import java.util.Scanner;

class Program2{

  public static void main(String args[]){

    int row[] = new int[2];
    int col[] = new int[2];
  
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of rows and and columns of matrix one : ");
    row[0] = scanner.nextInt();
    col[0] = scanner.nextInt();

    System.out.println("Enter the number of rows and columns of matrix two : ");
    row[1] = scanner.nextInt();
    col[1] = scanner.nextInt();
  
    if(row[0] != row[1] || col[0] != col[1])
      System.out.println("Matrix one and two have different dimentions , therefore addition is not possible!");
    else {
      int mat1[][] = new int[row[0]][col[0]];
      int mat2[][] = new int[row[0]][col[0]];
      int mat3[][] = new int[row[0]][col[0]];

      System.out.printf("Enter %d numbers of matrix one : ",row[0]*col[0]);

      for(int i = 0; i < row[0]; i++){
        for(int j = 0; j < col[0]; j++){
          mat1[i][j] = scanner.nextInt(); 
        }
      }

      System.out.printf("Enter %d number of matrix two : ",row[0]*col[0]);

      for(int i = 0; i < row[0]; i++){
        for(int j = 0; j < col[0]; j++){
          mat2[i][j] = scanner.nextInt();
        }
      }

      System.out.println("The sum of two matrices is : ");

      for(int i = 0; i < row[0]; i++){
        for(int j = 0; j < col[0]; j++){
          mat3[i][j] = mat1[i][j] + mat2[i][j];
          System.out.printf("%d\t",mat3[i][j]);
        }
        System.out.println();
      }
    }
    scanner.close();
  }
}

/*
Read two matrices from the console and perform matrix addition.
*/

import java.util.Scanner;

class Matrix{
  int row,col;
  int matrix[][];

  Matrix(int row, int col){
    this.row = row;
    this.col = col;

    matrix = new int[this.row][this.col];
  }

  void getElements(int [][] array){
    for(int i = 0; i < this.row; i++){
      for(int j = 0; j < this.col; j++){
        this.matrix[i][j] = array[i][j];
      }
    }
  }

  Matrix add(Matrix mat){
    Matrix sum = new Matrix(this.row,this.col);

    int array[][] = new int[this.row][this.col];

    for(int i = 0; i < this.row; i++){
      for(int j = 0; j < this.col; j++){
          array[i][j] = this.matrix[i][j] + mat.matrix[i][j];      
        }
    }
    sum.getElements(array);
    return sum;
  }

  void display(){
    for(int i = 0; i < this.row; i++){
      for(int j = 0; j < this.col; j++){
        System.out.printf("%d\t",this.matrix[i][j]);
      }
      System.out.println();
    }
  }
}


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

      Matrix m1 = new Matrix(row[0],col[0]);
      Matrix m2 = new Matrix(row[1],col[1]);
      Matrix m3;


      System.out.println("First matrix");
      m1.getElements(mat1);
      m1.display();

      System.out.println("Second matrix");
      m2.getElements(mat2);
      m2.display();

      m3 = m1.add(m2);
      System.out.println("Sum of the two matrices");
      m3.display();
    }
    scanner.close();
  }
}

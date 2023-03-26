/*
 Read a matrix from the console and check whether it is symmetric or not.
*/

import java.util.Scanner;

class Matrix{
  int row, col;
  int matrix[][] , transpose[][];

  Matrix(int row, int col){
    this.row = row;
    this.col = col;
    matrix = new int[this.row][this.col];
    transpose = new int[this.col][this.row];
  }

  void getElements(int[][] array){
    for(int i = 0; i < this.row; i++){
      for(int j = 0; j < this.col; j++){
        this.matrix[i][j] = array[i][j];
      }
    }
  }
      boolean generateTranspose(){

        if(this.row != this.col){
          return false;
        }
        else{
          for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++){
              this.transpose[i][j] = this.matrix[j][i];
            }
          }
          return true;
        }
      }

      boolean compare(){

        if(this.row != this.col)
          return false;
        else {
          for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++){
              if(this.matrix[i][j] != this.transpose[i][j])
                return false;
            }
          }
          return true;
        }
      }

      void displayMatrix(){
        for(int i = 0; i < this.row; i++){
          for(int j = 0; j < this.col; j++){
            System.out.printf("%d\t",this.matrix[i][j]);  
          }
          System.out.println();
        }
      }
      void displayTranspose(){

        if(this.row == this.col){
          for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++){
              System.out.printf("%d\t",this.transpose[i][j]);
            }
            System.out.println();
          }
        }
      }
}

class Program4{
 public static void main(String args[]){
  
   int row , col;

   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter the number of rows and columns : ");
   row = scanner.nextInt();
   col = scanner.nextInt();

   Matrix mat = new Matrix(row,col);
   int array[][]  = new int[row][col];
   //int transpose[][] = new int[col][row];

   System.out.printf("Enter %d numbers of the matrix : ",row*col);
   for(int i = 0; i < row ; i++){
    for(int j = 0; j < col; j++){
      array[i][j] = scanner.nextInt();
    }
   }


   mat.getElements(array);
   System.out.println("The given matrix");
   mat.displayMatrix();
   boolean generate_transpose = mat.generateTranspose();

   if(generate_transpose){
     System.out.println("The transpose of the matrix");
     mat.displayTranspose();
     boolean result = mat.compare();
     if(result)
       System.out.println("The given matrix is a symmetric matrix");
     else
       System.out.println("The given matrix is not a symmetric matrix");
   }
   else
     System.out.println("The given matrix doesn't have a transpose , i.e , it is not a symmetric matrix");
   /*
   System.out.println("The given matrix : ");
   for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
      System.out.printf("%d\t",mat[i][j]);    
      }
    System.out.println();
   }

   System.out.println("The transpose of given matrix : ");
   for(int i = 0; i < col; i++){
    for(int j = 0; j < row; j++){
      transpose[i][j] = mat[j][i];
      System.out.printf("%d\t",transpose[i][j]);
    }
    System.out.println();
   }

   if(row != col) System.out.println("The given matrix is not a symmetric matrix");
   else {
    boolean is_transpose = true;
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        if( mat[i][j] != transpose[i][j]) is_transpose = false;
      }
    }
    if(is_transpose) System.out.println("The given matrix is a symmetric matrix!");
    else System.out.println("The given matrix is not a symmetric matrix");
   }*/
   scanner.close();
 } 
}


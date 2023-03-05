/*
 Read a matrix from the console and check whether it is symmetric or not.
*/

import java.util.Scanner;

class Program4{
 public static void main(String args[]){
  
   int row , col;

   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter the number of rows and columns : ");
   row = scanner.nextInt();
   col = scanner.nextInt();

   int mat[][]  = new int[row][col];
   int transpose[][] = new int[col][row];

   System.out.printf("Enter %d numbers of the matrix : ",row*col);
   for(int i = 0; i < row ; i++){
    for(int j = 0; j < col; j++){
      mat[i][j] = scanner.nextInt();
    }
   }

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
    if(isTranspose) System.out.println("The given matrix is a symmetric matrix!");
    else System.out.println("The given matrix is not a symmetric matrix");
   }
   scanner.close();
 } 
}


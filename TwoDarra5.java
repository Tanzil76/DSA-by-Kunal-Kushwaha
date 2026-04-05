// Write a program to display transpose of matrix by the user.

import java.util.Scanner;

public class TwoDarra5 {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows and columns of matrix : ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int[][] matrix = new int[r][c];
    int totalElements = r * c;
    System.out.println("Enter " + totalElements + " values: ");
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    System.out.println("Input Matrix: ");
    priintMatrix(matrix);

    System.out.println("Transpose of matrix: ");
}

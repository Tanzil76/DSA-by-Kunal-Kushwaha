import java.util.Scanner;

public class TwoDarra2 {

    static void printArray(int[][] arr){

        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) {  // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c]; // total = r*c

        System.out.println("Enter " + r*c + " elements: ");
        for (int i = 0; i < arr.length; i++) { // row
            for (int j = 0; j < arr[i].length; j++) { // column
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}


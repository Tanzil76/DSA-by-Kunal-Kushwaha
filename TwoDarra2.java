public class TwoDarra2 {

    static void printArray(int[][] arr){

        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr.length; j++) {  // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = { {1, 5, 6}, {7, 9, 11}, {8, 1, 1} };
    printArray(arr);
    }
}


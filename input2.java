import java.util.Arrays;
import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // arrays of primitives
        int[] arr = new int[5];
    //    arr[0] = 23;
    //    arr[1] = 45;
    //    arr[2] = 233;
    //    arr[3] = 543;
    //    arr[4] = 3;
        // [23, 45, 233, 543, 3]
    //    System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));// Arrays class has .toString method when you give an array into it . it basically converts it into a string
    }
}

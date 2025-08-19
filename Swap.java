// swap two elements

import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        // swap function ko call karta hai with: arr - Array reference, index1 = 1, index2 = 3.
        swap(arr, 1, 3);
    }
    static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

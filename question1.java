import java.util.Scanner;

public class question1 {

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean containsDuplicate(int[] arr) {

    int n = arr.length;

    for(int i = 0; i < n; i++) {

        for(int j = i + 1; j < n; j++) {

            if(arr[i] == arr[j]) {
                return true;   // duplicate found
            }

        }

    }

    return false;   // no duplicate found
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter " + n + " elements: ");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println("Original array: ");
    printArray(arr);

    boolean result = containsDuplicate(arr);

    System.out.println("Result: " + result);
}
}


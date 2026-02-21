import java.util.Scanner;

public class TwoPointer2 {

    static void printArray(int[] arr){    // ye method array ko print karta hai
    int n = arr.length;                  // Array ka size n mai store kiya

    // Loop 0 se n-1 tak chalega
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");   // Har element print karo
    }

    System.out.println();
}
    
    static void swap(int[] arr, int i, int j){         // ye method aaray ke do elememts ko swap karta hai
        int temp = arr[i];                            // arr[i] ko temporary variable me store kiya
        arr[i] = arr[j];                              // arr[j] ko arr[i] mai daal diya
        arr[j] = temp;                                // temp (original arr[i]) ko arr[j] me daal diya
    }

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;

        int left = 0, right = n-1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");

        // User se array ke elements input liye
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArray(arr);                             // Original array print kiya

        sortZeroesAndOnes(arr);                      // Sorting function call kiya
        System.out.print("Sorted array: ");
        printArray(arr);                             // Sorted array print kiya
    }
}


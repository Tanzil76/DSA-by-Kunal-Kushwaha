
// Sort an array consisting of only 0s and 1s.

import java.util.Scanner;

public class TwoPoint {

    static void printArray(int[] arr){    // ye method array ko print karta hai
    int n = arr.length;                  // Array ka size n me store kiya

    // Loop 0 se n-1 tak chalega
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");   // Har element print karo
    }

    System.out.println();
}

    static void swap(int[] arr, int i, int j){    // ye method aaray ke do elememts ko swap karta hai
    int temp = arr[i];                            // arr[i] ko temporary variable me store kiya
    arr[i] = arr[j];                              // arr[j] ko arr[i] me daal diya
    arr[j] = temp;                                // temp (original arr[i]) ko arr[j] me daal diya
}

    static void sortZeroesAndOnes(int[] arr){     // Ye method 0s aur 1s ko sort karta hai
    int n = arr.length;                            // Array ka size
    int zeroes = 0;                              // 0s count karne ke liye variable

    // count number of zeroes
    for(int i = 0; i < n; i++){
        if (arr[i] == 0) {                      // Agar element 0 hai
            zeroes++;                          // zeroes count badha do
        }
    }

    /*
           Ab maan lo:
           zeroes = 3
           Matlab array me 3 zero hain

           To sorted array aisa hoga:
           index 0,1,2  -> 0
           index 3 se end -> 1
        */

    // 0 to zeroes-1 : 0, zeroes to n-1 : 1
    for(int i = 0; i < n; i++){                  
        if(i < zeroes){
            arr[i] = 0;                            // Pehle zeroes positions me 0 daalo
        } else{
            arr[i] = 1;                          // Baaki sab jagah 1 daalo
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

// Give an integer array 'a', return the prefix sum/ running sum in the same array without creating a new array.

import java.util.Scanner;

public class PrefixSum {

    static void printArray(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Input Array: ");
        printArray(arr);

        int[] pref = makePrefixSumArray(arr);
        System.out.print("Prefix Sum: ");
        printArray(pref);
    }
}

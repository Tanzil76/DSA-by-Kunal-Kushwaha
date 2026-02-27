import java.util.Scanner;

public class SuffixSum {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] makeSuffixSumArray(int[] arr){
        int n = arr.length;

        for (int i = n-2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i+1];
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
    //    System.out.print("Input Array: ");
    //    printArray(arr);

        int[] suff = makeSuffixSumArray(arr);
        System.out.print("Suffix Sum: ");
        printArray(suff);
    }
}

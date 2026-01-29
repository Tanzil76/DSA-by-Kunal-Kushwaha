import java.util.Arrays;
import java.util.Scanner;

public class microsoft {
    
    /**
     * Find and rearrange array to next greater permutation in-place
     * Algorithm:
     * 1. Find the rightmost position i where arr[i] < arr[i+1]
     * 2. If not found, reverse entire array (it's the last permutation)
     * 3. Find the rightmost position j where arr[j] > arr[i]
     * 4. Swap arr[i] and arr[j]
     * 5. Reverse the subarray from i+1 to end
     */
    static void nextPermutation(int[] arr) {
        int n = arr.length;
        
        // Step 1: Find the rightmost index i where arr[i] < arr[i+1]
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        // If no such index exists, array is in descending order (last permutation)
        if (i == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        
        // Step 2: Find the rightmost index j where arr[j] > arr[i]
        int j = n - 1;
        while (j > i && arr[j] <= arr[i]) {
            j--;
        }
        
        // Step 3: Swap arr[i] and arr[j]
        swap(arr, i, j);
        
        // Step 4: Reverse the subarray from i+1 to end
        reverse(arr, i + 1, n - 1);
    }
    
    /**
     * Helper method to swap two elements in array
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    /**
     * Helper method to reverse subarray from start to end indices
     */
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            nextPermutation(arr);
            
            // Print the result
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            t--;
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class Arra5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter size of an array " + " ");
        int n = sc.nextInt();
        System.out.print("Array elements " + " ");
        int[] arr = new int[n];
      
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Tell the number " + " ");
        int x = sc.nextInt();
        System.out.println("Count of X: " + countOccurences(arr, x));
    }

    static int countOccurences(int[] arr , int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        
        return count;
    }
}

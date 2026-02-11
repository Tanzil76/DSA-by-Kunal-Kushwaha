import java.util.Scanner;

public class Arra6 {
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
        System.out.println("Last Occurence of X: " + LastOccurences(arr, x));
    }
     static int LastOccurences(int[] arr , int x){
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        
        return lastIndex;
    }
}


import java.util.Scanner;

public class Recursion2 {

    static void printDecreasing(int n){ // 5 4 3 2 1

        // base case
        if(n == 1){
            System.out.println(n);
            return;
        }
        // Self work
        System.out.println(n); // n

        // recursive work
        printDecreasing(n-1); // n-1, n-2, ....1

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}

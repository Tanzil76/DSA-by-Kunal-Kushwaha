// Find the value of factorial 5.

import java.util.Scanner;

public class Recursion3{

    static int factorial(int n){  // n = 5

        // Base case
        if(n == 0){
            return 1;
        }

        //  Smaller problem - Recursive work
        int smallAns = factorial(n - 1);  // factorial(4) = 24

        // Big problem - self work
        int ans = n * smallAns; // n * factorial(n-1)
        return ans;

    }
    public static void main(String[] args){
        System.out.println(factorial(5)); 
    }
}
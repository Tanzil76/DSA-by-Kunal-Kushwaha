   // write a program to print all natural numbers from 1 to n using recursion.

import java.util.Scanner;

public class Recursion {

    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n);         // -> Base Case
            return;
        }

        printIncreasing(n-1); // 1, 2, .... n-1    -> Smaller subproblem
        System.out.println(n);             // Self Work
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}

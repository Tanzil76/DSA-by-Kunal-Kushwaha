// Given an integer, find out the sum of its digits using recursion.

public class Recursion5 {

    static int sod(int n){
        // Base Case
        if(n >= 0 && n <= 9){
            return n;
        }

        // recursive work - small ans
        int smallAns = sod(n/10);

        // self work
        int ans = smallAns + n % 10;
        return ans;
    }
    public static void main(String[] args){
        System.out.println(sod(1234));
    }
}

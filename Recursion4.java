// 

public class Recursion4 {

    static int fib(int n){

        // Base case
        if(n == 0 || n == 1){
            return n;
        }

        // Subproblem
        int prev = fib(n-1);
        int prePrev = fib(n-2);

        // Self work
        int ans = prev + prePrev;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}

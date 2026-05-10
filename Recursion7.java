public class Recursion7 {
    static int pow(int p, int q){ // p^q

        // Base Case
        if(q == 0) return 1;

        // Recursive work and Self work
        return pow(p, q-1) * p;  // p^q-1 * p = p^q
    }
    public static void main(String[] args){
        System.out.println(pow(5, 4));
    }
}

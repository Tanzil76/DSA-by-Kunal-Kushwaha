public class Recursion6 {
    static int count(int n){

        // Base Case
        if(n == 0){
            return 0;
        }

        // recursive work
        int smallAns = count(n/10);

        // self work
        int ans = 1 + smallAns;
        return ans; 
    }
    public static void main(String[] args){
        System.out.println(count(5678));
    }
}

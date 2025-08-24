import java.util.Arrays;

public class LinearSearchInString2 {
    
    public static void main(String[] args) {
        String name = "Tanzil";
        char target = 'z';
        System.out.println(search2(name, target)); // function call ho raha hai
        System.out.println(Arrays.toString(name.toCharArray()));

       // name.toCharArray() → string ka char[] banata hai: {'T','a','n','z','i','l'}

      // Arrays.toString(...) us char[] ko human-readable form me print karta hai: [T, a, n, z, i, l]

    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        // enhance forloop
        for(char ch : str.toCharArray()){
                if(ch == target){
                    return true;

                }             
            }       
        return false;
    }
}

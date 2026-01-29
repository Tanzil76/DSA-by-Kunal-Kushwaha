import java.util.Arrays;

public class question {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] output = Arrays.copyOf(arr, arr.length);
        
        System.out.println(Arrays.toString(output));
    }
}

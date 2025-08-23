public class LinearSearch2 {
     static int LinearSearch2(int[] arr, int target){
        // check array is empty or not
        if(arr.length == 0){
            return -1;
        }
        // run a ehance for loop
        for (int element : arr) {
            if(element == target){
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
        public static void main(String[] args){
            int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
            int target = -11;
            int ans = LinearSearch2(nums, target);
            System.out.println(ans);
        }
    
}


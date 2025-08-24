
// search for 3 in the range of index [1, 4] 
public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(LinearSearch(arr, target, 1, 4));
    }
    static int LinearSearch(int[] arr, int target, int start, int end){
            if(arr.length == 0) {
                return -1;
            }

            for(int index  = start; index <= end; index++){
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }
            return -1;  
    }
}

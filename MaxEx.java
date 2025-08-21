public class MaxEx {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(maxRange(arr, 1, 3));
    }

    
    // imagine that arr is not empty
    static int max(int[] arr) { // create function for max.
        int maxVal = arr[0]; // starting assumption: pehla element hi max.
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxVal){ //agar current element max se bada hai.
                maxVal = arr[i];  // to max ko update kar do
            }
        }
        return maxVal; // final maximum wapas bhejo
        
    }
    static int maxRange(int[] arr, int start, int end) { 
        int maxVal = arr[start]; 
        for (int i = start; i <= end; i++){
            if (arr[i] > maxVal){ 
                maxVal = arr[i];  
            }
        }
        return maxVal;
    }
}

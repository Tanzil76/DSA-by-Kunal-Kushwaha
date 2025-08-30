public class BinarySearch {

    //return the index 
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            // int  mid = (start+end)/2; // might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end-start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else  if (target > arr[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
      public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
      }
} // output : 10


// Dry Run:

/*
 * Step	         start	     end	        mid calc	      mid	   arr[mid]      Compare	                Next move
    1	           0	      12	    0 + (12-0)/2 = 6	   6	     4	          22 > 4	                 start = 7
    2	           7	      12	    7 + (12-7)/2 = 9	   9	     18	          22 > 18	                 start = 10
    3	           10	      12	    10 + (12-10)/2 = 11	   11	     45	          22 < 45	                 end = 10
    4	           10	      10	    10 + (10-10)/2 = 10	   10	     22	          22 == 22 	                 return 10
 */
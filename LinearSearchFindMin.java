public class LinearSearchFindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 14, 28};
        System.out.println(min(arr));
    }

    // assume arr.length !=0
    // return the minimum value in the array
    static int min(int[] arr){
        //Hum initial assumption rakhte hain: sabse chhota element pehle element hi ho sakta hai. Isko ans (answer) me store karte hain.
        int ans = arr[0];
        // Loop index i 1 se start hota hai (0 se nahi) kyunki arr[0] already ans me liya hua hai — usko dobara compare karne ki zaroorat nahi.
        for(int i = 1; i < arr.length; i++){
        // Agar current element humare stored ans se chhota mila → to ans ko update kar do. Yani abhi tak ka minimum naya value hai.
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

   /*  Dry run the code
       
       Initial: arr = [18, 12, 7, 14, 28]
       Start: ans = arr[0] = 18

              i(loop)	 arr[i]	                  arr[i] < ans ?	  new ans
		         1         12                           yes	           12
		         2          7                           yes             7
			     3         14                            no             7
			     4         28                            no             7

                 Loop ends → return 7 → System.out.println prints 7.

   */

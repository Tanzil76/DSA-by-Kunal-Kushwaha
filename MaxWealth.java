public class MaxWealth {
    static int maximumWealth(int[][] accpunts){
        //person = row
        //account = col
        int ans = Integer.Min_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col, take a new sim for that row
            int sum = 0;
            for (int accounts = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
                
            }
            // now we have sum of accounts of person 
            // check with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}

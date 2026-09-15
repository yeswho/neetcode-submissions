class Solution {
    public int maxProfit(int[] prices) {
        //prices=[7,1,5,3,6,4]
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<prices.length; i++){
            min = Math.min(min, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i]-min);
        }


        return maxProfit;
    }
}

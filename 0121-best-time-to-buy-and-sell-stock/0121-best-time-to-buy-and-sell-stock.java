class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++) {
            if(prices[i]>buy) {
                int profit = prices[i]-buy;
                max = Math.max(max,profit);
            }else{
                buy = prices[i];
            }
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
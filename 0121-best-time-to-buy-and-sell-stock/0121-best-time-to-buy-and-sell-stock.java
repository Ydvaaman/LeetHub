class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSofar = prices[0];
        
        for(int i=0;i<prices.length;i++){
            minSofar = Math.min(prices[i],minSofar);
            int profit = prices[i]-minSofar;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
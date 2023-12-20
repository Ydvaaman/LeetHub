class Solution {
    public int buyChoco(int[] prices, int money) {
        int minCost = Integer.MAX_VALUE;
        int n = prices.length;
        
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int cost = prices[i]+prices[j];
                if(cost<minCost){
                    minCost = cost;
                }
            }
        }
        if(minCost<=money){
            return money - minCost;
        }else{
            return money;
        }
    }
}
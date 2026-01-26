class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyStock=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>buyStock)
            {
                 maxProfit=Math.max(maxProfit,prices[i]-buyStock);
            }
            buyStock=Math.min(buyStock,prices[i]);
        }
        return maxProfit;
         
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy, prices[i]);
             sell = Math.max(sell , prices[i] - buy);
        }
            
     return sell < 0 ? 0 : sell;
    }
}
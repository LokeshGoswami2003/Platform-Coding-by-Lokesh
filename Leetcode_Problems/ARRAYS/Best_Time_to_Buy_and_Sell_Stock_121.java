class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int currentprofit=0;
        int minyet=prices[0];
        for(int i=0;i<prices.length;i++){
            currentprofit=prices[i]-minyet;
            maxprofit=(currentprofit>maxprofit) ? currentprofit:maxprofit;
            minyet=(prices[i]<minyet) ? prices[i] : minyet;
        }
        return maxprofit;
    }
}
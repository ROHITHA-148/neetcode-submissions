class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int buy=0;
        int sell=1;
        while(sell<prices.length){
            if(prices[buy]<prices[sell]){
                res=Math.max(res,prices[sell]-prices[buy]);
            }
            else{
                buy=sell;
            }
            sell++;
        }
        return res;
    }
}

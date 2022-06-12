class Solution {
    public int maxProfit(int[] prices) {
        int r = 0, m = prices[0];
        for(int i=1;i< prices.length; i++){
            if(prices[i] > m){
                r = Math.max(r, prices[i] - m);
            }
            m = Math.min(m, prices[i]);
        }
        return r;
    }
}
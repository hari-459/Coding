class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit;
        for(int p : prices)
        {
            if(p < min) min=p;
            else if(p - min > max_profit) max_profit = p - min;
        }
        return max_profit;
    }
}
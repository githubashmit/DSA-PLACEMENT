package src;

public class L121_stock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSofar = prices[0];
        for(int i = 0; i < prices.length;i++){
            minSofar = Math.min(minSofar , prices[i]);
            int Profit = prices[i] - minSofar;
            maxProfit = Math.max(maxProfit , Profit);
        }
        return maxProfit;
    }
}

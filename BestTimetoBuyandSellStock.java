public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int cur = prices[i] - min;
            profit = Math.max(cur,profit);
        }
        return profit;
        
    }
}

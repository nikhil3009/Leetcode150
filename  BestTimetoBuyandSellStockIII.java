public class  BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE;
        int buy2 = Integer.MIN_VALUE;
        int profit1 = 0;
        int profit2 = 0;
        for(int price:prices){
            buy1 = Math.max(buy1,-price);
            profit1 = Math.max(profit1,price+buy1);
            buy2 = Math.max(buy2,profit1-price);
            profit2 = Math.max(profit2,price+buy2);
        }
        return profit2;
    }
}

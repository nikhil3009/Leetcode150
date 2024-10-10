public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            int mini = Integer.MAX_VALUE;
            for(int c : coins){
                int dif = i-c;
                if(dif>=0 && dp[dif]!=Integer.MAX_VALUE){
                    mini = Math.min(mini,dp[dif]+1);
                }
                
            }
            dp[i] = mini;
        }
        if(dp[amount] <Integer.MAX_VALUE){
            return dp[amount];
        }
        return -1;
    }
}

package H100;

public class H121 {
    public static void main(String[] args) {
        int[] prices = {4,9,2,8,3,6,4,8,1,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for(int j = 0;j<=i;j++){
                if(i>j && prices[i] > dp[j] && prices[i]>prices[j]){
                    dp[j] = prices[i];
                }
            }
        }
        int maxProfit = 0;
        for(int i = 0;i<dp.length;i++){
            if((dp[i] - prices[i])>maxProfit){
                maxProfit = dp[i]-prices[i];
            }
        }
        return maxProfit;
    }
}

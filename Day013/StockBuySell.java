package Day013;

public class StockBuySell {
    public int maxProfit(int[] prices) {
        int max = 0,inc =0;
        for(int i =prices.length-1;i>=0;i--){
            max = Math.max(max,prices[i]);
            inc = Math.max(inc,max-prices[i]);
        }
        return inc;
    }
}

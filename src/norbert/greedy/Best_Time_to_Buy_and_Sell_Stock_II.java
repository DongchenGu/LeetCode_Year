package norbert.greedy;


//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
public class Best_Time_to_Buy_and_Sell_Stock_II {

    public int maxProfit(int[] prices) {
        int result =0;
        int  temp =0;
        for(int i=1; i<prices.length; i++){
            temp = prices[i] - prices[i-1];
            if(temp >0){result+= temp;}
        }
        return result;
    }
}

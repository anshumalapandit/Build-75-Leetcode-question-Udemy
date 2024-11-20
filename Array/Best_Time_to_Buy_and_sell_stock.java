import java.util.*;
class Solution {
    //T.C=0(n) S.C=> 0(1)
    public int maxProfit(int[] prices) {
        int profit =0,minPrice=prices[0];
        for(int i=0;i<prices.length;i++){
            int currPrice=prices[i];
            profit=Math.max(profit,currPrice-minPrice);
            minPrice=Math.min(minPrice,currPrice);
        }
        return profit;
    }
}

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 */

public class Solution 
{
    public int maxProfit(int[] prices) 
    {
        if (prices.length < 2)
            return 0;
            
        int min = Integer.MAX_VALUE;
        int rst = 0;
        for (int i : prices)
        {
            // get the lowest
            min = i < min ? i : min;
            // get profit since from min
            rst = (i - min) > rst ? i - min : rst;
        }
        return rst;
    }
}
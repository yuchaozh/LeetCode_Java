/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 * Created by yuchaozh on 15/1/27.
 */
public class BestTimetoBuyandSellStockII
{
	public int maxProfit(int[] prices)
	{
		// in java array use .length, not .size(), not .length()
		if (prices.length < 2)
			return 0;
		int result = 0;
		for (int i = 1; i < prices.length; i++)
		{
			if (prices[i] > prices[i - 1])
			{
				result += prices[i] - prices[i - 1];
			}
		}
		return result;
	}
}

package problems.arrays;


/**
 * Say you have an array for which the ith element is the price of a given stock on day
 * . If you were only permitted to complete at most one transaction (ie, buy one and sell
 * one share of the stock), design an algorithm to find the maximum profit.
 */

public class BestTimeToBuyAndSell
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
        System.out.println(bestTimeToBuyAndSell.maxProfit(array));
    }

    public int maxProfit(int[] prices)
    {
        int profit = 0;
        int minElement = Integer.MAX_VALUE;
        for (int price : prices)
        {
            profit = Math.max(profit, price - minElement);
            minElement = Math.min(minElement, price);
        }
        return profit;
    }
}

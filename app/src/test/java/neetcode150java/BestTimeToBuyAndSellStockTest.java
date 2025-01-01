package neetcode150java;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void shouldPassTestCase1() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = { 10, 1, 5, 6, 7, 1 };
        int result = bestTimeToBuyAndSellStock.maxProfit(prices);

        assert result == 6;
    }

    @Test
    public void shouldPassTestCase2() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = { 10, 8, 7, 5, 2 };
        int result = bestTimeToBuyAndSellStock.maxProfit(prices);

        assert result == 0;
    }
}

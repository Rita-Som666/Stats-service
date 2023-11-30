package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldFindMinDayBetweenEnds() {
        StatsService service = new StatsService();
        arrCalculate service1 = new arrCalculate();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] expectedMonth = {9};
        int[] actualMonth = service.findMinSalesMonths(sales);
        boolean resultEquals = service1.arrMonths(expectedMonth, actualMonth);


    }

    @Test
    public void shouldCalculateTotalAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 180;
        long actualAmount = service.calculateTotalAmount(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldCalculateAverageAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 15;
        double actualAmount = service.calculateAverageAmount(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        arrCalculate service1 = new arrCalculate();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] maxMonth = service.getMaxMonth(sales);
        int[] expectedMonths = {6, 8};
        int[] actualMonths = service.getMaxMonth(sales);
        boolean resultEquals = service1.arrMonths(expectedMonths, actualMonths);

    }

    @Test
    public void shouldFindMonthsBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.calculateBellowAverage(sales);
    }

    @Test
    public void shouldFindMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.calculateAboveAverage(sales);
    }
}

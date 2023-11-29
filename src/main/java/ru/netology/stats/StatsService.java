package ru.netology.stats;
import java.util.Arrays;
public class StatsService {
    public long getMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }

        }


        return minMonth + 1;
    }

    public long calculateTotalAmount(long[] sales) {
        long totalAmount = 0;

        for (long i : sales) {
            totalAmount += i;
        }
        return totalAmount;
    }

    public double calculateAverageAmount(long[] sales) {
        long totalAmount = 0;

        for (long i : sales) {
            totalAmount += i;

        }
        double average = totalAmount / sales.length;
        return average;

    }

    public int[] getMaxMonth(int[] sales) {
        int maxSales = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = (int) sales[i];
            }

        }

        int count = 0;
        for (int sale : sales) {
            if (sale == maxSales) {
                count++;
            }
        }

        int maxSalesMonths[] = new int[count];
        int index = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] == maxSales) {
                maxSalesMonths[index++] = i + 1;}


        }

        return maxSalesMonths;

    }
}



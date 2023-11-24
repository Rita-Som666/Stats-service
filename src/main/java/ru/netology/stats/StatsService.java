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
}
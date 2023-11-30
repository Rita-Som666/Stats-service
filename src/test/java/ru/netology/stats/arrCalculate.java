package ru.netology.stats;

import java.util.Arrays;

public class arrCalculate {


    public boolean arrMonths(int[] expected, int[] actual) {

        if (expected == null || actual == null) {
            return false;
        }


        return Arrays.equals(expected, actual);
    }
}


package ru.netology.services;

public class StatsService {
    public long summaryOfSales(long[] sales) {
        long sumOfSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumOfSales += sales[i];
        }
        return sumOfSales;
    }
    public long averageOfSales(long[] sales) {
        return summaryOfSales(sales) / sales.length;
    }
    public int calcMonthMaxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
    public int calcMonthMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }
    public long calcLowerOfAverage(long[] sales) {
        int counter = 0;
        long average = averageOfSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                counter++;
            }
        }
        return counter;
    }
    public long calcHigherOfAverage(long[] sales) {
        long counter = 0;
        long average = averageOfSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                counter++;
            }
        }
        return counter;
    }
}
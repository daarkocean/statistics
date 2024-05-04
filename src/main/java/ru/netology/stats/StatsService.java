package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long avgSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long avgSales = totalSale / 12;
        return avgSales;
    }

    public int calcMonthMaxSales(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int calcMonthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int calcMonthBelowAvg(long[] sales) {
        int count = 0;
        long avg = avgSales(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int calcMonthAboveAvg(long[] sales) {
        int count = 0;
        long avg = avgSales(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}

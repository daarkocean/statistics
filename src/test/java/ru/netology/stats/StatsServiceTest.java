package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSumSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.sumSales(sales);
        long expected = 8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAvgSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.avgSales(sales);
        long expected = (8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18)/12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calcMonthMaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calcMonthMinSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthBelowAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calcMonthBelowAvg(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthAboveAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calcMonthAboveAvg(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}
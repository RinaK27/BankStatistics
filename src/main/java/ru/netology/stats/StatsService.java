package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {  // сумма всех продаж
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {  // средняя сумма продаж
        return sum(sales) / 12;
    }

    public int countBelowAvg(long[] sales) {  // кол-во месяцев с продажей ниже среднего
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int countAboveAvg(long[] sales) { // кол-во месяцев с продажей выше среднего
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

    public int minSales(long[] sales) { // номер месяца с минимумом продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) { // номер месяца с максимумом продаж
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
}

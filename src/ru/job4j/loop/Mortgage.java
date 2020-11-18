package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double resultCredit = amount;
        while (resultCredit > 0) {
            year++;
            resultCredit = (resultCredit + resultCredit  * percent / 100) - salary;
        }
        return year;
    }
}

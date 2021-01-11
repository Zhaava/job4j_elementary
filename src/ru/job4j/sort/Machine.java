package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        while (balance > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (balance >= coins[i]) {
                    rsl[size] = coins[i];
                    balance -= coins[i];
                    break;
                }
            }
        size++;
        }
        return Arrays.copyOf(rsl, size);
    }
}

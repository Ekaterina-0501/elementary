package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int i = 0;
        int size = 0;
        money -= price;
        while (money > 0) {
            if (money - coins[i] < 0) {
                i++;
            } else {
                rsl[size] = coins[i];
                money -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

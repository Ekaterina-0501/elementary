package ru.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = left[right.length - 1] == right[right.length - 1];
        return result;
    }
}
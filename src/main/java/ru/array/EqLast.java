package ru.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        if (left[right.length - 1] == right[right.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
}

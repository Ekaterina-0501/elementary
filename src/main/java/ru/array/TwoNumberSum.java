package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] rsl = {};
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                rsl = new int[]{i, j};
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return rsl;
    }
}

package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] rsl = {};
        while (i < array.length / 2) {
            if (array[i] + array[j] == target) {
                rsl = new int[]{i, j};
                break;
            } else {
                i++;
            }
            if (array[i] + array[j] == target) {
                rsl = new int[]{i, j};
                break;
            }
            j--;
        }
        return rsl;
    }
}

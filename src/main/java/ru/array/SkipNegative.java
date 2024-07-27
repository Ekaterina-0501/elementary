package ru.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cel = 0; cel < array[row].length; cel++) {
                if (array[row][cel] < 0) {
                    array[row][cel] = 0;
                }
            }
        }
        return array;
    }
}

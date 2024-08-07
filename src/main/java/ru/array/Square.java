package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] array = new int[bound];
        for (int i = 0; i < bound; i++) {
            array[i] = (int) Math.pow(i, 2);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

}

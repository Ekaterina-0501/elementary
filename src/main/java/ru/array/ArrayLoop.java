package ru.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

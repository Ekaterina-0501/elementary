package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        return max(left, max(right, middle));
    }

    public static int max(int left, int right, int middle1, int middle2) {
        return max(max(left, right, middle1), middle2);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(0, 2));
    }

}

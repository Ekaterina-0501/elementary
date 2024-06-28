package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
       double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1  = SqArea.square(6, 2);
        System.out.println("for p=6 and k=2 square = " + result1);
    }
}

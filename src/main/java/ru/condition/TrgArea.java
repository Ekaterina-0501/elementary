package ru.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
       double p = (a + b + c) / 2;
       double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
       return s;
    }

    public static void main(String[] args) {
        double area1 = TrgArea.area(3, 4, 5);
        System.out.println("area1 (3, 4, 5) = " + area1);
        double area2 = TrgArea.area(2, 2, 2);
        System.out.println("area2 (2, 2, 2) = " + area2);
    }
}

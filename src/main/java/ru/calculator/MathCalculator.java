package ru.calculator;
import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double allMathOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subAndDivision равен: " + subAndDivision(6, 3));
        System.out.println("Результат расчета allMathOperations равен: " + allMathOperations(2, 1));
    }

}

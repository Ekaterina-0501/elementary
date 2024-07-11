package ru.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }

    public static boolean isPositive(int num) {
        return num > 0 ? true : false;
    }

    public static boolean notEven(int num) {
        return !(num % 2 == 0) ? true : false;
    }

    public static boolean notPositive(int num) {
        return !(num > 0) ? true : false;
    }

    public static boolean notEvenAndPositive(int num) {
        return !(num % 2 == 0) && num > 0 ? true : false;
    }

    public static boolean evenOrNotPositive(int num) {
        return num % 2 == 0 || !(num > 0) ? true : false;
    }

    public static void main(String[] args) {

        System.out.println(LogicNot.isEven(2));
        System.out.println(LogicNot.isPositive(2));
        System.out.println(LogicNot.notEven(-1));
        System.out.println(LogicNot.notPositive(-1));
        System.out.println(LogicNot.notEvenAndPositive(2));
        System.out.println(LogicNot.evenOrNotPositive(2));
    }
}



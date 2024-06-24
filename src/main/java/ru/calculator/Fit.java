package ru.calculator;

public class Fit {
    public static double manWeight(short height){
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(short height){
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 175;
        double woman = womanWeight(height);
        System.out.println("Woman " + height + " is " + woman);
        double man = manWeight((short)187);
        System.out.println("Man 187 is " + man);
    }

}

package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float inDollar = 180;
        float expectedDollar = 2f;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passed = expectedDollar == outDollar;
        System.out.println("180 rubles are 2 dollar. Test result : " + passed);
        float inEuro = 140;
        float expectedEuro = 1.4f;
        float outEuro = Converter.rubleToEuro(inEuro);
        passed = expectedEuro == outEuro;
        System.out.println("140 rubles are 1.4 euro. Test result : " + passed);
    }
}

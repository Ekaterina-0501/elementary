package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
            if (number == 0) {
            System.out.println(number + "  Could not div by 0.");
        }
            if (number < 0) {
            System.out.println(number + "  This is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-5);
    }
}

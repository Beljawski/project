package org.example.java_2024_02_21;

public class task_3_switch {
    public static void main(String[] args) {
        double number1 = 15;
        double number2 = 0;
        char operation = '/';

        switch (operation) {
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Error");
                } else {
                    System.out.println(number1 / number2);
                }
                break;
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':

                System.out.println(number1 - number2);
                break;
                default:
                    System.out.println("Error");

        }
    }
}

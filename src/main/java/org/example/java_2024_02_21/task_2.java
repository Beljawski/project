package org.example.java_2024_02_21;

public class task_2 {
    //Даны три переменные, вещественные (geteilt) числа number1, number2, и символьный operation, который может содержать следующие символы (+ - * /). Написать программу "Калькулятор" которая будет выводить на консоль результат соответствующих вычислений.
    public static void main(String[] args) {

        double number1 = 15;
        double number2 = 0;
        char operation = '/';

        if (operation == '*') {
            System.out.println(number1*number2);

        } else if (operation == '/') {
            if (number2 == 0) {
                System.out.println("Error");
            } else {
                System.out.println(number1 / number2);
            }

        } else if (operation == '-') {
            System.out.println(number1-number2);

        } else if (operation == '+') {
            System.out.println(number1+number2);
        }
    }
}

package org.example.java_2024_02_21;

public class Task_1 {
    // Создать программу которая принимает на вход 3 вещественных числа, и будет выводить на экран ТО число,
    // чей остаток от деления на 1.5 -  меньше остальных. Для наглядности выводить и сам остаток.
    public static void main(String[] args) {

        double a = 3.5;
        double b = 3.7;
        double c = 1.4;

        double remainderA = a % 1.5;
        double remainderB = b % 1.5;
        double remainderC = c % 1.5;

        if (remainderA < remainderB && remainderA < remainderC) {
            System.out.println(a);
        } else if (remainderB < remainderA && remainderB < remainderC) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

}




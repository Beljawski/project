package org.example._2024_02_26;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(getNumbers(num));
    }

    //    Дано трёхзначное число, вывести все цифры этого числа в виде строки.
//    Пример: 345 – вывод: Число 345 -> 3, 4, 5.
    public static String getNumbers(int num) {
        int num1 = num / 100;
        int num2 = (num - (num1 * 100)) / 10;
        int num3 = num % 10;
        String result = "Zahl " + num + "->" + num1 + "," + num2 + "," + num3 + ".";
        return result;
    }
}



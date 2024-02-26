package org.example.java_2024_02_21;

public class task_4 {
    public static void main (String[] args){
        printEventNumbers();
//        В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
        int count = 0;
        for (int i = 0; i <= 100;i++) {
            if (count == 26 ){
                break;
            }
            if (i % 2 == 0 && i % 10 != 0 ){
                count++;
                System.out.println(i);
            }
        }
    }
    public static void printEventNumbers() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (count == 26) {
                break;
            }
            if (i % 2 == 0 && i % 10 != 0) {
                count++;
                System.out.println(i);
            }
        }
    }
}





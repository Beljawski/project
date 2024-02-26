package org.example.java_2024_02_20;

public class HelloWorld {
    public static void main(String[] args) {
        int countDown = 10;
        while (countDown >= 0) {
            System.out.println(countDown);
            countDown = countDown - 1;


        }
        System.out.println("los");
        System.out.println("------------------");
        int count = 0;
        while (true) {
            System.out.println(count);
            if (count == 3) {
                break;
            }
            count++;

        }
        System.out.println("------------------");
        int count1 = 0;
        do {
            System.out.println(count1);
            count++;
        } while (count1<=5);
    }
}

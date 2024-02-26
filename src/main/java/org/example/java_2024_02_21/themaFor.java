package org.example.java_2024_02_21;

public class themaFor {
    public static void main(String[] args) {
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }
//        //Вывести на экран в одну строку все нечётные числа от 0 до 100.
//
//        for (int i = 1; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//
//        int i = 1;
//        while (i < 100)
//        {
//            System.out.print(i + " "); //Um zwischen den Zahlen eine Leertaste einzufügen
//            i += 2;
//        }

        //Дано 5 чисел:  а=10,  b=15, c= 20, d=25, e=30.
//Переприсвоить и вывести их на экран в том же порядке(a,b,c,d,e), НО, таким образом, чтобы каждая переменная принимала “следующее” значение из этой цепочки.
//Пример: было а=10 стало а=15;  было е=30 стало е=10.
//Примечание: присваивать “напрямую” значения нельзя, все манипуляции должны происходить за счёт переменных, а не их значений.
//        for (int i = 10; i <= 30; i += 5) {
//            System.out.println(i + ",");
//        }

        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;
        int e = 30;
        int temp = a;
        a = b;
        b = c;
        c = d;
        d = e;
        e = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

}



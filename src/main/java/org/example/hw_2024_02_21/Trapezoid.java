package org.example.hw_2024_02_21;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one of the parallel sides (base sides) of the trapezoid: ");
        double lengthPar1 = scanner.nextDouble();

        System.out.println("Enter the second parallel side (base side) of the trapezoid: ");
        double lengthPar2 = scanner.nextDouble();

        System.out.println("Enter one of the non-parallel sides (leg sides) of the trapezoid: ");
        double lengthNonPar1 = scanner.nextDouble();

        System.out.println("Enter the second non-parallel side (leg side) of the trapezoid: ");
        double lengthNonPar2 = scanner.nextDouble();

        double perimeter = calcTrapezPerimeter(lengthPar1, lengthPar2, lengthNonPar1, lengthNonPar2);
        System.out.println("The perimeter of the trapezoid is: " + perimeter);
    }

    public static double calcTrapezPerimeter(double lengthPar1, double lengthPar2, double lengthNonPar1, double lengthNonPar2) {
        double perimeter = lengthPar1 + lengthPar2 + lengthNonPar1 + lengthNonPar2;
        return perimeter;

    }
}


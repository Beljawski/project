package org.example.hw_2024_02_21;

import java.util.Scanner;

public class Sphere {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of sphere: ");
        double radius = scanner.nextDouble();

        double surfaceArea = calculateSphereSurfaceArea(radius);// Hier wird die Methode calculateSphereSurfaceArea aufgerufen und das Ergebnis (die Oberfläche der Kugel) der Variable surfaceArea zugewiesen. Der Radius der Kugel, den der Benutzer zuvor eingegeben hat, wird als Argument an diese Methode übergeben.
        System.out.println("Area of sphere is: "+ surfaceArea);
    }
    public static double calculateSphereSurfaceArea (double radius){
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }
}

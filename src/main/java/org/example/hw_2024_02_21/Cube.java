package org.example.hw_2024_02_21;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Länge einer Würfelseite ein:");
        double length = scanner.nextDouble();
        double volume = calculateCubeVolumen(length);
        System.out.println("Das Volumen des Würfels beträgt: " + volume);
    }
    public static double calculateCubeVolumen(double length){
        double volume = Math.pow(length, 3);
        return volume;
    }
}

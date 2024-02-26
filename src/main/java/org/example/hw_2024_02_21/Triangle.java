package org.example.hw_2024_02_21;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner-Objekt erstellen, um Benutzereingaben zu lesen

        System.out.println("Geben Sie die Längen der drei Seiten des Dreiecks ein:");  // Benutzer auffordern, die Längen der drei Seiten des Dreiecks einzugeben
        System.out.println("Seite a:");
        double a = scanner.nextDouble(); //Hier wird die tatsächliche Eingabe von Seitenlänge "a" erfasst. scanner.nextDouble() wartet auf die Eingabe des Benutzers und liest die nächste Gleitkommazahl von der Konsole.
        System.out.println("Seite b:");
        double b = scanner.nextDouble();
        System.out.println("Seite c:");
        double c = scanner.nextDouble();

        double area = calculateTriangleArea(a, b, c); // Fläche des Dreiecks berechnen
        System.out.println("Die Fläche des Dreiecks beträgt: " + area); // Die berechnete Fläche ausgeben
    }

    public static double calculateTriangleArea(double a, double b, double c) { // Methode zur Berechnung der Fläche eines Dreiecks mit Heronscher Formel
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area; // Die berechnete Fläche zurückgeben
    }
}

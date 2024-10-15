package org.jacob;

import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);
    public static double prompt(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.println(prompt);
            try {
                value = scanner.nextDouble();
                if (value >= min && value <= max) {
                    break;
                }
                System.out.println("Enter a value between " + min + " and " + max);
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }
        return value;
    }
}

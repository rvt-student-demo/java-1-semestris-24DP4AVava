package rvt;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        // uzdevums
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        String num1 = scanner.nextLine();

        System.out.println("Give the second number: ");
        String num2 = scanner.nextLine();

        System.out.println("Give the third number: ");
        String num3 = scanner.nextLine();

        double TheAverage = (Double.valueOf(num1) + Double.valueOf(num2) + Double.valueOf(num3)) / 3;
        System.out.println("The average is " + TheAverage);

    }
}

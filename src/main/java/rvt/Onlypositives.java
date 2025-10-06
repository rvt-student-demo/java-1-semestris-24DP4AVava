package rvt;

import java.util.Scanner;

public class Onlypositives {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Ievadi skaitli: ");
        int number = Integer.valueOf(scanner.nextLine());

        if (number == 0) {
            break;
        }

        if (number < 0) {
            System.out.println("Nederigs skaitlis");
            continue;
        }

        System.out.println(number * number);
    }

    }
}

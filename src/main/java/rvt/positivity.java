package rvt;

import java.util.Scanner;

public class positivity {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi skaitli: ");
        String num = scanner.nextLine();

        if (Double.valueOf(num) > 0) {
            System.out.println("Skaitlis ir pozitīvs");
        } else if (Double.valueOf(num) < 0) {
            System.out.println("Skaitlis ir negatīvs");

    }    
    }
}

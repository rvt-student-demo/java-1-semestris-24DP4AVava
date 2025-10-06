package rvt;
import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the start: ");
        int start = scanner.nextInt();
        System.out.println("Enter End: ");
        int end = scanner.nextInt();
        
        while (true) {
            if (start <= end) {
            System.out.println(start);
            start += 1;
            }
        }

    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
    }
}


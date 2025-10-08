package rvt;

import java.util.Scanner;

public class Chapter19 {
public static void main(String[] args) {
    ex2();
}

public static void ex1() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter start: ");
    int start = Integer.valueOf(scanner.nextLine());

    System .out.println("Enter the end: ");
    int end = Integer.valueOf(scanner.nextLine());

    System.out.println("Start:");
    System.out.println(start);
    while (true){
        if (end > start) {
            start += 1;
            System.out.println(start);
        }
        else if (end < start) {
            start -= 1;
            System.out.println(start);
        }
        else {
            break;
        }
    }
}

public static void ex2(){
    Scanner scanner = new Scanner(System.in);


     System.out.println("Enter N:");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        // считаем сумму через цикл while
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }

        System.out.println("Loop Sum = " + sum);

        // считаем сумму через формулу
        int formulaSum = (n * (n + 1)) / 2;

        System.out.println("Formula Sum = " + formulaSum);
    }






}
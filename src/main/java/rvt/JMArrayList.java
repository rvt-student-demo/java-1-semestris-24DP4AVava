package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    


public static void main(String[] args) {
    onlyTheseNumbers();
}

public static void onlyTheseNumbers() {
    ArrayList<Integer> num = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Ievadi skaitli: ");
        int sk = Integer.valueOf(scanner.nextLine());
        if (sk == -1) {
            break;
    } else {
        num.add(sk);
    }
    }
    System.out.println("From where?: ");
    int start = Integer.valueOf(scanner.nextLine());
    System.out.println("To where?: ");
    int end = Integer.valueOf(scanner.nextLine());

    for (int number : num) {
            if (start <= number && number <= end) {
                System.out.println(number);
            }
        }
    }



public static void listSize() {

}

public static void onTheList() {

}

public static void oremoveLast() {

}
}
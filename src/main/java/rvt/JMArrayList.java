package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    


public static void main(String[] args) {
    removeLast();
}

public static void onlyTheseNumbers() {
    ArrayList<Integer> num = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Enter the name: ");
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
    ArrayList<String> names = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

     while (true) {
        System.out.println("If you enter the name Lu, the cycle will end! Enter the name: ");
        String name = scanner.nextLine();
         if (name.equals("Lu")) {
            break;
        } else{
            names.add(name);
        }
     }
        System.out.println("In total: " + names.size());
}

public static void onTheList() {
    ArrayList<String> names = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("If you leave the window empty, the cycle will end! Enter the name: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            break;
        } else {
            names.add(name);
        }
    }
    System.out.println("Ssearch for? ");
    String search = scanner.nextLine();
    if (names.contains(search)) {
        System.out.println(search + " was found!");
    } else {
        System.out.println(search + " was not found!");
    }
}

public static void removeLast() {
     ArrayList<String> strings = new ArrayList<>();

    strings.add("First");
    strings.add("Second");
    strings.add("Third");

    System.out.println(strings);

   if (!strings.isEmpty()) { 
    strings.remove(strings.size() - 1);
}

    System.out.println(strings);

}
}
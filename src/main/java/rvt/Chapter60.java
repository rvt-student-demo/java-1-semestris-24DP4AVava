package rvt;

public class Chapter60 {
    public static void main(String[] args) {
        ex1();
    }  

    public static void ex1() {
        int[] val = {0, 1, 2, 3};
        int sum = 0;
        for (int i = 0; i < val.length; i = i+1) {
            sum += i;
        }
        System.out.println("Sum for all your numbers = " + sum);

    }
}

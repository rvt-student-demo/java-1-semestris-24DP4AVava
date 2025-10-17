package rvt;

public class Chapter60 {
    public static void main(String[] args) {
        ex2();
    }  

    public static void ex1() {
        int[] val = {0, 1, 2, 3};
        int sum = 0;
        for (int i = 0; i < val.length; i = i+1) {
            sum += i;
        }
        System.out.println("Sum for all your numbers = " + sum);

    }

    public static void ex2() {
        int[] val = {13, -4, 82, 7};
        int[] twice = val;

        System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        for (int i = 0; i < val.length; i += 1 ) {
            twice[i] *= 2;
        }
        System.out.println( "Double Array"  + " " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);

    }

    public static void ex3() {
    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {-12,  24, -79, -13};
    int[] sum    = {  0,   0,   0,   0};

    for (int i = 0; i < valA.leght; )
    System.out.println( "sum: " 
        + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    
    }
}

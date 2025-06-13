package Beginners;

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        A=scanner.nextInt();
        B=scanner.nextInt();
        System.out.println("PROD = "+(A * B));
    }
}

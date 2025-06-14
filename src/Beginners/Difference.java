package Beginners;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        A=scanner.nextInt();
        B= scanner.nextInt();
        C= scanner.nextInt();
        D= scanner.nextInt();
        int difference = (A * B -C * D);
        System.out.println("DIFERENCA = "+difference);
    }
}

package Beginners;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius;
        double pi = 3.14159;
        radius= scan.nextDouble();

        double esphere = (4.0/3) * pi * (radius * radius * radius);
        System.out.printf("VOLUME = %.3f%n",esphere);

    }
}

package Beginners;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A;
        double B;
        double C;
        A= scan.nextDouble();
        B= scan.nextDouble();
        C= scan.nextDouble();

        double areaCircle = (C * C) * 3.14159 ;
        double areaSquare = B * B;
        double triangleRetangle = (A * C) / 2;
        double trapeze =(A + B)* C/2;
        double retangle = A * B;
        System.out.printf("TRIANGULO: %.3f%n",triangleRetangle);
        System.out.printf("CIRCULO: %.3f%n",areaCircle);
        System.out.printf("TRAPEZIO: %.3f%n",trapeze);
        System.out.printf("QUADRADO: %.3f%n",areaSquare);
        System.out.printf("RETANGULO: %.3f%n",retangle);

    }
}

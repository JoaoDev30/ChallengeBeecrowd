package Beginners;

import java.util.Scanner;

public class CalcSimple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code1;
        int numberPart1;
        double price1;
        code1= scan.nextInt();
        numberPart1= scan.nextInt();
        price1= scan.nextDouble();

        int code2;
        int numberPart2;
        double price2;
        code2= scan.nextInt();
        numberPart2= scan.nextInt();
        price2= scan.nextDouble();


        double priceTotal = (numberPart1 * price1) + (numberPart2 * price2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",priceTotal);

    }
}

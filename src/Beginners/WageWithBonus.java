package Beginners;
// um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

import java.util.Scanner;

////O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
public class WageWithBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        double wage;
        double totalSales;

        firstName=scanner.next();
        wage= scanner.nextDouble();
        totalSales= scanner.nextDouble();

        double bonus = (0.15 *totalSales);
        double total = bonus + wage;
        System.out.printf("TOTAL = %.2f%n",total);


    }
}

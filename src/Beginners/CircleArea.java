package Beginners;
import java.util.Scanner;
// - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
// Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 3.144159;
        double raio;
        raio=scanner.nextDouble();



        double area = n * (raio * raio);
        System.out.printf("A=%.4f%n", area);

    }
}

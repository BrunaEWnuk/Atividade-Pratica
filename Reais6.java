import java.util.Scanner;

/*Desenvolva um programa que calcule o número mínimo de notas necessárias para
representar um determinado valor em reais. O programa deve solicitar ao usuário o
valor a ser calculado e, em seguida, apresentar a quantidade de notas necessárias de
cada tipo (R$100, R$50, R$20, R$10, R$5, R$2 e R$1) para formar esse valor. */

public class Reais6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Abaixo informe o valor em reais para calcular o mínimo de notas necessárias para representá-la");
        System.out.println("Digite o valor em reais: ");
        int valor = scanner.nextInt();
        
        // Calcula o número mínimo de notas de cada tipo necessárias para formar o valor
        int nota_100 = valor / 100;
        valor = valor % 100;
        int nota_50 = valor / 50;
        valor = valor % 50;
        int nota_20 = valor / 20;
        valor = valor % 20;
        int nota_10 = valor / 10;
        valor = valor % 10;
        int nota_5 = valor / 5;
        valor = valor % 5;
        int nota_2 = valor / 2;
        valor = valor % 2;
        int nota_1 = valor;
        
        if (nota_100 > 0) {
            System.out.println("Quantidade de notas de R$100: " + nota_100);
        }
        if (nota_50 > 0) {
            System.out.println("Quantidade de notas de R$50: " + nota_50);
        }
        if (nota_20 > 0) {
            System.out.println("Quantidade de notas de R$20: " + nota_20);
        }
        if (nota_10 > 0) {
            System.out.println("Quantidade de notas de R$10: " + nota_10);
        }
        if (nota_5 > 0) {
            System.out.println("Quantidade de notas de R$5: " + nota_5);
        }
        if (nota_2 > 0) {
            System.out.println("Quantidade de notas de R$2: " + nota_2);
        }
        if (nota_1 > 0) {
            System.out.println("Quantidade de notas de R$1: " + nota_1);
        }

        scanner.close();
    }
   
}

      



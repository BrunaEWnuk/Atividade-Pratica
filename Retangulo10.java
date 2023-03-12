import java.util.Scanner;
/*Escreva um programa que permita ao usuário calcular a área de um retângulo. O
usuário deve inserir a altura e a largura do retângulo. */

public class Retangulo10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a altura do retângulo: ");
        double altura = scanner.nextDouble();

        System.out.println("Insira a largura do retângulo: ");
        double largura = scanner.nextDouble();
        
        // Calculo
        double area = altura * largura;
        
        // resultado
        System.out.println("A área do retângulo é: " + area);
        
        scanner.close();
    }
}

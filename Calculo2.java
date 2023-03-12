import java.util.Scanner;
import java.lang.Math;

public class Calculo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("A expressão aritmética: ");
        System.out.println("1. u = 15/2 - (15 * raiz(3))/2");
        System.out.println("2. z = raiz(1² + √(3²))");
        System.out.println("3. e = 2*raiz(5) +raiz(40) + 2*raiz(8)+8/-3");
        
        System.out.println("Digite a opção da expressão aritmética para realizar o calculo :");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            double a = 15;
            double b = 2;
            double u = a/b - (a*Math.sqrt(3))/2;
            System.out.println("Resultado: " + u);

        } else if (opcao == 2) {
            double z = Math.sqrt(1 + Math.sqrt(9));
            System.out.println("Resultado: " + z);

        } else if (opcao == 3) {
            double x = 2*Math.sqrt(5) + Math.sqrt(40) + 2*Math.sqrt(8) + 8/-3;
            System.out.println("Resultado: " + x);

        } else {
            System.out.println("Opção inválida!");
        }
    scanner.close();
    }
}

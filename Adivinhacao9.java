import java.util.Scanner;
import java.util.Random; //Para utilizar a classe Ramdom do java.util, para poder gerar nº aleatórios.

/* Crie uma aplicação java para fazer adivinhação, peço ao java para gerar um
número aleatório
Random random = new Random();// criar um objeto da classe Random
int number = random.nextInt(4);// gerar um número aleatório de 0 a 3
Peça ao usuário para adivinhar o valor, se o usuário acertar, imprima “Você acertou”,
caso contrário, imprima “Não foi dessa vez”. */

public class Adivinhacao9 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int numero = random.nextInt(4);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adivinhe um número entre 0 e 3:");
        int adivinhacao = scanner.nextInt();
        
        if (adivinhacao == numero) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Não foi dessa vez! O número era " + numero + ".");
        }
        
        scanner.close();
    }
    
}

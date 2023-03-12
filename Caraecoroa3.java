import java.util.Scanner;
/* Crie uma aplicação java que faça a simulação de um jogo cara ou coroa entre um
jogador contra outro jogador. Primeiramente faça a leitura dos nomes dos dois
jogadores, na sequência, simulando o jogo, faça a leitura de uma jogada (uma de cada
jogador), armazene o conteúdo das jogadas em variáveis do tipo String e ao final, faça
a impressão do nome do jogador vencedor. */
public class Caraecoroa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jogador 1: escolha cara (C) ou coroa (R)");
        String jogador1 = scanner.nextLine().toUpperCase();  
        /*O 'toUpperCase()' utilizado para converter letras maiúsculas. */
        
        if (!jogador1.equals("C") && !jogador1.equals("R")) {
            System.out.println("Jogada inválida!");
            scanner.close();
            return;
        }
        
        System.out.println("Jogador 2: escolha cara (C) ou coroa (R)");
        String jogador2 = scanner.nextLine().toUpperCase();
        
        if (!jogador2.equals("C") && !jogador2.equals("R")) {
            System.out.println("Jogada inválida!");
            scanner.close();
            return;
        }
        
        // Jogadas
        String vencedor = "";
        if (jogador1.equals(jogador2)) {
            vencedor = "Empate";
        } else if (jogador1.equals("C") && jogador2.equals("R")) {
            vencedor = jogador1;
            
        } else if (jogador1.equals("R") && jogador2.equals("C")) {
            vencedor = jogador2;
        }
        
        System.out.println("O vencedor é: " + vencedor);
        scanner.close();
    }
}
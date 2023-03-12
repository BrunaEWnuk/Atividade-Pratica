import java.util.Scanner;
/*Crie uma aplicação java que faça a simulação de um jogo de pedra, papel, tesoura
entre um jogador contra outro jogador. Primeiramente faça a leitura dos nomes dos
dois jogadores, na sequência, simulando o jogo, faça a leitura de uma jogada (uma de
cada jogador), armazenando o conteúdo das jogadas em variáveis do tipo “int” e ao
final, utilizando apenas conhecimentos de “if” e “else” estudados até o momento, faça a
impressão do nome do jogador vencedor. */

public class PedraPapelTesoura4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do jogador 1: ");
        String jogador1 = scanner.nextLine();
        
        System.out.println("Digite o nome do jogador 2: ");
        String jogador2 = scanner.nextLine();
        
        // Jogadas
        System.out.println("Escolha sua jogada (1 - Pedra, 2 - Papel, 3 - Tesoura)");
        System.out.print(jogador1   + ": ");
        int jogada_Jogador1 = scanner.nextInt();
        
        System.out.println("Escolha sua jogada (1 - Pedra, 2 - Papel, 3 - Tesoura)");
        System.out.print(jogador2 + ": ");
        int jogada_Jogador2 = scanner.nextInt();
        
        // Vencedor
        String vencedor = "";
        if (jogada_Jogador1 == jogada_Jogador2) {
            vencedor = "Empate! Não há vencedor.";
        } else if ((jogada_Jogador1 == 1 && jogada_Jogador2 == 3) ||
                   (jogada_Jogador1 == 2 && jogada_Jogador2 == 1) ||
                   (jogada_Jogador1 == 3 && jogada_Jogador2 == 2)) {
            vencedor = jogador1;
        } else {
            vencedor = jogador2;
        }
        
        // Vencedor
        System.out.println("O vencedor é: " + vencedor);
        
        scanner.close();
    }
}
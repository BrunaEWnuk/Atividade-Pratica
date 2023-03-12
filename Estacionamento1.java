import java.util.Scanner;

public class Estacionamento1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vagas_utilizadas = 0;
        int[] vagas_ocupadas = new int[5]; // array para armazenar as vagas já ocupadas

        System.out.println("A quantidade de vagas atual é:");
        System.out.println("VAGAS OCUPADAS: " + vagas_utilizadas);
        System.out.println("VAGAS DISPONÍVEIS: " + (5 - vagas_utilizadas));

        while (vagas_utilizadas < 5) {
            System.out.print("Digite o número da vaga desejada (1-5): ");
            int numVaga = scanner.nextInt();

            if (numVaga >= 1 && numVaga <= 5) {
                // Verifica se a vaga já está ocupada
                boolean vagaOcupada = false;
                for (int i = 0; i < vagas_ocupadas.length; i++) {
                    if (vagas_ocupadas[i] == numVaga) {
                        vagaOcupada = true;
                        break;
                    }
                }

                if (vagaOcupada) {
                    System.out.println("Vaga ocupada!");
                } else {
                    System.out.println("Estacionado com Sucesso!");
                    vagas_utilizadas++;
                    vagas_ocupadas[vagas_utilizadas - 1] = numVaga; // adiciona a vaga ao array de vagas ocupadas0
                    System.out.println("VAGAS OCUPADAS: " + vagas_utilizadas);
                    System.out.println("VAGAS DISPONÍVEIS: " + (5 - vagas_utilizadas));
                }
            } else {
                System.out.println("Vaga inválida!");
            }
        }

        System.out.println("Vagas utilizadas: " + vagas_utilizadas);
        System.out.println("Vagas disponíveis: " + (5 - vagas_utilizadas));
        scanner.close();
    }
}

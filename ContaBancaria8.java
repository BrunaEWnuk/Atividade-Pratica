import java.util.Scanner;
/*Desenvolva um programa que simule uma conta bancária, primeiramente o usuário
deve informar o saldo inicial, e sequência uma operação de retirada, onde o usuário
informa o valor, caso o valor da saída seja menor ou igual ao saldo, permita fazer a
operação, caso contrário, imprima a mensagem “Saldo Insuficiente”, no final faça a
impressão do saldo atualizado.
 */
public class ContaBancaria8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o saldo inicial: R$ ");
        double saldo = scanner.nextDouble();

        System.out.println("Informe o valor a ser retirado: R$ ");
        double retirada = scanner.nextDouble();
        
        // verifica se o saldo é suficiente
        if (retirada <= saldo) {
            saldo -= retirada;
            System.out.println("Retirada realizada com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f", saldo);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
        
        scanner.close();
    }
}

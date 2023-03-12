import java.util.Scanner;
/* Utilizando a tabela de imposto de renda abaixo, crie uma aplicação java que recebe
o valor do salário bruto familiar e também a quantidade de indivíduos, na sequência, o
sistema deverá calcular o valor do imposto de renda devido respeitando a faixa de
renda média familiar.
 */
public class imposto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o salário bruto familiar:");
    double salarioB_Familiar = scanner.nextDouble();

    System.out.println("Informe a quantidade de indivíduos:");
    int quantidade_individuos = scanner.nextInt();

    double r_MediaFamiliar = salarioB_Familiar / quantidade_individuos;
    double impostoDevido = 0.0;

    if (r_MediaFamiliar <= 1903.98) {
        impostoDevido = 0.0;
    } else if (r_MediaFamiliar <= 2826.65) {
        impostoDevido = (r_MediaFamiliar * 0.075) - 142.80;
    } else if (r_MediaFamiliar <= 3751.05) {
        impostoDevido = (r_MediaFamiliar * 0.15) - 354.80;
    } else if (r_MediaFamiliar <= 4664.68) {
        impostoDevido = (r_MediaFamiliar * 0.225) - 636.13;
    } else {
        impostoDevido = (r_MediaFamiliar * 0.275) - 869.36;
    }

    System.out.println("O valor do imposto  é de R$" + impostoDevido);

    scanner.close();
}
}
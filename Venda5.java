/* Crie uma aplicação java para calcular o valor do lucro de uma operação de venda,
onde a taxa de impostos é uma constante de 20%. Para pagamento à vista o desconto
é de 10% e a prazo é 5%, além disso, o valor da comissão do vendedor é 10%. Partindo
do conceito que o custo do produto é 50% do valor de venda, na aplicação java faça a
leitura de apenas o valor de venda do produto, e por fim, faça a impressão de todos os
valores da operação: Valor de venda, custo do produto, valor dos impostos, valor da
comissão e por fim o valor do lucro. Na impressão utilize uma formatação dos valores
para exibição com duas decimais e utilize os prefixos R$.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Venda5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00"); /* foi utilizado para formatar a mostragem dos 
                                                                    valores da operação com duas casas decimais */

        double v_venda, c_produto, v_impostos, v_comissao, v_lucro;

        System.out.print("Digite o valor de venda do produto: R$ ");
        v_venda = scanner.nextDouble();

        c_produto = v_venda / 2;
        v_impostos = v_venda * 0.2;

        double v_desconto = v_venda * 0.1;

        if (v_desconto > 0) {
            v_comissao = (v_venda - v_desconto) * 0.1;
            v_lucro = (v_venda - c_produto - v_impostos - v_comissao - v_desconto);
            System.out.println("Valor de venda: R$ " + df.format(v_venda));
            System.out.println("Custo do produto: R$ " + df.format(c_produto));
            System.out.println("Valor dos impostos: R$ " + df.format(v_impostos));
            System.out.println("Valor da comissão: R$ " + df.format(v_comissao));
            System.out.println("Valor do desconto: R$ " + df.format(v_desconto));
            System.out.println("Valor do lucro: R$ " + df.format(v_lucro));
        } else {
            v_comissao = v_venda * 0.05;
            v_lucro = (v_venda - c_produto - v_impostos - v_comissao);
            System.out.println("Valor de venda: R$ " + df.format(v_venda));
            System.out.println("Custo do produto: R$ " + df.format(c_produto));
            System.out.println("Valor dos impostos: R$ " + df.format(v_impostos));
            System.out.println("Valor de comissão: R$ " + df.format(v_comissao));
            System.out.println("Valor de desconto: R$ 0,00");
            System.out.println("Valor de lucro: R$ " + df.format(v_lucro));
        }
        scanner.close();
    }
    

}

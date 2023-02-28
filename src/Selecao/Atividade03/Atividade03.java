package Selecao.Atividade03;

import javax.swing.JOptionPane;

/*
 * 3.	Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips. 
 * Faça um programa que calcule o valor total a ser pago por uma pessoa. 
 * O programa deverá ler o valor total da compra efetuada e um código que identifique se o 
 * comprador é um cliente comum (1), funcionário (2) ou vip (3).
 */

public class Atividade03 {

    public static void main(String[] args) {

        double valorTotal, valorFinal;
        int codigo;

        valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da compra: "));
        codigo = Integer.parseInt(JOptionPane
                .showInputDialog("Digite o código do cliente: \n1 - Cliente comum\n2 - Funcionário\n3 - Cliente VIP"));

        switch (codigo) {
            case 1:
                valorFinal = valorTotal;
                break;
            case 2:
                valorFinal = valorTotal - (valorTotal * 0.10);
                break;
            case 3:
                valorFinal = valorTotal - (valorTotal * 0.05);
                break;
            default:
                valorFinal = valorTotal;
                break;
        }

        JOptionPane.showMessageDialog(null, "O valor final da compra é: R$ " + valorFinal);
    }

}

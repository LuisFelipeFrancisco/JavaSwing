package Selecao.Atividade02;

import javax.swing.JOptionPane;

/*
 * 2.	As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 
 * se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, 
 * calcule e escreva o custo total da compra. 
 */

public class Atividade02 {

    public static void main(String[] args) {

        int quantidadeMacas;
        double precoMacas;

        quantidadeMacas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de maçãs: "));

        if (quantidadeMacas < 12) {
            precoMacas = quantidadeMacas * 1.30;
        } else {
            precoMacas = quantidadeMacas * 1.00;
        }

        JOptionPane.showMessageDialog(null, "O preço total das maçãs é: R$: " + precoMacas);
    }

}

package Selecao.Atividade06;

import javax.swing.JOptionPane;

/*
 * 6.	Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * a.	Álcool: ate 20 litros, desconto de 3% por litro, acima de 20 litros desconto de 5% por litro.
 * b.	Gasolina: ate 20 litros, desconto de 4% por litro, acima de 20 litros desconto de 6% por litro.
 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível 
 * (codificado da seguinte forma: 1-álcool, 2-gasolina), calcule e imprima o valor a ser pago pelo cliente 
 * sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
*/

public class Atividade06 {

    public static void main(String[] args) {

        int tipoCombustivel = Integer
                .parseInt(JOptionPane.showInputDialog("Digite o tipo de combustível: \n1 - Álcool \n2 - Gasolina"));
        double litros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros: "));
        double valorTotal = 0;

        switch (tipoCombustivel) {
            case 1:
                if (litros <= 20) {
                    valorTotal = (litros * 2.90) - (litros * 2.90 * 0.03);
                } else {
                    valorTotal = (litros * 2.90) - (litros * 2.90 * 0.05);
                }
                break;
            case 2:
                if (litros <= 20) {
                    valorTotal = (litros * 3.30) - (litros * 3.30 * 0.04);
                } else {
                    valorTotal = (litros * 3.30) - (litros * 3.30 * 0.06);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de combustível inválido!");
                break;
        }

        JOptionPane.showMessageDialog(null, "Valor total a ser pago: R$ " + valorTotal);
    }

}
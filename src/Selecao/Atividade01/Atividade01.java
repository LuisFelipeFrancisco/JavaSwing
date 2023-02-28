package Selecao.Atividade01;

import javax.swing.JOptionPane;

/*1.	Faça um algoritmo para ler dois números inteiros e informar se estes são iguais ou diferentes. */

public class Atividade01 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são diferentes");
        }
    }

}

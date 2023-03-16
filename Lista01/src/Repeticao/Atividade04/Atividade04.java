package Repeticao.Atividade04;

import javax.swing.JOptionPane;

/*
 * 4.	Faça um algoritmo para ler o código e o preço de 15 produtos, calcular e escrever (não deve ser usado vetor):
 * - o maior preço lido
 * - a média aritmética dos preços dos produtos
 */

public class Atividade04 {

    public static void main(String[] args) {

        int maiorPreco = 0;
        int soma = 0;

        for (int i = 1; i <= 15; i++) {
            int preco = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço do produto " + i + ": "));

            if (preco > maiorPreco) {
                maiorPreco = preco;
            }

            soma += preco;
        }

        JOptionPane.showMessageDialog(null, "O maior preço lido foi: " + maiorPreco);
        JOptionPane.showMessageDialog(null, "A média aritmética dos preços dos produtos é: " + (soma / 15));
    }

}
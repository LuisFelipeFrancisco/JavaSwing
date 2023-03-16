package Repeticao.Atividade03;

import javax.swing.JOptionPane;

/* 
 * 3.	Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos 
 * (incluindo os valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro 
 * valor lido.  
 */

public class Atividade03 {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        int soma = 0;

        for (int i = num1; i <= num2; i++) {
            soma += i;
        }

        JOptionPane.showMessageDialog(null, "A soma dos números inteiros entre " + num1 + " e " + num2 + " é: " + soma);
    }

}
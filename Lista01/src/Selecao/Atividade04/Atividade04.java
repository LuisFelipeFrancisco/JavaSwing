package Selecao.Atividade04;

import javax.swing.JOptionPane;

/*
 * 4.	Ler as notas da 1a. e 2a. avaliações de um aluno. 
 * Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
 * (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. 
 */

public class Atividade04 {

    public static void main(String[] args) {

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 1a. avaliação: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 2a. avaliação: "));

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado com média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado com média: " + media);
        }
    }

}
package Selecao.Atividade05;

import javax.swing.JOptionPane;

/*  
 * 5.	Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias: 
 * infantil A = 5 - 7 anos 
 * infantil B = 8-10 anos 
 * juvenil A = 11-13 anos 
 * juvenil B = 14-17 anos 
 * adulto = maiores de 18 anos
 */

public class Atividade05 {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador: "));

        if (idade >= 5 && idade <= 7) {
            JOptionPane.showMessageDialog(null, "O nadador é da categoria infantil A");
        } else if (idade >= 8 && idade <= 10) {
            JOptionPane.showMessageDialog(null, "O nadador é da categoria infantil B");
        } else if (idade >= 11 && idade <= 13) {
            JOptionPane.showMessageDialog(null, "O nadador é da categoria juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            JOptionPane.showMessageDialog(null, "O nadador é da categoria juvenil B");
        } else if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "O nadador é da categoria adulto");
        } else {
            JOptionPane.showMessageDialog(null, "O nadador não está em nenhuma categoria");
        }
    }

}

package Repeticao.Atividade06;

import javax.swing.JOptionPane;

/*
 * 6.	Entrar com um número inteiro positivo e exibir o fatorial deste número, lembrando que 0! = 1. 
 * Exemplo: 5! = 5x4x3x2x1 = 120
 */

public class Atividade06 {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));
        int fatorial = 1;
        
        for (int i = num; i > 0; i--) {
            fatorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, num + "! = " + fatorial);
    }
    
}

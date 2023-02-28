package Repeticao.Atividade02;

import javax.swing.JOptionPane;

/* 2.	Fazer um programa para encontrar todos os pares entre 1 e 38.  */

public class Atividade02 {

    public static void main(String[] args) {

        for (int i = 1; i <= 38; i++) {
            if (i % 2 == 0) {
                JOptionPane.showMessageDialog(null, i);
            }
        }

    }

}

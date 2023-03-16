package Repeticao.Atividade05;

import javax.swing.JOptionPane;

/*
 * 5.	Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e cresce 3 centímetros por ano. 
 * Construir um algoritmo que calcule e imprima quantos anos serão necessários para que Juca seja maior que Chico. 
 */

public class Atividade05 {

    public static void main(String[] args) {

        int chico = 150;
        int juca = 110;
        int anos = 0;

        while (juca <= chico) {
            chico += 2;
            juca += 3;
            anos++;
        }

        JOptionPane.showMessageDialog(null, "Serão necessários " + anos + " anos para que Juca seja maior que Chico.");
    }

}
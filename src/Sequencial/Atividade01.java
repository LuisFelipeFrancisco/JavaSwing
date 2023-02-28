package Sequencial;
import javax.swing.JOptionPane;

/*
* 1.	Fazer um algoritmo que leia um número inteiro e escreva o seu antecessor e o seu sucessor.  
 */
public class Atividade01 {

    public static void main(String[] args) {
        int numero, antecessor, sucessor;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + ", Seu antecessor é: " + antecessor + ", Seu sucessor é: " + sucessor);
    }
    
}

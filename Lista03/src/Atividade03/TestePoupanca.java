/* 3.	Criar uma classe Conta que contenha o número da conta (private) e o saldo (private). 
 Criar um método creditar e um método debitar efetuar as transações. 
Criar os métodos getters e setter para obter e informar o número da conta e o saldo. 
Criar uma subclasse Poupanca, derivada da classe Conta, que contenha o juros (private) a ser aplicado. 
Criar um método aplicarJuros que aplica um juros ao saldo da conta e o getter e setter para obter 
e informar os juros. Criar um programa que teste a classe Poupança (main).
*/
package Atividade03;

import javax.swing.JOptionPane;

public class TestePoupanca {
    public static void main(String[] args) {
        Poupanca p = new Poupanca(123, 1000, 0.5);
        JOptionPane.showMessageDialog(null, "Numero da conta: " + p.getNumeroConta() + 
        		"\nSaldo: " + p.getSaldo());
        p.aplicarJuros();
        JOptionPane.showMessageDialog(null, "Juros a ser aplicado: " + p.getJuros() + 
        		"\nSaldo com os juros aplicados: " + p.getSaldo());
    }
}

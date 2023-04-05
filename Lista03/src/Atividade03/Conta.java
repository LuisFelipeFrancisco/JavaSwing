/* 3.	Criar uma classe Conta que contenha o número da conta (private) e o saldo (private). 
 Criar um método creditar e um método debitar efetuar as transações. 
Criar os métodos getters e setter para obter e informar o número da conta e o saldo. 
Criar uma subclasse Poupanca, derivada da classe Conta, que contenha o juros (private) a ser aplicado. 
Criar um método aplicarJuros que aplica um juros ao saldo da conta e o getter e setter para obter 
e informar os juros. Criar um programa que teste a classe Poupança (main).
*/
package Atividade03;

public class Conta {
    
    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void creditar(double valor){
        this.saldo += valor;
    }
    
    public void debitar(double valor){
        this.saldo -= valor;
    }

}

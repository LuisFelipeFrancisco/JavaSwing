/* 3.	Criar uma classe Conta que contenha o número da conta (private) e o saldo (private). 
 Criar um método creditar e um método debitar efetuar as transações. 
Criar os métodos getters e setter para obter e informar o número da conta e o saldo. 
Criar uma subclasse Poupanca, derivada da classe Conta, que contenha o juros (private) a ser aplicado. 
Criar um método aplicarJuros que aplica um juros ao saldo da conta e o getter e setter para obter 
e informar os juros. Criar um programa que teste a classe Poupança (main).
*/
package Atividade03;

public class Poupanca extends Conta {
    
    private double juros;

    public Poupanca(int numeroConta, double saldo, double juros) {
        super(numeroConta, saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    public void aplicarJuros(){
        this.setSaldo(this.getSaldo() * (1 + this.juros));
    }
    
}

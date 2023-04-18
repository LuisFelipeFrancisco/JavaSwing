/*
 * Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) 
 * e modificadores (setters), e ainda o construtor padrão e mais uma opção de construtor conforme 
 * que modifique todos os atributos. Atributos: String nome; String endereço; String telefone; 
 * Considere, como subclasse da classe Pessoa a classe Fornecedor. 
 * Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam 
 * a classe Pessoa, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) 
 * e valorDivida (montante da dívida para com o fornecedor). 
 * Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, 
 * um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. 
 * Depois de implementada a classe Fornecedor, crie uma tela utilizando componentes Swing para que o 
 * usuário possa interagir.
 */

package Atividade05;

public class Fornecedor extends Pessoa{

    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

}

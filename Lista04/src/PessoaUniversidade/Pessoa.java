package PessoaUniversidade;

import javax.swing.JOptionPane;

/*
 * Desenvolva um programa em Java com:
 * a) Uma classe chamada Universidade, que terá como atributos: nome e local. Além disso, deve possuir um método construtor e métodos para encapsulamento dos seus atributos. 
 * b) Uma classe chamada Pessoa, com os atributos: nome e data de nascimento (que pode ser String). 
 * Assim como na outra classe, crie um método construtor e métodos para encapsulamento de seus atributos. 
 * c) Cada pessoa poderá estar associada a uma universidade. 
 * d) A classe pessoa deve possuir um método que informe seus atributos e a universidade em que trabalha.
 * Implementar o main para testar o código.
 */

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String dataNascimento, Universidade universidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public void informarAtributos() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + 
        		"\nData de Nascimento: " + this.dataNascimento + 
        		"\nUniversidade: " + this.universidade.getNome() + 
        		"\nLocal: " + this.universidade.getLocal());
    }

}

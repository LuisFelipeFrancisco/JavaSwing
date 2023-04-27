package PessoaUniversidade;

/*
 * Desenvolva um programa em Java com:
 * a) Uma classe chamada Universidade, que terá como atributos: nome e local. Além disso, deve possuir um método construtor e métodos para encapsulamento dos seus atributos. 
 * b) Uma classe chamada Pessoa, com os atributos: nome e data de nascimento (que pode ser String). 
 * Assim como na outra classe, crie um método construtor e métodos para encapsulamento de seus atributos. 
 * c) Cada pessoa poderá estar associada a uma universidade. 
 * d) A classe pessoa deve possuir um método que informe seus atributos e a universidade em que trabalha.
 * Implementar o main para testar o código.
 */

public class Universidade {

    private String nome;
    private String local;

    public Universidade(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

}

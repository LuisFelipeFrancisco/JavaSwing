/* 4.	Crie uma classe Funcionario com 2 atributos privados e os respectivos métodos getters e setters.  
Em seguida, crie uma segunda classe Professor, 
que deverá herdar de Funcionario, com 1 atributo privado e um construtor padrão.
*/
package Atividade04;

public class Funcionario {
    
    private String nome;
    private String cpf;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}

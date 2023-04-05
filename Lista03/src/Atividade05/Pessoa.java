/* 5.	Escreva uma classe chamada Pessoa com os atributos: nome, sexo e idade. 
 Escreva agora outra classe chamada Amigo, que estende da classe Pessoa, 
  tendo como único atributo dataAniversario (String). 
  Criar Jframe para possibilitar o preenchimento dos dados e um botão para exibir os dados setados no objeto. 
*/
package Atividade05;

public class Pessoa {

    private String nome;
    private String sexo;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}

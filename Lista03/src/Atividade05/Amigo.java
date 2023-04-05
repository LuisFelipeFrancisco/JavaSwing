/* 5.	Escreva uma classe chamada Pessoa com os atributos: nome, sexo e idade. 
 Escreva agora outra classe chamada Amigo, que estende da classe Pessoa, 
  tendo como único atributo dataAniversario (String). 
  Criar Jframe para possibilitar o preenchimento dos dados e um botão para exibir os dados setados no objeto. 
*/
package Atividade05;

public class Amigo extends Pessoa {
    
    private String dataAniversario;

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    
}
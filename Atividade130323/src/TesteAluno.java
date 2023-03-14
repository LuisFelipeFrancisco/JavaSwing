/*
 * Crie uma classe chamada "aluno", com os atributos nome e media.
 * Crie os metodos preencher e exibir para cada atributo.
 * Defina 2 objetos da classe aluno e atribua valores para os atributos.
 * Exiba o aluno com a maior media.
 */

public class TesteAluno {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        
        aluno1.preencher();
        aluno2.preencher();
        
        aluno1.exibir();
        aluno2.exibir();
        
        aluno1.exibirMaiorMedia(aluno2);
    }
}

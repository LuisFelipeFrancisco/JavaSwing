package Atividade01;

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
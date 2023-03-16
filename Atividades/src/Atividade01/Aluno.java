package Atividade01;

import javax.swing.JOptionPane;

/*
 * Crie uma classe chamada "aluno", com os atributos nome e media.
 * Crie os metodos preencher e exibir para cada atributo.
 * Defina 2 objetos da classe aluno e atribua valores para os atributos.
 * Exiba o aluno com a maior media.
 */

public class Aluno {

    private String nome;
    private double media;

    public void preencher() {
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.media = Double.parseDouble(JOptionPane.showInputDialog("Media: "));
    }

    public void exibir() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + " Media: " + this.media);
    }

    public void exibirMaiorMedia(Aluno aluno) {
        if (this.media > aluno.media) {
            JOptionPane.showMessageDialog(null, "Aluno com maior media: " + this.nome);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno com maior media: " + aluno.nome);
        }
    }

}
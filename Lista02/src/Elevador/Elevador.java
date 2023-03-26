package Elevador;

import javax.swing.JOptionPane;

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndares() {
        return totalAndares;
    }

    public void setAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (this.pessoasPresentes < this.capacidade) {
            this.pessoasPresentes++;  
            JOptionPane.showMessageDialog(null, "Uma pessoa entrou no elevador!");
        } else {
            JOptionPane.showMessageDialog(null, "Elevador cheio!");
        }
    }

    public void sai() {
        if (this.pessoasPresentes > 0) {
            this.pessoasPresentes--;
            JOptionPane.showMessageDialog(null, "Uma pessoa saiu do elevador!");
        } else {
            JOptionPane.showMessageDialog(null, "Elevador vazio!");
        }
    }

    public void sobe() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
            JOptionPane.showMessageDialog(null, "Elevador subindo!");
        } else {
            JOptionPane.showMessageDialog(null, "Elevador no último andar!");
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
            JOptionPane.showMessageDialog(null, "Elevador descendo!");
        } else {
            JOptionPane.showMessageDialog(null, "Elevador no térreo!");
        }
    }

    public void status() {
        JOptionPane.showMessageDialog(null, "Andar atual: " + this.andarAtual + 
        		"\nTotal de andares: " + this.totalAndares + 
        		"\nCapacidade: " + this.capacidade + 
        		"\nPessoas presentes: " + this.pessoasPresentes);
    }

}

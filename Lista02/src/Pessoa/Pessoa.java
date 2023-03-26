package Pessoa;

public class Pessoa {

    private String nome;
    private int anoNasc;
    private double altura;
        
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int idade() {
        return 2023 - anoNasc;
    }
    
}

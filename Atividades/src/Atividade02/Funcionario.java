package Atividade02;

public class Funcionario {
    /* Atibutos */
    private String nome; // Encapsulamento, visibilidade privada
    private String registro;
    private String cargo;
    private double salario;
    
    /* Métodos */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

}
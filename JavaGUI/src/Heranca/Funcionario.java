package Heranca;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	
	private double salario;
	private String cargo;
	
	public Funcionario() {
		JOptionPane.showMessageDialog(null, "Contrutor Funcionario");
	}
	
	public Funcionario (String nome) {
		super (nome);
		JOptionPane.showMessageDialog(null, "Contrutor Funcionario com parametros");
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}

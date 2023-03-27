package Construtor;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	
	public Pessoa () {
		JOptionPane.showMessageDialog(null, "Primeiro Contrutor");
	}
	
	public Pessoa (String nome) {
		this.nome = nome;
		JOptionPane.showMessageDialog(null, "Segundo Construtor");
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

}

package Heranca;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	private String telefone;
	
	public Pessoa () {
		JOptionPane.showMessageDialog(null, "Contrutor Pessoa");
	}
	
	public Pessoa (String nome) {
		JOptionPane.showMessageDialog(null, "Contrutor Pessoa chamado pelo super");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

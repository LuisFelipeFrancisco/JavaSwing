package Construtor;

import javax.swing.JOptionPane;

public class TestePessoa {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ();
		
		pessoa.setNome(JOptionPane.showInputDialog("Nome:"));
		
		JOptionPane.showMessageDialog(null, pessoa.getNome());
		
		Pessoa pessoa2 = new Pessoa ("Felipe");
		
		JOptionPane.showMessageDialog(null, pessoa2.getNome());
	}

}

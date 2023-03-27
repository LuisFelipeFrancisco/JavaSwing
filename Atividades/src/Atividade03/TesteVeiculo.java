package Atividade03;

import javax.swing.JOptionPane;

public class TesteVeiculo {
		
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo ("Gol", "Volksvagem", 2022, 100);
		
		JOptionPane.showMessageDialog(null, "Modelo: " + veiculo.getModelo() + 
				"\nMarca: " + veiculo.getMarca() + 
				"\nAno: " + veiculo.getAno() + 
				"\nValor: "+ veiculo.getValor() + 
				"\nValor de venda: " + veiculo.venda());
	}
	
}

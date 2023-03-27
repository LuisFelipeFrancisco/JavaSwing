/*
 *Crie uma classe Veiculo com: modelo, marca, ano e valor. 
 *Utilize um construtor para setar os dados no momento da instância e um método que devolva o valor final de venda, ou seja, acrescentar 5% ao seu valor. 
 */
package Atividade03;

public class Veiculo {

	private String modelo;
	private String marca;
	private int ano;
	private double valor;
	
	
	public Veiculo (String modelo, String marca, int ano, double valor) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano =ano;
		this.valor = valor;
	}
	
	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	public double getValor() {
		return valor;
	}
	
	public double venda() {
		return (this.valor * 0.05) + this.valor;
	}
	
}

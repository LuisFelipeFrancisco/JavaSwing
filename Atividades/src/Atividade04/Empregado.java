/* 
 * A fim de representar empregados em uma firma, crie uma classe chamada Empregado que inclui as três informações a seguir como atributos: 
 * • um primeiro nome, 
 * • um sobrenome, 
 * • um salário mensal. 
 * Sua classe deve ter um construtor que inicializa os três atributos. 
 * Forneça um método set e get para cada atributo. 
 * Se o salário mensal não for positivo, configure-o como 0.0. 
 * Escreva um aplicativo de teste que demonstra as capacidades da classe. 
 * Crie uma instância da classe e exiba o salário anual. 
 * Então dê ao empregado um aumento de 10% e exiba novamente o salário anual. 
 * Todo o processo deve ser executado em telas utilizando JFrame.
*/
package Atividade04;

public class Empregado {
		
	private String nome;
	private String sobrenome;
	private double salario;
	
	public Empregado (String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		if (this.salario < 0) {
			this.salario = 0;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalarioAnual() {
		return this.salario * 12;
	}
	
	public double aumentoDezPorcento() {
		double novoSalario = this.salario * 0.10;
		this.salario = novoSalario + this.salario;
		return this.salario;
	}
}

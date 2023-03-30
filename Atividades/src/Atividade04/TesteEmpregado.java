package Atividade04;

public class TesteEmpregado {
	public static void main(String[] args) {
		
		Empregado empregado = new Empregado ("Luis", "Ferreira", 100.00);
		
		System.out.println("Nome: " + empregado.getNome() + 
				"\nSobrenome: " + empregado.getSobrenome() + 
				"\nSalario: " + empregado.getSalario());
		
		System.out.println("Salario anual: " + empregado.getSalarioAnual());
		
		System.out.println("Aumento de 10%: " + empregado.aumentoDezPorcento());
		
		System.out.println("Salario anual: " + empregado.getSalarioAnual());
	}
}

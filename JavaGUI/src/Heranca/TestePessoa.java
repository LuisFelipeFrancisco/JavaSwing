package Heranca;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Felipe");
		funcionario.setEndereco("Rua um, Nº 2, Bairro tres");
		funcionario.setCpf("000.000.000-00");
		funcionario.setTelefone("994444968");
		funcionario.setCargo("Gerente");
		funcionario.setSalario(2500.00);
		
		Funcionario funcionario2 = new Funcionario ("Felipe");
		
	}
}

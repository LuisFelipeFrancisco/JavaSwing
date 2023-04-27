package PessoaUniversidade;

public class TestePessoaUnversidade {

	public static void main(String[] args) {
		
		Universidade fatec = new Universidade("Fatec", "Ourinhos");
		Pessoa pessoa = new Pessoa("Felipe", "31/01/1994", fatec);

		pessoa.informarAtributos();

	}
}

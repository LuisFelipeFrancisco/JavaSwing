package Contrato;
import javax.swing.JOptionPane;

public class TesteContrato {
	
	public static void main(String[] args) {
		
		Contrato contrato = new Contrato();
		Proprietario proprietario = new Proprietario();
		Inquilino inquilino = new Inquilino();
		Endereco endereco = new Endereco();
		Imovel imovel = new Imovel();
		
		proprietario.setNome("Felipe");
		proprietario.setCpf("42401000895");
		proprietario.setConjugue("Solteiro");
		
		inquilino.setNome("Luis");
		inquilino.setCpf("00000000000");
		inquilino.setProfissao("Desempregado");
		inquilino.setRenda(3500);
		
		endereco.setRua("Rua Um");
		endereco.setNumero("158");
		endereco.setBairro("Bairo Teste");
		endereco.setCidade("Cidade");
		
		imovel.setEndereco(endereco);
		imovel.setValor(1000);
		
		contrato.setProprietario(proprietario);
		contrato.setInquilino(inquilino);
		contrato.setData("24/04/2023");
		contrato.setImovel(imovel);
		
		JOptionPane.showMessageDialog(null, 
				"Proprietario: " +  contrato.getProprietario().getNome() + 
				"\nCPF proprietario: " + contrato.getProprietario().getCpf() + 
				"\nInquilino: " + contrato.getInquilino().getNome() +
				"\nProfissão inquilino: " + contrato.getInquilino().getProfissao() + 
				"\nImovel Rua: " + contrato.getImovel().getEndereco().getRua() + 
				"\nImovel Numero: " + contrato.getImovel().getEndereco().getNumero() + 
				"\nImovel Cidade: " + contrato.getImovel().getEndereco().getRua() + 
				"\nImovel Valor: " + contrato.getImovel().getValor());
		
	}

}

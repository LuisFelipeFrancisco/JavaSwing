package Atividade02;

import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        g1.setNome("João");
        g1.setIdade(30);
        g1.setSexo("Masculino");
        g1.setSalario(5000);
        g1.setMatricula("123456");
        g1.setNomeGerencia("Gerencia de Vendas");

        JOptionPane.showMessageDialog(null, "Gerente:" + 
        		"\nNome: " + g1.getNome() + 
        		"\nIdade: " + g1.getIdade() + 
        		"\nSexo: " + g1.getSexo() + 
        		"\nSalário: " + g1.getSalario() + 
        		"\nMatrícula: " + g1.getMatricula() + 
        		"\nGerência: " + g1.getNomeGerencia());

        Vendedor v1 = new Vendedor();
        v1.setNome("Maria");
        v1.setIdade(25);
        v1.setSexo("Feminino");
        v1.setSalario(3000);
        v1.setMatricula("654321");
        v1.setValorVendas(10000);
        v1.setQtdVendas(10);

        JOptionPane.showMessageDialog(null, "Vendedor:" + 
        		"\nNome: " + v1.getNome() + 
        		"\nIdade: " + v1.getIdade() + 
        		"\nSexo: " + v1.getSexo() + 
        		"\nSalário: " + v1.getSalario() + 
        		"\nMatrícula: " + v1.getMatricula() + 
        		"\nValor de Vendas: " + v1.getValorVendas() + 
        		"\nQuantidade de Vendas: " + v1.getQtdVendas());

        Cliente c1 = new Cliente();
        c1.setNome("Felipe");
        c1.setIdade(29);
        c1.setSexo("Masculino");
        c1.setValorDivida(500);
        c1.setAnoNasc(1994);

        JOptionPane.showMessageDialog(null, "Cliente:" + 
        		"\nNome: " + c1.getNome() + 
        		"\nIdade: " + c1.getIdade() + 
        		"\nSexo: " + c1.getSexo() + 
        		"\nValor da Dívida: " + c1.getValorDivida() + 
        		"\nAno de Nascimento: " + c1.getAnoNasc());

    }

}

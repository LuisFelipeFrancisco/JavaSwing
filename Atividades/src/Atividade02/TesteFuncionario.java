package Atividade02;

import javax.swing.JOptionPane;

public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        
        f1.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário: "));
        f1.setRegistro(JOptionPane.showInputDialog("Digite o registro do funcionário: "));
        f1.setCargo(JOptionPane.showInputDialog("Digite o cargo do funcionário: "));
        f1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: ")));
        
        JOptionPane.showMessageDialog(null, "Nome: " + f1.getNome() + 
        "\nRegistro: " + f1.getRegistro() + "\nCargo: " + f1.getCargo() + "\nSalário: " + f1.getSalario());
        
    }

}
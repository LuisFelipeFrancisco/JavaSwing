/* 4.	Crie uma classe Funcionario com 2 atributos privados e os respectivos métodos getters e setters.  
Em seguida, crie uma segunda classe Professor, 
que deverá herdar de Funcionario, com 1 atributo privado e um construtor padrão.
*/
package Atividade04;

import javax.swing.JOptionPane;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("Felipe");
        p.setCpf("123.456.789-00");
        p.setMateria("Informatica");
        JOptionPane.showMessageDialog(null, "Nome: " + p.getNome() + 
        		"\nCPF: " + p.getCpf() + 
        		"\nMateria: " + p.getMateria());
    }
    
}

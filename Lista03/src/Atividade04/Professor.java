/* 4.	Crie uma classe Funcionario com 2 atributos privados e os respectivos métodos getters e setters.  
Em seguida, crie uma segunda classe Professor, 
que deverá herdar de Funcionario, com 1 atributo privado e um construtor padrão.
*/
package Atividade04;

public class Professor extends Funcionario {
    
    private String materia;

    public Professor() {
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}

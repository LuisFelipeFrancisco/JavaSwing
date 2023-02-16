import javax.swing.*;

public class Aula01 {

    public static void main(String[] args) {
        String nome;
        int idade;
        double altura;

        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);

    }
    
}
/*
 * 15/02/2023
 * Processo de criação de um programa em Java
 * Ao compilar o programa, o arquivo .class é gerado
 * Ao executar o programa, o arquivo .class é carregado na memória
 * bytecode é o código fonte do programa
 * ele é gerado pelo compilador e interpretado pelo interpretador
 * o interpretador é o Java Virtual Machine (JVM)
 * o compilador é o javac
 * o interpretador é o java
 * o arquivo .class é o bytecode
 * o arquivo .java é o código fonte
 * o arquivo .jar é o arquivo executável
 * ----------------
 * Atividade para a próxima aula
 * 1. Leia um nuemro real equivalente a polegadas e converta para centímetros (1 polegada = 2,54 cm)
 */
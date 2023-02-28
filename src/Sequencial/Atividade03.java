package Sequencial;
import javax.swing.JOptionPane;

/*
* 3.	O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
* distribuidor e dos impostos (aplicados ao custo de fábrica). 
* Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */
public class Atividade03 {
    
    public static void main(String[] args) {
        double custoFabrica, custoFinal, percentualDistribuidor, percentualImpostos;
        
        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica do carro: "));
        percentualDistribuidor = custoFabrica * 0.28;
        percentualImpostos = custoFabrica * 0.45;
        custoFinal = custoFabrica + percentualDistribuidor + percentualImpostos;
        
        JOptionPane.showMessageDialog(null, "O custo final do carro é: " + custoFinal);
    }
}

package Sequencial.Atividade02;
import javax.swing.JOptionPane;

/* 
 * 2. Leia um nuemro real equivalente a polegadas e converta para centímetros (1 polegada = 2,54 cm)
 */
public class Atividade02 {
    
    public static void main(String[] args) {
        double polegadas, centimetros;
        
        polegadas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em polegadas: "));
        centimetros = polegadas * 2.54;
        
        JOptionPane.showMessageDialog(null, polegadas + " polegadas equivalem a " + centimetros + " centímetros");
    }
    
}

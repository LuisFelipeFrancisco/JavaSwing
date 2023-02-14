
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestPanels {
    
    public static void main(String[] args) {
        // Criando um componente JFrame
        JFrame janela = new JFrame("Teste de Componentes");
        janela.setSize(400, 300);
        
        // Criando um componente JPanel
        JPanel painel = new JPanel();
        painel.setSize(400, 300);
      
        //Criando um componente JTextField
        JTextField campoTexto = new JTextField(20);
        campoTexto.setSize(200, 20);

        //Criando um componente JLabel
        JLabel rotulo = new JLabel("Digite seu nome: ");
        rotulo.setSize(200, 20);
        
        //Componente JTextArea
        JTextArea areaTexto = new JTextArea(5, 20);
        areaTexto.setSize(200, 100);

        //Conectando os componentes JLabel e JTextField no JPanel
        painel.add(rotulo);
        painel.add(campoTexto);
        painel.add(areaTexto);

        //Conectando o JPanel no JFrame
        janela.add(painel);

        //Tornando a janela visível
        janela.setVisible(true);

    }
    
}
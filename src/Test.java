
import javax.swing.*;

public class Test {
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("Teste componentes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel lblNome = new JLabel("Nome: ");
        JLabel lblSobrenome = new JLabel("Sobrenome: ");
        JLabel lblNomeCompleto = new JLabel("Nome completo: ");

        JTextField txtNome = new JTextField();
        JTextField txtSobrenome = new JTextField();
        JTextField txtNomeCompleto = new JTextField();

        JButton btnConcatenar = new JButton("Concatenar");
        btnConcatenar.addActionListener(e -> {
            txtNomeCompleto.setText(txtNome.getText() + " " + txtSobrenome.getText());
        });

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(e -> {
            txtNome.setText("");
            txtSobrenome.setText("");
            txtNomeCompleto.setText("");
        });

        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblSobrenome);
        panel.add(txtSobrenome);
        panel.add(lblNomeCompleto);
        panel.add(txtNomeCompleto);
        panel.add(btnConcatenar);
        panel.add(btnLimpar);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
        
    }
}
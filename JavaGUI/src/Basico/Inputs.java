package Basico;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Inputs {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inputs window = new Inputs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inputs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRotulo = new JLabel("Inputs Java GUI");
		lblRotulo.setBounds(0, 0, 434, 50);
		lblRotulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRotulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblRotulo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNome.setBounds(10, 61, 100, 50);
		frame.getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblIdade.setBounds(10, 136, 100, 50);
		frame.getContentPane().add(lblIdade);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtNome.setBounds(100, 72, 300, 41);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtIdade.setColumns(10);
		txtIdade.setBounds(100, 145, 100, 41);
		frame.getContentPane().add(txtIdade);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome;
				int idade;
				
				nome = txtNome.getText();
				idade = Integer.parseInt(txtIdade.getText());
				
				JOptionPane.showMessageDialog(frame, "Nome: " + nome + "\nIdade: " + idade);
				
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnviar.setBounds(172, 199, 89, 39);
		frame.getContentPane().add(btnEnviar);
	}
}

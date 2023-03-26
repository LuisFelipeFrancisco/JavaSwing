package Cliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCliente() {
		
		Cliente cliente = new Cliente();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(30, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(30, 114, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(105, 29, 261, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(105, 111, 261, 20);
		contentPane.add(txtCPF);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cliente.setNome(txtNome.getText());
				cliente.setCpf(txtCPF.getText());
				
				JOptionPane.showMessageDialog(rootPane, "Cadastro inserido");
				
			}
		});
		btnNewButton.setBounds(30, 198, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exibir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(rootPane, "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf());
				
			}
		});
		btnNewButton_1.setBounds(277, 198, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

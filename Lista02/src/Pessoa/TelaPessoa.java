package Pessoa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtAnoNasc;
	private JLabel lblAltura;
	private JTextField txtAltura;
	private JButton btnExibir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPessoa frame = new TelaPessoa();
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
	public TelaPessoa() {
		setTitle("Pessoa");
		
		Pessoa pessoa = new Pessoa();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 33, 50, 20);
		contentPane.add(lblNome);
		
		JLabel lblAnoNasc = new JLabel("Ano de Nascimento:");
		lblAnoNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnoNasc.setBounds(10, 88, 150, 20);
		contentPane.add(lblAnoNasc);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pessoa.setNome(txtNome.getText());
				pessoa.setAnoNasc(Integer.parseInt(txtAnoNasc.getText()));
				pessoa.setAltura(Double.parseDouble(txtAltura.getText()));

				JOptionPane.showMessageDialog(rootPane, "Dados inseridos com sucesso!");
				
				
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnviar.setBounds(10, 197, 89, 23);
		contentPane.add(btnEnviar);
		
		txtNome = new JTextField();
		txtNome.setBounds(70, 35, 190, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtAnoNasc = new JTextField();
		txtAnoNasc.setBounds(142, 90, 118, 20);
		contentPane.add(txtAnoNasc);
		txtAnoNasc.setColumns(10);
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAltura.setBounds(10, 148, 50, 20);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(70, 150, 190, 20);
		contentPane.add(txtAltura);
		
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(rootPane, "Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.idade() + "\nAltura: " + pessoa.getAltura());
				
			}
		});
		btnExibir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExibir.setBounds(171, 197, 89, 23);
		contentPane.add(btnExibir);
	}
}

package Atividade05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField txtCredito;
	private JTextField txtDivida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFornecedor frame = new TelaFornecedor();
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
	public TelaFornecedor() {
		setTitle("Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(52, 40, 94, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(156, 37, 176, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereco.setBounds(52, 68, 94, 14);
		contentPane.add(lblEndereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(156, 65, 176, 20);
		contentPane.add(txtEndereco);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(52, 96, 94, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(156, 93, 176, 20);
		contentPane.add(txtTelefone);
		
		JLabel lblCredito = new JLabel("Valor Credito:");
		lblCredito.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCredito.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCredito.setBounds(52, 124, 94, 14);
		contentPane.add(lblCredito);
		
		txtCredito = new JTextField();
		txtCredito.setColumns(10);
		txtCredito.setBounds(156, 121, 176, 20);
		contentPane.add(txtCredito);
		
		JLabel lblDivida = new JLabel("Valor Divida:");
		lblDivida.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDivida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDivida.setBounds(52, 152, 94, 14);
		contentPane.add(lblDivida);
		
		txtDivida = new JTextField();
		txtDivida.setColumns(10);
		txtDivida.setBounds(156, 149, 176, 20);
		contentPane.add(txtDivida);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String endereco = txtEndereco.getText();
				String telefone = txtTelefone.getText();
				double valorCredito = Double.parseDouble(txtCredito.getText());
				double valorDivida = Double.parseDouble(txtDivida.getText());

				Fornecedor fornecedor1 = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
				
				JOptionPane.showMessageDialog(rootPane, "Dados cadastrados com sucesso!");
				
				JOptionPane.showMessageDialog(rootPane, "Nome: " + txtNome.getText() + 
						"\nTelefone: " + txtTelefone.getText() + 
						"\nEndereço: " + txtEndereco.getText() + 
						"\nValor Credito: " + txtCredito.getText() + 
						"\nValor Divida: " + txtDivida.getText() +
						"\nValor Saldo: " + fornecedor1.obterSaldo()
						);
			}
		});
		btnEnviar.setBounds(172, 197, 89, 23);
		contentPane.add(btnEnviar);
	}
}

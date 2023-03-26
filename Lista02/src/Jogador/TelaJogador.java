package Jogador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaJogador extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtPosicao;
	private JTextField txtDataNasc;
	private JTextField txtNascionalidade;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JButton btnEnviar;
	private JButton btnExibir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogador frame = new TelaJogador();
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
	public TelaJogador() {
		setTitle("Jogador");

		Jogador jogador = new Jogador();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(53, 30, 100, 25);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(162, 30, 176, 25);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblPosicao = new JLabel("Posição:");
		lblPosicao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosicao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPosicao.setBounds(53, 67, 100, 25);
		contentPane.add(lblPosicao);
		
		txtPosicao = new JTextField();
		txtPosicao.setColumns(10);
		txtPosicao.setBounds(162, 67, 176, 25);
		contentPane.add(txtPosicao);
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento:");
		lblDataNasc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataNasc.setBounds(10, 103, 143, 25);
		contentPane.add(lblDataNasc);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setColumns(10);
		txtDataNasc.setBounds(162, 103, 176, 25);
		contentPane.add(txtDataNasc);
		
		JLabel lblNacionalidade = new JLabel("Nascionalidade:");
		lblNacionalidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNacionalidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNacionalidade.setBounds(53, 139, 100, 25);
		contentPane.add(lblNacionalidade);
		
		txtNascionalidade = new JTextField();
		txtNascionalidade.setColumns(10);
		txtNascionalidade.setBounds(162, 139, 176, 25);
		contentPane.add(txtNascionalidade);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAltura.setBounds(53, 175, 100, 25);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(162, 175, 176, 25);
		contentPane.add(txtAltura);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeso.setBounds(53, 211, 100, 25);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(162, 211, 176, 25);
		contentPane.add(txtPeso);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jogador.setNome(txtNome.getText());
				jogador.setPosicao(txtPosicao.getText());
				jogador.setDataNasc(txtDataNasc.getText());
				jogador.setNascionalidade(txtNascionalidade.getText());
				jogador.setAltura(Double.parseDouble(txtAltura.getText()));
				jogador.setPeso(Double.parseDouble(txtPeso.getText()));

				JOptionPane.showMessageDialog(rootPane, "Jogador cadastrado com sucesso!");

			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEnviar.setBounds(53, 276, 89, 23);
		contentPane.add(btnEnviar);
		
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(rootPane, "Nome: " + jogador.getNome() + 
						"\nPosição: " + jogador.getPosicao() + 
						"\nData de Nascimento: " + jogador.getDataNasc() + 
						"\nNascionalidade: " + jogador.getNascionalidade() + 
						"\nAltura: " + jogador.getAltura() + 
						"\nPeso: " + jogador.getPeso());

			}
		});
		btnExibir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExibir.setBounds(249, 276, 89, 23);
		contentPane.add(btnExibir);
	}

}

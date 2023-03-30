package Atividade04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEmpregado extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JLabel lblSalario;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEmpregado frame = new TelaEmpregado();
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
	public TelaEmpregado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(136, 47, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNome.setBounds(192, 44, 200, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSobrenome.setBounds(99, 78, 83, 14);
		contentPane.add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(192, 75, 200, 20);
		contentPane.add(txtSobrenome);
		
		lblSalario = new JLabel("Salario");
		lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSalario.setBounds(99, 109, 83, 14);
		contentPane.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSalario.setColumns(10);
		txtSalario.setBounds(192, 106, 200, 20);
		contentPane.add(txtSalario);
		
		JLabel lblEmpregado = new JLabel("Empregado: ");
		lblEmpregado.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmpregado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEmpregado.setBounds(10, 246, 564, 28);
		contentPane.add(lblEmpregado);
		
		JLabel lblSalarioMensal = new JLabel("Salario Mensal: R$ ");
		lblSalarioMensal.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalarioMensal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSalarioMensal.setBounds(10, 285, 564, 28);
		contentPane.add(lblSalarioMensal);
		
		JLabel lblSalarioAnual = new JLabel("Salario Anual: R$ ");
		lblSalarioAnual.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalarioAnual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSalarioAnual.setBounds(10, 324, 564, 28);
		contentPane.add(lblSalarioAnual);
		
		JLabel lblSalarioMensalAumento = new JLabel("Aumento de 10%: ");
		lblSalarioMensalAumento.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalarioMensalAumento.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSalarioMensalAumento.setBounds(10, 363, 564, 28);
		contentPane.add(lblSalarioMensalAumento);
		
		JLabel lblSalarioAnualAumento = new JLabel("Salario Anual com Aumento: R$");
		lblSalarioAnualAumento.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalarioAnualAumento.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSalarioAnualAumento.setBounds(10, 402, 564, 28);
		contentPane.add(lblSalarioAnualAumento);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				double salario = Double.parseDouble(txtSalario.getText());
				
				Empregado empregado = new Empregado (nome, sobrenome, salario);
				
				lblEmpregado.setText("Empregado: " + empregado.getNome() + " " + empregado.getSobrenome());
				lblSalarioMensal.setText("Salario Mensal: R$ " + String.valueOf(empregado.getSalario()));
				lblSalarioAnual.setText("Salario Anual: R$ " + String.valueOf(empregado.getSalarioAnual()));
				lblSalarioMensalAumento.setText("Aumento de 10%: " + String.valueOf(empregado.aumentoDezPorcento()));
				lblSalarioAnualAumento.setText("Salario Anual com Aumento: R$ " + String.valueOf(empregado.getSalarioAnual()));
				
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEnviar.setBounds(219, 160, 89, 25);
		contentPane.add(btnEnviar);
	}
}

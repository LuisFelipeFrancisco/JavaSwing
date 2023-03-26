package Elevador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaElevador extends JFrame {

	private JPanel contentPane;
	private JTextField txtCapacidade;
	private JTextField txtAndares;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaElevador frame = new TelaElevador();
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
	public TelaElevador() {

		Elevador elevador = new Elevador();

		setTitle("Elevador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCapacidade = new JLabel("Capacidade:");
		lblCapacidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCapacidade.setBounds(10, 35, 136, 25);
		contentPane.add(lblCapacidade);
		
		txtCapacidade = new JTextField();
		txtCapacidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCapacidade.setBounds(156, 35, 176, 25);
		contentPane.add(txtCapacidade);
		txtCapacidade.setColumns(10);
		
		JButton btnInicializa = new JButton("Inicializa");
		btnInicializa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				elevador.setCapacidade(Integer.parseInt(txtCapacidade.getText()));
				elevador.setAndares(Integer.parseInt(txtAndares.getText()));
				elevador.inicializa(elevador.getCapacidade(), elevador.getAndares());

				JOptionPane.showMessageDialog(rootPane, "Elevador inicializado com sucesso!");

			}
		});
		btnInicializa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInicializa.setBounds(41, 138, 89, 23);
		contentPane.add(btnInicializa);
		
		JButton btnEntra = new JButton("Entra");
		btnEntra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				elevador.entra();

			}
		});
		btnEntra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEntra.setBounds(171, 138, 89, 23);
		contentPane.add(btnEntra);
		
		JButton btnSai = new JButton("Sai");
		btnSai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				elevador.sai();

			}
		});
		btnSai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSai.setBounds(301, 138, 89, 23);
		contentPane.add(btnSai);
		
		JButton btnSobe = new JButton("Sobe");
		btnSobe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				elevador.sobe();

			}
		});
		btnSobe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSobe.setBounds(85, 192, 89, 23);
		contentPane.add(btnSobe);
		
		JButton btnDesce = new JButton("Desce");
		btnDesce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				elevador.desce();

			}
		});
		btnDesce.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDesce.setBounds(259, 192, 89, 23);
		contentPane.add(btnDesce);
		
		JLabel lblTotalDeAndares = new JLabel("Total de Andares:");
		lblTotalDeAndares.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalDeAndares.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalDeAndares.setBounds(10, 71, 136, 25);
		contentPane.add(lblTotalDeAndares);
		
		txtAndares = new JTextField();
		txtAndares.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAndares.setColumns(10);
		txtAndares.setBounds(156, 71, 176, 25);
		contentPane.add(txtAndares);
		
		JButton btnStatus = new JButton("Status");
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				elevador.status();

			}
		});
		btnStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStatus.setBounds(171, 246, 89, 23);
		contentPane.add(btnStatus);
	}
}

package Atividade05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class TelaAmigo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JLabel lblSexo;
	private JTextField txtSexo;
	private JLabel lblIdade;
	private JTextField txtIdade;
	private JLabel lblData;
	private JTextField txtDataAniversario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAmigo frame = new TelaAmigo();
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
	public TelaAmigo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(68, 45, 100, 20);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(178, 43, 188, 25);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSexo.setBounds(68, 78, 100, 20);
		contentPane.add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(178, 76, 188, 25);
		contentPane.add(txtSexo);
		
		lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdade.setBounds(68, 111, 100, 20);
		contentPane.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(178, 109, 188, 25);
		contentPane.add(txtIdade);
		
		lblData = new JLabel("Data Aniversario:");
		lblData.setHorizontalAlignment(SwingConstants.RIGHT);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblData.setBounds(37, 144, 131, 20);
		contentPane.add(lblData);
		
		txtDataAniversario = new JTextField();
		txtDataAniversario.setColumns(10);
		txtDataAniversario.setBounds(178, 142, 188, 25);
		contentPane.add(txtDataAniversario);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Amigo amigo = new Amigo();
				amigo.setNome(txtNome.getText());
				amigo.setSexo(txtSexo.getText());
				amigo.setIdade(Integer.parseInt(txtIdade.getText()));
				amigo.setDataAniversario(txtDataAniversario.getText());
				JOptionPane.showMessageDialog(rootPane, "Nome: " + amigo.getNome() + 
		        		"\nSexo: " + amigo.getSexo() + 
		        		"\nIdade: " + amigo.getIdade() + 
		        		"\nData de aniversario: " + amigo.getDataAniversario());
			}
		});
		btnGravar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGravar.setBounds(167, 196, 100, 30);
		contentPane.add(btnGravar);
	}
}

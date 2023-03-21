import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Soma {

	private JFrame frame;
	private JLabel lblInstrucao;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JButton btnSomar;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soma window = new Soma();
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
	public Soma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRotulo = new JLabel("Soma");
		lblRotulo.setBounds(172, 11, 89, 44);
		lblRotulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRotulo.setFont(new Font("Tahoma", Font.PLAIN, 36));
		frame.getContentPane().add(lblRotulo);
		
		lblInstrucao = new JLabel("Insira os numeros a serem somados");
		lblInstrucao.setBounds(7, 66, 419, 29);
		lblInstrucao.setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.getContentPane().add(lblInstrucao);
		
		txtNum1 = new JTextField();
		txtNum1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtNum1.setBounds(10, 139, 120, 50);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtNum2.setBounds(140, 139, 120, 50);
		frame.getContentPane().add(txtNum2);
		txtNum2.setColumns(10);
		
		btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, soma;
				
				num1 = Integer.parseInt(txtNum1.getText());
				num2 = Integer.parseInt(txtNum2.getText());
				
				soma = num1 + num2;
				
				//JOptionPane.showMessageDialog(frame, "Soma: " + soma);
				
				lblResultado.setText("Soma: " + soma);
				
			}
		});
		btnSomar.setBounds(270, 139, 120, 50);
		frame.getContentPane().add(btnSomar);
		
		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblResultado.setBounds(86, 219, 262, 44);
		frame.getContentPane().add(lblResultado);
	}

}

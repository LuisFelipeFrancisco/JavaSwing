package JDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class TelaConexao extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JLabel lblIdade;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConexao frame = new TelaConexao();
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
	public TelaConexao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(118, 87, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(174, 84, 165, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(118, 115, 46, 14);
		contentPane.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(174, 112, 56, 20);
		contentPane.add(txtIdade);
		
		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Connection con = new Conexao().conectar();

				if (con != null) {
					try {
						PreparedStatement ps;
						String sql = "insert into aluno (nome, idade) values (?,?)";
						ps = con.prepareStatement(sql);
						ps.setString(1, txtNome.getText());
						ps.setInt(2, Integer.parseInt(txtIdade.getText()));
						int resultado = ps.executeUpdate();
						con.close();
						if (resultado != 0) {
							JOptionPane.showMessageDialog(contentPane, "Cadastro realizado com sucesso!");
							txtNome.setText("");
							txtIdade.setText("");
						} else {
							JOptionPane.showConfirmDialog(contentPane, "Erro");
						}
					} catch (SQLException erro) {
						JOptionPane.showConfirmDialog(contentPane, "Erro" + erro);
					}
				}
			}
		});
		btnNewButton.setBounds(172, 171, 89, 23);
		contentPane.add(btnNewButton);
	}
}

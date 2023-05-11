package Atividade1005;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaLivros extends JFrame {

	private JPanel rootPane;
	private JTextField txtNome;
	private JTextField txtISSN;
	private JTextField txtAutor;
	private JTextField txtAno;
	private JTextField txtEditora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLivros frame = new TelaLivros();
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
	public TelaLivros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		rootPane = new JPanel();
		rootPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(rootPane);
		rootPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(118, 22, 46, 14);
		rootPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(174, 19, 150, 20);
		rootPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ISSN:");
		lblNewLabel_1.setBounds(118, 61, 46, 14);
		rootPane.add(lblNewLabel_1);
		
		txtISSN = new JTextField();
		txtISSN.setColumns(10);
		txtISSN.setBounds(174, 58, 150, 20);
		rootPane.add(txtISSN);
		
		JLabel lblNewLabel_2 = new JLabel("Autor:");
		lblNewLabel_2.setBounds(118, 100, 46, 14);
		rootPane.add(lblNewLabel_2);
		
		txtAutor = new JTextField();
		txtAutor.setColumns(10);
		txtAutor.setBounds(174, 97, 150, 20);
		rootPane.add(txtAutor);
		
		JLabel lblNewLabel_3 = new JLabel("Ano:");
		lblNewLabel_3.setBounds(118, 139, 46, 14);
		rootPane.add(lblNewLabel_3);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(174, 136, 150, 20);
		rootPane.add(txtAno);
		
		JLabel lblNewLabel_4 = new JLabel("Editora:");
		lblNewLabel_4.setBounds(118, 178, 46, 14);
		rootPane.add(lblNewLabel_4);
		
		txtEditora = new JTextField();
		txtEditora.setColumns(10);
		txtEditora.setBounds(174, 175, 150, 20);
		rootPane.add(txtEditora);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Connection con = new Conexao().conectar();

				if (con != null) {
					try {
						PreparedStatement ps;
						String sql = "insert into livros (nome, issn, autor, ano, editora) values (?,?,?,?,?)";
						ps = con.prepareStatement(sql);
						ps.setString(1, txtNome.getText());
						ps.setString(2, txtISSN.getText());
						ps.setString(3, txtAutor.getText());
						ps.setInt(4, Integer.parseInt(txtAno.getText()));
						ps.setString(5, txtEditora.getText());
						int resultado = ps.executeUpdate();
						con.close();
						if (resultado != 0) {
							JOptionPane.showMessageDialog(rootPane, "Sucesso");
							txtNome.setText("");
							txtISSN.setText("");
							txtAutor.setText("");
							txtAno.setText("");
							txtEditora.setText("");
						} else {
							JOptionPane.showMessageDialog(rootPane, "Erro");
						}
					} catch (SQLException erro) {
						JOptionPane.showMessageDialog(rootPane, erro);
					}
				}

			}
		});
		btnGravar.setBounds(172, 214, 89, 23);
		rootPane.add(btnGravar);
	}
}

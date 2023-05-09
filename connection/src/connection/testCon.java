package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class testCon {
	
	public static void main(String[] args) {
		
		Connection con = new connection().conectar();
		
		if (con != null) {
			try {
				PreparedStatement ps;
				String sql = "insert into aluno (nome, idade) values (?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, "Felipe");
				ps.setInt(2, 29);
				int resultado = ps.executeUpdate();
				con.close();
				if (resultado != 0) {
					JOptionPane.showMessageDialog(null, "Sucesso");
					//Limpar campos
				} else {
					JOptionPane.showConfirmDialog(null, "Erro");
				}
			} catch (SQLException erro) {
				JOptionPane.showConfirmDialog(null, "");
			}
		}
		
	}
	
}

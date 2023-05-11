package Atividade1005;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private final String bd;
	private final String usuario;
	private final String senha;

	public Conexao() {
		this.bd = "ILP007"; //Database criada para os projetos da disciplina
		this.usuario = "root";
		this.senha = "";
	}

	public Connection conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/" + this.bd, this.usuario, this.senha);
		} catch (ClassNotFoundException | SQLException erro) {
			System.out.println(erro);
			return null;
		}
	}
}
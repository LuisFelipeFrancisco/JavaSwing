package Atividade1005;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Livro {
	
	private String nome;
	private String issn;
	private String autor;
	private int ano;
	private String editora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public boolean gravarLivro(){
        Connection con = new Conexao().conectar();
        if (con != null) {
            try {
                PreparedStatement ps;
                String sql = "insert into livros (nome, issn, autor, ano, editora) values (?,?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, getNome());   
                ps.setString(2, getIssn());
                ps.setString(3, getAutor());
                ps.setInt(4, getAno());
                ps.setString(5, getEditora());
                if(ps.executeUpdate()!=0){
                    con.close();
                    return true;
                }else{
                    return false;
                }             
            } catch (SQLException erro) {
                System.out.println(erro);
                return false;
            }
        }else{
            return false;
        }
    }

}

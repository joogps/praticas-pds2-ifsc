package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaDAO {
	public boolean inserir(Pessoa p) {
		Conexao c = Conexao.getInstacia();
		Connection con = c.conectar();
		
		String query = "INSERT INTO usuarios (id_usuario, email, nome) VALUES (?, ?, ?);";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getNome());
			ps.setString(3, p.getEmail());
			ps.executeUpdate();
			
			c.fecharConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	public ArrayList<Pessoa> listar() {
		Conexao c = Conexao.getInstacia();
		Connection con = c.conectar();
		
		String query = "SELECT * FROM usuarios;";
		
		try {
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.setInt(1, p.getId());
//			ps.setString(2, p.getNome());
//			ps.setString(3, p.getEmail());
//			ps.executeUpdate();
			
			c.fecharConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		return true;
	}
}

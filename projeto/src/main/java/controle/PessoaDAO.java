package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Pessoa;

public class PessoaDAO {
	public boolean inserir(Pessoa p) {
		Conexao c = Conexao.getInstacia();
		Connection con = c.conectar();
		
		String query = "INSERT INTO pessoa (id_pessoa, primeiro_nome) VALUES (?, ?);";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, p.getIdPessoa());
			ps.setString(2, p.getPrimeiroNome());
			ps.executeUpdate();
			
			c.fecharConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
}

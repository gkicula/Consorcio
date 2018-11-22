package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
	
	private String driver = "com.mysql.jdbc.Driver";
	private String caminho = "jdbc:mysql://localhost/sistema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String usuario = "root";
	private String senha = "";
	public Connection conexao;
	public Statement stm;
	public ResultSet rs;
	
	public void obterConexao() {
		try {
			System.setProperty("jdbc.Drivers", driver);
			conexao = DriverManager.getConnection(caminho, usuario, senha);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possível conectar ao servidor"+e.getMessage());
		}
	}
	
	public void executarSql (String sql) {
		
		try {
			stm = conexao.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
			rs = stm.executeQuery(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro executaSql:\n"+e.getMessage());
		}
		
	}
	
    public void desconecta(){
    	try {
    		conexao.close();
    	}catch (Exception e) {
    		JOptionPane.showMessageDialog(null, "Não foi possível desconectar do servidor"+e.getMessage());
    	}
    }
}

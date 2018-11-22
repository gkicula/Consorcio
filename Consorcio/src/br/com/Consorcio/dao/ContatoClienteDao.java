package br.com.Consorcio.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.Consorcio.bean.ModeloContatoCliente;
import connectionFactory.Conexao;

public class ContatoClienteDao {
	Conexao conex = new Conexao();
	ModeloContatoCliente modelo = new ModeloContatoCliente();
	
	public void cadastrarCliente(ModeloContatoCliente modelo) {
		String sql = "INSERT INTO contatocliente (celularUmCliente, celularDoisCliente, celularTresCliente, telefoneUmCliente, telefoneDoisCliente, emailCliente) VALUE(?, ?, ?, ?, ?, ?)";
		conex.obterConexao();
		try {
			PreparedStatement pst = conex.conexao.prepareStatement(sql);
			pst.setInt(1, modelo.getCelularUmCliente());
			pst.setInt(2, modelo.getCelularDoisCliente());
			pst.setInt(3, modelo.getCelularTresCliente());
			pst.setInt(4, modelo.getTelefoneUmCliente());
			pst.setInt(5, modelo.getTelefoneDoisCliente());
			pst.setString(6, modelo.getEmailCliente());
			pst.execute();
			pst.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente!/nErro:"+e);
		}
		conex.desconecta();
	}

}

package br.com.Consorcio.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.Consorcio.bean.ModeloCliente;
import connectionFactory.Conexao;

public class ClienteDao {
	Conexao conex = new Conexao();
	ModeloCliente modelo = new ModeloCliente();
	
	public void cadastrarCliente(ModeloCliente modelo) {
		String sql = "INSERT INTO cliente (espCliente, nomeCliente, cpfCliente, rgCliente, dataNascimentoCliente, idSexo, idEnderecoCliente, idContatoCliente, idlogin, idBanco, idEmprestimo) VALUE(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		conex.obterConexao();
		try {
			PreparedStatement pst = conex.conexao.prepareStatement(sql);
			pst.setInt(1, modelo.getEspCliente());
			pst.setString(2, modelo.getNomeCliente());
			pst.setString(3, modelo.getCpfCliente());
			pst.setString(4, modelo.getRgCliente());
			pst.setString(5, modelo.getDataNascimentoCliente());
			pst.setInt(6, modelo.getIdSexo());
			pst.setInt(7, modelo.getIdEnderecoCliente());
			pst.setInt(8, modelo.getIdContatoCliente());
			pst.setInt(9, modelo.getIdLogin());
			pst.setInt(10, modelo.getIdBanco());
			pst.setInt(11, modelo.getIdEmprestimo());
			pst.execute();
			pst.close();
			
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente!/nErro:"+e);
		}
		conex.desconecta();
	}
	
	public ModeloCliente searchCliente (ModeloCliente mod) {
		conex.executarSql("select *from cliente where nomeCliente like'%"+mod.getPesquisa()+"%'");
		conex.obterConexao();
		try {
			conex.rs.first();
			mod.setIdCliente(conex.rs.getInt("idCliente"));
			mod.setNomeCliente(conex.rs.getString("nomeCliente"));
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao procurar o cliente!/nErro:"+e);
		}
		conex.desconecta();
		return mod;
	}
	
}

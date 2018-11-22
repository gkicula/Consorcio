package br.com.Consorcio.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.Consorcio.bean.ModeloEnderecoCliente;
import connectionFactory.Conexao;

public class EnderecoClienteDao {
	
	Conexao conex = new Conexao();
	ModeloEnderecoCliente modelo = new ModeloEnderecoCliente();
	
	public void cadastrarCliente(ModeloEnderecoCliente modelo) {
		String sql = "INSERT INTO enderecocliente (cidadeCliente, bairroCliente, ruaCliente, numeroCliente, cepCliente, complementoCliente) VALUE(?, ?, ?, ?, ?, ?)";
		conex.obterConexao();
		try {
			PreparedStatement pst = conex.conexao.prepareStatement(sql);
			pst.setString(1, modelo.getCidadeCliente());
			pst.setString(2, modelo.getBairroCliente());
			pst.setString(3, modelo.getRuaCliente());
			pst.setInt(4, modelo.getNumeroCliente());
			pst.setInt(5, modelo.getCepCliente());
			pst.setString(6, modelo.getComplementoCliente());
			pst.execute();
			pst.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente!/nErro:"+e);
		}
		conex.desconecta();
	}

}

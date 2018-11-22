package br.com.Consorcio.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.Consorcio.bean.ModeloSexo;
import connectionFactory.Conexao;

public class SexoDao {
	
	Conexao conex = new Conexao();
	ModeloSexo modelo = new ModeloSexo();
	
	public void cadastrarCliente(ModeloSexo modelo) {
		String sql = "INSERT INTO sexo (nomeSexo) VALUE(?)";
		conex.obterConexao();
		try {
			PreparedStatement pst = conex.conexao.prepareStatement(sql);
			pst.setString(1, modelo.getNomeSexo());
			pst.execute();
			pst.close();
			
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente!/nErro:"+e);
		}
		conex.desconecta();
	}
	
}

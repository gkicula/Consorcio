package br.com.Consorcio.bean;

public class ModeloEnderecoCliente {
	
	private String cidadeCliente;
	private String bairroCliente;
	private String ruaCliente;
	private int numeroCliente;
	private int cepCliente;
	private String complementoCliente;
	
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public String getRuaCliente() {
		return ruaCliente;
	}
	public void setRuaCliente(String ruaCliente) {
		this.ruaCliente = ruaCliente;
	}
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public int getCepCliente() {
		return cepCliente;
	}
	public void setCepCliente(int cepCliente) {
		this.cepCliente = cepCliente;
	}
	public String getComplementoCliente() {
		return complementoCliente;
	}
	public void setComplementoCliente(String complementoCliente) {
		this.complementoCliente = complementoCliente;
	}
}

package com.estilise.estilise.model;

public class modelLoginUsuario {

	private String nome;
	
	private String nomeUsuario;
	
	private String senha;
	
	private String token;
	
	//private boolean vendedor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	//public boolean isVendedor() {
		//return vendedor;
	//}

	//public void setVendedor(boolean vendedor) {
		//this.vendedor = vendedor;
	//}
	
}

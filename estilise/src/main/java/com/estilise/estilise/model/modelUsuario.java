package com.estilise.estilise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuario")
public class modelUsuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_usuario;
	
	@NotNull
	private String nomeUsuario;
	
	@Size(min=11,max=11)
	private String cpf_usuario;
	
	@NotNull
	private String email_usuario;
	
	@NotNull
	private String cep;
	
	private String telefone;
	private int numero_casa;
	private String complemento;
	
	@NotNull
	@Size(min=8,max=20)
	private String senha;
	
	private String cartao_credito;
	private byte[] imagem_usuario;
	
	public long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_usuario() {
		return nomeUsuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nomeUsuario = nome_usuario;
	}
	public String getCpf_usuario() {
		return cpf_usuario;
	}
	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getNumero_casa() {
		return numero_casa;
	}
	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCartao_credito() {
		return cartao_credito;
	}
	public void setCartao_credito(String cartao_credito) {
		this.cartao_credito = cartao_credito;
	}
	public byte[] getImagem_usuario() {
		return imagem_usuario;
	}
	public void setImagem_usuario(byte[] imagem_usuario) {
		this.imagem_usuario = imagem_usuario;
	}
}

package com.estilise.estilise.rest.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDTO {

	private long id_usuario;

	private String nome;

	private String senha;

	private String cpf_usuario;
	
	private String email_usuario;

	private String cep;
	
	private String telefone;
	
	private int numero_casa;
	
	private String complemento;
	
	private String cartao_credito;
	
	private byte[] imagem_usuario;
	
	private Long idCompra;

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

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

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}
	
}

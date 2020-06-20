package com.estilise.estilise.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="profissional")
public class modelProfissional {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_profissional;
	
	@NotNull
	private String nomeProfissional;
	
	@NotNull
	private String email;
	
	@NotNull
	private String telefone;
	
	@NotNull
	private String cpf_cnpj;
	
	@NotNull
	@Size(min=8,max=20)
	private String senha_profissional;
	
	@NotNull
	private String cep_profissional;
	
	@NotNull
	private int numero_casa_profissional;
	
	private String complemento;
	
	@NotNull
	private String especialidade;
	
	@NotNull
	private Date data_nascimento;
	
	private byte[] imagem_profissional;
	
	public long getId_profissional() {
		return id_profissional;
	}

	public void setId_profissional(long id_profissional) {
		this.id_profissional = id_profissional;
	}

	public String getNome_profissional() {
		return nomeProfissional;
	}

	public void setNome_profissional(String nome_profissional) {
		this.nomeProfissional = nome_profissional;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getSenha_profissional() {
		return senha_profissional;
	}

	public void setSenha_profissional(String senha_profissional) {
		this.senha_profissional = senha_profissional;
	}

	public String getCep_profissional() {
		return cep_profissional;
	}

	public void setCep_profissional(String cep_profissional) {
		this.cep_profissional = cep_profissional;
	}

	public int getNumero_casa_profissional() {
		return numero_casa_profissional;
	}

	public void setNumero_casa_profissional(int numero_casa_profissional) {
		this.numero_casa_profissional = numero_casa_profissional;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public byte[] getImagem_profissional() {
		return imagem_profissional;
	}

	public void setImagem_profissional(byte[] imagem_profissional) {
		this.imagem_profissional = imagem_profissional;
	}
	
}

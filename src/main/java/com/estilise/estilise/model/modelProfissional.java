package com.estilise.estilise.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name="profissional")
@Data
public class modelProfissional {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_profissional;
	
	@NotNull
	private String nomeProfissional;
	
	@NotNull
	@Email
	private String emailprofissional;
	
	@NotNull
	private String telefone_profissional;
	
	@NotNull
	@Column(name="cpf_cnpj", unique=true, length = 14)
//	@Size(min=11,max=14)
	private String cpf_cnpj;
	
	@NotNull
//	@Size(min=8,max=20)
	private String senha_profissional;
	
	@NotNull
	private String cep_profissional;
	
	@NotNull
	private int numero_casa_profissional;
	
	private String complemento_profissional;
	
	@NotNull
	private String especialidade;
	
	@NotNull
	private Date data_nascimento;
	
	private byte[] imagem_profissional;
}

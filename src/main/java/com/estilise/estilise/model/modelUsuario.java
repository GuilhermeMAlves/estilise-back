package com.estilise.estilise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.Data;

@Entity
@Table(name="usuario")
@Data
public class modelUsuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_usuario;
	
	@NotNull
	private String nome;

	@NotNull
//	@Size(min=5, max = 100)
	private String senha;
	
	@Size(min=11,max=11)
	@UniqueElements
	private String cpf_usuario;
	
	@NotNull
	@Email
	private String emailusuario;
	
	@NotNull
	private String cep;
	
	private String telefone;
	private int numero_casa;
	private String complemento;
	
	private String cartao_credito;
	private byte[] imagem_usuario;	
}
	

	

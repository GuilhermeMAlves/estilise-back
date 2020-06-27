package com.estilise.estilise.model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class modelLoginUsuario {

	private String emailusuario;
	private String cpf_usuario;
	private String senha;
	private String nome;
	
	private String cep;
	private String telefone;
	private int numero_casa;
	private String complemento;
	private String cartao_credito;
	private String imagem_usuario;
	private String especialidade;
	private Date data_nascimento;
	private boolean profissional;
	
	private String token;


	public String getSenha() {
		return senha;
	}
}

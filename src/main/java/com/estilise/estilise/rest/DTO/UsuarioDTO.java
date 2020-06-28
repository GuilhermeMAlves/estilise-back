package com.estilise.estilise.rest.DTO;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDTO {

	private long id_usuario;

	private String nome;

	private String senha;

	private String cpf_usuario;
	
	private String emailusuario;

	private String cep;
	
	private String telefone;
	
	private int numero_casa;
	
	private String complemento;
	
	private String cartao_credito;
	
	private String imagem_usuario;
	
	private Long idCompra;
	
	//--------------- profissional
	private String especialidade;
	
	private Date data_nascimento;
	
	private String profissional;

}

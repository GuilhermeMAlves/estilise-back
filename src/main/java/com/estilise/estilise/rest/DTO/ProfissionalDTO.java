package com.estilise.estilise.rest.DTO;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProfissionalDTO {

	private long id_profissional;

	private String nomeProfissional;

	private String senha_profissional;

	private String cpf_cnpj;
	
	private String emailprofissional;

	private String cep_profissional;
	
	private String telefone_profissional;
	
	private int numero_casa_profissional;
	
	private String complemento_profissional;
	
	private String especialidade;
	
	private byte[] imagem_profissional;
	
	private Date data_nascimento;
	
	private Long idCompra;
	
}
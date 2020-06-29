package com.estilise.estilise.rest.DTO;

import java.util.Date;

import com.estilise.estilise.model.modelCategoria;
import com.estilise.estilise.model.modelUsuario;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProdutoDTO {
	
	private Long idproduto;
	private String nomeProduto;
	private String material;
	private String cor;
	private float preco;
	private String tamanho;
	private String descricao;
	private String keytag;
	private String imagem1;
	private String imagem2;
	private String imagem3;
	private Date data= new java.sql.Date(System.currentTimeMillis());
	private Long idusuario;
	private Long idcategoria;
	private int qtdestoque;

}

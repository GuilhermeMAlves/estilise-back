package com.estilise.estilise.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="produto")
public class modelProduto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_produto;
	
//	@NotNull
//	@Size(min=3,max=20)
	private String nomeProduto;
	
//	@NotNull
	private String material;
	
//	@NotNull
	private String cor;
	
//	@NotNull
	private float preco;
	
//	@NotNull
	private String tamanho;
	
//	@NotNull
	private String descricao;
	
//	@NotNull
	private String keytag;
	
//	@NotNull
	private String imagem1;
	
	private String imagem2;
	private String imagem3;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data= new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_usuario", referencedColumnName="id_usuario")
	private modelUsuario id_usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_categoria", referencedColumnName="id_categoria")
	private modelCategoria id_categoria;
	
	private int qtd_estoque;
	
}

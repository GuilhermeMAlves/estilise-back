package com.estilise.estilise.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="categoria")
public class modelCategoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_categoria;
	
	@NotNull
	private String nome_categoria;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private String imagem_categoria;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="id_produto", referencedColumnName="id_produto")
//	private modelProduto id_produto;
	
	public long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNome_categoria() {
		return nome_categoria;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem_categoria() {
		return imagem_categoria;
	}

	public void setImagem_categoria(String imagem_categoria) {
		this.imagem_categoria = imagem_categoria;
	}

//	public modelProduto getId_produto() {
//		return id_produto;
//	}
//
//	public void setId_produto(modelProduto id_produto) {
//		this.id_produto = id_produto;
//	}

}

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

@Entity
@Table(name="produto")
public class modelProduto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_produto;
	
	@NotNull
	@Size(min=3,max=20)
	private String nomeProduto;
	
	@NotNull
	private String material;
	
	@NotNull
	private String cor;
	
	@NotNull
	private float preco;
	
	@NotNull
	private String tamanho;
	
	@NotNull
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@NotNull
	private String keytag;
	
	@NotNull
	private byte[] imagem1;
	
	private byte[] imagem2;
	private byte[] imagem3;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data= new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_usuario", referencedColumnName="id_usuario")
	private modelUsuario id_usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_categoria", referencedColumnName="id_categoria")
	private modelCategoria id_categoria;
	
	private int qtd_estoque;
	
	public modelUsuario getId_profissional() {
		return id_usuario;
	}
	public void setId_profissional(modelUsuario id_usuario) {
		this.id_usuario = id_usuario;
	}
	public modelCategoria getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(modelCategoria id_categoria) {
		this.id_categoria = id_categoria;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public long getId_produto() {
		return id_produto;
	}
	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome_produto() {
		return nomeProduto;
	}
	public void setNome_produto(String nome_produto) {
		this.nomeProduto = nome_produto;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getKeytag() {
		return keytag;
	}
	public void setKeytag(String keytag) {
		this.keytag = keytag;
	}
	public byte[] getImagem1() {
		return imagem1;
	}
	public void setImagem1(byte[] imagem1) {
		this.imagem1 = imagem1;
	}
	public byte[] getImagem2() {
		return imagem2;
	}
	public void setImagem2(byte[] imagem2) {
		this.imagem2 = imagem2;
	}
	public byte[] getImagem3() {
		return imagem3;
	}
	public void setImagem3(byte[] imagem3) {
		this.imagem3 = imagem3;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}

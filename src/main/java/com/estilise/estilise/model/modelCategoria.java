package com.estilise.estilise.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
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

}

package com.estilise.estilise.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name="compra")
@Data
public class ModelCompra {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCompra;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_compra= new java.sql.Date(System.currentTimeMillis());
	
	
	
	
	
	
	
	



	public long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(long idCompra) {
		this.idCompra = idCompra;
	}

	public Date getData_compra() {
		return data_compra;
	}

	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}
}



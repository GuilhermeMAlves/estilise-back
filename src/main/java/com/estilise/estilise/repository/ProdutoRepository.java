package com.estilise.estilise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estilise.estilise.model.modelProduto;
import com.estilise.estilise.model.modelUsuario;

@Repository
public interface ProdutoRepository extends JpaRepository<modelProduto, Long> {
	public List<modelProduto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	public List<modelProduto> findAllByCarrinho(String carrinho);
	public List<modelProduto> findAllByIdUsuario(Float idUsuario);
	public List<modelProduto> findAllByCategoriaContainingIgnoreCase(String categoria);
}

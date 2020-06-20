package com.estilise.estilise.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estilise.estilise.model.modelUsuario;

@Repository
public interface UsuarioRepository extends JpaRepository<modelUsuario, Long> {
	public List<modelUsuario> findAllBynome(String nome);
	public Optional<modelUsuario> findBynome(String nome);
}

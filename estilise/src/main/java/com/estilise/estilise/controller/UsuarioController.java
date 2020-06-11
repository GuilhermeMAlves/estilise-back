package com.estilise.estilise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estilise.estilise.model.modelUsuario;
import com.estilise.estilise.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<modelUsuario>>GetAllUsuario(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<modelUsuario>GetById(@PathVariable long id){
		return repository.findById(id).map(resp->ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<modelUsuario> PostUsuario(@RequestBody modelUsuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
	}
	
	@PutMapping
	public ResponseEntity<modelUsuario> PutUsuario(@RequestBody modelUsuario usuario){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
	}
	
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable long id) {
		repository.deleteById(id);
	}
}

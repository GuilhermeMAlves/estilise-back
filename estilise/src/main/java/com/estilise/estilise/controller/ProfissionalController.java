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

import com.estilise.estilise.model.modelProfissional;
import com.estilise.estilise.repository.ProfissionalRepository;

@RestController
@RequestMapping("/profissionais")
@CrossOrigin("*")
public class ProfissionalController {
	
	@Autowired
	private ProfissionalRepository repository;
	
	@GetMapping
	public ResponseEntity<List<modelProfissional>>GetAllProfissional(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<modelProfissional>GetById(@PathVariable long id){
		return repository.findById(id).map(resp->ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<modelProfissional> PostProfissional(@RequestBody modelProfissional profissional){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(profissional));
	}
	
	@PutMapping
	public ResponseEntity<modelProfissional> PutProfissional(@RequestBody modelProfissional profissional){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(profissional));
	}
	
	@DeleteMapping("/{id}")
	public void deleteProfissional(@PathVariable long id) {
		repository.deleteById(id);
	}
}

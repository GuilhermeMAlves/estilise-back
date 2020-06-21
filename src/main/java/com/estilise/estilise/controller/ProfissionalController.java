package com.estilise.estilise.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.server.ResponseStatusException;

import com.estilise.estilise.model.ModelCompra;
import com.estilise.estilise.model.modelLoginProfissional;
import com.estilise.estilise.model.modelProfissional;
import com.estilise.estilise.repository.CompraRepository;
import com.estilise.estilise.repository.ProfissionalRepository;
import com.estilise.estilise.rest.DTO.ProfissionalDTO;
import com.estilise.estilise.service.ProfissionalService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/profissionais")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ProfissionalController {
	
	private final CompraRepository compraRepository;
	
	private final ProfissionalRepository repository;
	
//	@Autowired
//	private ProfissionalRepository repository;
	
	@Autowired
    private ProfissionalService profissionalService;
	
	@GetMapping
	public ResponseEntity<List<modelProfissional>>GetAllProfissional(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<modelProfissional>GetById(@PathVariable long id){
		return repository.findById(id).map(resp->ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/teste")
	public modelProfissional salvar(@RequestBody ProfissionalDTO dto) {
		Long idCompra = dto.getIdCompra();
		ModelCompra compra = compraRepository.findById(idCompra).orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Compra não existente."));
		modelProfissional profissional = new modelProfissional();
		profissional.setId_profissional(dto.getId_profissional());
		profissional.setNomeProfissional(dto.getNomeProfissional());
		profissional.setSenha_profissional(dto.getSenha_profissional());
		profissional.setCpf_cnpj(dto.getCpf_cnpj());
		profissional.setEmailprofissional(dto.getEmailprofissional());
		profissional.setCep_profissional(dto.getCep_profissional());
		profissional.setTelefone_profissional(dto.getTelefone_profissional());
		profissional.setNumero_casa_profissional(dto.getNumero_casa_profissional());
		profissional.setComplemento_profissional(dto.getComplemento_profissional());
		profissional.setImagem_profissional(dto.getImagem_profissional());
		return repository.save(profissional);
	}
	
	@PostMapping("/logar")
    public ResponseEntity<modelLoginProfissional> Autenticacao(@RequestBody Optional<modelLoginProfissional> user){
          return profissionalService.Logar(user).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }
	
	@PostMapping
	public ResponseEntity<modelProfissional> PostProfissional(@RequestBody modelProfissional profissional){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(profissional));
	}
	
    @PostMapping("/cadastrar")
    public ResponseEntity<modelProfissional> Post(@RequestBody modelProfissional profissional){
          return ResponseEntity.status(HttpStatus.CREATED).body(profissionalService.CadastrarProfissional(profissional));
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

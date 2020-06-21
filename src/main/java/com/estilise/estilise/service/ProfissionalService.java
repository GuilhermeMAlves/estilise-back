package com.estilise.estilise.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.estilise.estilise.model.modelLoginProfissional;
import com.estilise.estilise.model.modelProfissional;
import com.estilise.estilise.repository.ProfissionalRepository;


@Service
public class ProfissionalService {

	@Autowired
	private ProfissionalRepository repository;
	
	public modelProfissional CadastrarProfissional(modelProfissional profissional) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String senhaEncoder = encoder.encode(profissional.getSenha_profissional());
		profissional.setSenha_profissional(senhaEncoder);
		return repository.save(profissional);
	}
	
	public Optional<modelLoginProfissional> Logar(Optional<modelLoginProfissional> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<modelProfissional> profissional = repository.findByEmailprofissional(user.get().getEmailprofissional());
		if(profissional.isPresent()) {
			if(encoder.matches(user.get().getSenha_profissional(), profissional.get().getSenha_profissional())) {
				String auth = user.get().getEmailprofissional()+ ":" +user.get().getSenha_profissional();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader ="Basic " + new String(encodedAuth);
				user.get().setToken(authHeader);
				user.get().setEmailprofissional(profissional.get().getNomeProfissional());
				return user;
			}
		}
		return null;
	}
}
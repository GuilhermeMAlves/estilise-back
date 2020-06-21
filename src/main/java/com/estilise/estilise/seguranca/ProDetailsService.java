package com.estilise.estilise.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.estilise.estilise.model.modelProfissional;
import com.estilise.estilise.repository.ProfissionalRepository;

@Service
public class ProDetailsService implements UserDetailsService {
	@Autowired
	private ProfissionalRepository proRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
		Optional<modelProfissional> pro = proRepository.findByEmailprofissional(userEmail);
		pro.orElseThrow(()-> new UsernameNotFoundException(userEmail + " not found."));
		return pro.map(DetailsImpl::new).get();
	}
}

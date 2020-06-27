package com.estilise.estilise.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class modelLoginUsuario {

	private String emailusuario;
	
	private String senha;
	
	private String token;

	public String getEmailusuario() {
		return emailusuario;
	}

	public void setEmailusuario(String emailusuario) {
		this.emailusuario = emailusuario;
	}

	public String getSenha() {
		return senha;
	}
}

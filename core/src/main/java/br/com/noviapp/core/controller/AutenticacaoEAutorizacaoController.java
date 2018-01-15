package br.com.noviapp.core.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.noviapp.core.model.Usuario;

/**
 * 
 * @author andre_mbm@hotmail.com
 *
 */
@RestController
@RequestMapping(AutenticacaoEAutorizacaoController.PATH)
public class AutenticacaoEAutorizacaoController {
	
	public static final String PATH = "/auth";
	
	@RequestMapping("/usuario")
	public Usuario login() {
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setEmail("andre_mbm@hotmail.com");
		usuario.setSenha("1234");
		usuario.setDataCadastro(Calendar.getInstance().getTime());
		return usuario;
	}

}

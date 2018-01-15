package br.com.noviapp.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Pode ver todos os pedidos, funcionarios e clientes ativos. Pode alterar preços do menu. Pode abrir a comanda.
 * @author andre_mbm@hotmail.com
 *
 */
@RestController
@RequestMapping(AdminEstabelecimentoController.PATH)
public class AdminEstabelecimentoController {
	
	public static final String PATH = "/adminestabelecimento";
	
	
	public void listarComandasAbertas() {
		
	}
	
	public void listarComandasFechadas() {
		
	}
	
	public void listarUsuariosLogados() {
		
	}
	
	public void listarMenu() {
		
	}
	
	public void alterarItemMenu() {
		
	}
	
	public void abrirComanda() {
		
	}

}

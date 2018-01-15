package br.com.noviapp.core.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.noviapp.core.model.Restaurante;
import br.com.noviapp.core.service.RestauranteService;

/**
 * 
 * @author andre_mbm@hotmail.com
 *
 */
@RestController
@RequestMapping(AdminController.PATH)
public class AdminController {
	
	public static final String PATH = "/admin";
	
	@Autowired
	private RestauranteService restauranteService;
	
	@RequestMapping(path = "/restaurantes/add", method = POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Restaurante salvarRestaurante (@RequestBody Restaurante restaurante) {
		return this.restauranteService.salvarRestaurante(restaurante);
	}
	
	public void listarTodosRestaurantes() {
		
	}
	
	public void listarTodosClientes() {
		
	}
	
	public void listarTodasComandas() {
		
	}
	


}

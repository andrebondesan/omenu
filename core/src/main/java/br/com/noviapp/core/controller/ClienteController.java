package br.com.noviapp.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.noviapp.core.model.Restaurante;
import br.com.noviapp.core.service.RestauranteService;

/**
 * 
 * @author andre_mbm@hotmail.com
 *
 */
@RestController
@RequestMapping(ClienteController.PATH)
public class ClienteController {
	
	public static final String PATH = "/cliente";
	
	@Autowired
	private RestauranteService restauranteService;
	
	
	@RequestMapping("/")
    @ResponseBody
    public String olaCliente(){
        return "Ola, Bem vindo ao sistema NoviMenu - Cliente";
    }
	
	public void adicionarCartaoDeCredito() {
		
	}
	
	/**
	 * lista todos os cartoes com o id do usuario
	 */
	public void listarCartaoDeCredito() {
		
	}
	
	public void editarCartaoDeCredito() {
			
	}
	
	public void apagarCartaoDeCredito() {
		
	}
	
	/**
	 * listar todos os estabelecimentos
	 */
	@RequestMapping("/restaurantes")
	public List<Restaurante> listarEstabelecimentos() {
		System.out.println("entrou aqui");
		return this.restauranteService.retornaTodos();
	}
	
	public void escolherEstabelecimento() {
	}
	
	/**
	 * exibe os menus com o id do restaurante
	 */
	public void mostrarMenus() {
		
	}
	
	public void fazerPedido() {
		
	}
	
	/**
	 * visualiza comanda ativa do cliente
	 */
	public void visualizarComanda() {
		
	}
	
	public void encerrarComanda() {
		
	}
	
	public void efetuarPagamento() {
		
	}

}

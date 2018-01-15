package br.com.noviapp.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.noviapp.core.model.Restaurante;
import br.com.noviapp.core.repository.RestauranteRepository;

@Service
@Transactional
public class RestauranteService {
	
	@Autowired
	private RestauranteRepository repository;
	
	public List<Restaurante> retornaTodos () {
		return repository.findAll();
	}
	
	public Restaurante salvarRestaurante (Restaurante restaurante) {
		return this.repository.saveAndFlush(restaurante);
	}

}

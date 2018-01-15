package br.com.noviapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.noviapp.core.model.Restaurante;


public interface RestauranteRepository extends JpaRepository<Restaurante, Long> { 

}

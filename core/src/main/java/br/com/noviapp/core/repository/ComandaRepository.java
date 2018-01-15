package br.com.noviapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.noviapp.core.model.Comanda;

public interface ComandaRepository extends JpaRepository<Comanda, Long> { 

}

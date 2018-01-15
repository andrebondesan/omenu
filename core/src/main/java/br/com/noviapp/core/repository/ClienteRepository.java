package br.com.noviapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.noviapp.core.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> { 

}

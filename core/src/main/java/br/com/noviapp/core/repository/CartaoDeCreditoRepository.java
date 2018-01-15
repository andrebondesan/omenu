package br.com.noviapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.noviapp.core.model.CartaoDeCredito;

public interface CartaoDeCreditoRepository extends JpaRepository<CartaoDeCredito, Long> { 

}

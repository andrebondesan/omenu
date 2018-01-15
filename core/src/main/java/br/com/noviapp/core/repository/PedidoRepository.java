package br.com.noviapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.noviapp.core.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> { 

}

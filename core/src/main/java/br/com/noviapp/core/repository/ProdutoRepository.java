package br.com.noviapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.noviapp.core.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> { 

}

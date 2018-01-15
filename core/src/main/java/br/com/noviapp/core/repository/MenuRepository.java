package br.com.noviapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.noviapp.core.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> { 

}

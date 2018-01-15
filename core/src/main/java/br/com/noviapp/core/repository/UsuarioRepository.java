package br.com.noviapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.noviapp.core.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> { 

}

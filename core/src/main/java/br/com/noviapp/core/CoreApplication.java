package br.com.noviapp.core;

import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.noviapp.core.model.Restaurante;
import br.com.noviapp.core.repository.RestauranteRepository;

@SpringBootApplication
@EntityScan(basePackages= {"br.com.noviapp.core.model"})
@EnableJpaRepositories(basePackages = {
        "br.com.noviapp.core.repository"
        })
public class CoreApplication {
	
	@Autowired
	private RestauranteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}
	
	@PostConstruct
	@Transactional
	public void onLoad() {
		Restaurante r = new Restaurante();
		r.setBairro("Centro");
		r.setCidade("Sao Jose dos Campos" );
		r.setDataCadastro(Calendar.getInstance().getTime());
		r.setEndereco("Rua Coronel Madeira, 42");
		r.setNome("Churraskilo");
		r.setPais("Brasil");
		this.repository.save(r);
	}
}

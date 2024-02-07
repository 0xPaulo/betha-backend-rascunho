package com.betha.manutencao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.betha.manutencao.model.Cadastro;
import com.betha.manutencao.repository.CadastroRepository;

// import com.betha.manutencao.model.Cadastro;
// import com.betha.manutencao.repository.CadastroRepository;

@SpringBootApplication
public class ManutencaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManutencaoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CadastroRepository cadastroRepository) {
		return args -> {
			cadastroRepository.deleteAll();
			Cadastro c = new Cadastro();
			c.setName("Teste - 1 ");
			c.setDefeito("Bateria fraca");
			cadastroRepository.save(c);

		};

	}
}

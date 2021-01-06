package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.AcessoModel;
import com.example.model.EmpregadoDto;
import com.example.model.EmpregadoModel;

@SpringBootApplication
public class InmetricsApplication {

	/*
	 * Classe responsavel por executar a aplicação
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(InmetricsApplication.class, args);
		//AcessoModel model = new AcessoModel();
			
	}

}

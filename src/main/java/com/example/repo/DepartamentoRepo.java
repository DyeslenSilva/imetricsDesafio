package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.DepartamentoDto;

public interface DepartamentoRepo extends JpaRepository<DepartamentoDto, Integer>{

	/*
	 * Interface responsavel pelo repositorio do Departamento
	 * Nessa interface contem todos os metodos responsaveis pelo
	 * CRUD
	 */
}

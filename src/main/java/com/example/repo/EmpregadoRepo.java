package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.EmpregadoDto;

public interface EmpregadoRepo extends JpaRepository<EmpregadoDto, Integer> {

	EmpregadoDto findOne(Integer idEmpregado);

	/*
	 * Interface responsavel pelo repositorio do Empregado
	 * Nessa interface contem todos os metodos responsaveis
	 * pelo CRUD.
	 */
}

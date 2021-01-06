		package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.EmpregadoDto;
import com.example.repo.EmpregadoRepo;

@Controller
public class EmpregadoController {
		
	@Autowired
	private EmpregadoRepo repoEmp;
	
	//Metodo para cadastrar empregado
	@RequestMapping(value = "/empregado/cadastrar" , method = RequestMethod.POST)
	public EmpregadoDto cadastrar(EmpregadoDto empregado){
		return repoEmp.save(empregado);
	}
	
	//Listar um empregado pelo ID
	@RequestMapping(value = "/empregado/list/{empregadoId}" , method = RequestMethod.GET)
	public Optional<EmpregadoDto> list(@PathVariable Integer idEmp){
		return repoEmp.findById(idEmp);
	}
	
	//Listar todos os empregados
	@RequestMapping(value = "/empregado/list_all" , method = RequestMethod.GET)
	public List<EmpregadoDto> listAllEmpregados(){
		return repoEmp.findAll();
	}
	
	//Metodo para alterar um empregado
	@RequestMapping(value = "/empregado/alterar/{empregadoId}" , method = RequestMethod.PUT)
	public ResponseEntity<EmpregadoDto> alterar(@RequestBody EmpregadoDto dto,
			@PathVariable Integer idEmpregado){
		EmpregadoDto empregadoDto = repoEmp.findOne(idEmpregado);
		if(empregadoDto != null) {
			empregadoDto.setDepartamentoId(dto.getDepartamentoId());
			empregadoDto.setNome(dto.getNome());
			empregadoDto.setCpf(dto.getCpf());
			empregadoDto.setSexo(dto.getSexo());
			empregadoDto.setCargo(dto.getCargo());
			empregadoDto.setSalario(dto.getSalario());
			empregadoDto.setComissao(dto.getComissao());
			empregadoDto.setTipoContratacao(dto.getTipoContratacao());
		
			if(repoEmp.save(empregadoDto).getDepartamentoId().equals(idEmpregado)) {
				return ResponseEntity.ok().build();
			}else {
				return ResponseEntity.badRequest().build();
			}
		}
		return ResponseEntity.ok().build();
	}

	
	//Metodo para apagar um empregado
	@RequestMapping(value = "/empregado/deletar/{empregadoId}\r\n",method = RequestMethod.DELETE)
	public ResponseEntity<EmpregadoDto> deletar(Integer id, EmpregadoDto empDto){
		Optional<EmpregadoDto> dto = repoEmp.findById(id);
		if(dto.isPresent()) {
			repoEmp.delete(empDto);
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
}
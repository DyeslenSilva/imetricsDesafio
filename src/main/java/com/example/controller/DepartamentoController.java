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

import com.example.model.DepartamentoDto;
import com.example.repo.DepartamentoRepo;

@Controller
public class DepartamentoController {

	@Autowired
	private DepartamentoRepo repoDep;
	
	//Metodo para cadastrar departamento
	@RequestMapping(value = "/departamento/cadastrar" , method = RequestMethod.POST)
	public DepartamentoDto cadastrar(DepartamentoDto dep){
		return repoDep.save(dep);
	}
	
	//Metodo para listar todos os departamentos
	@RequestMapping(value = "/departamento/list_all", method = RequestMethod.GET)
	public List<DepartamentoDto> listAllDeptos(){
		return repoDep.findAll();
	}
	
	//Metodo para listar departamento pelo ID
	@RequestMapping(value = "/departamento/list/{departamentoId}" , method = RequestMethod.GET)
	public Optional<DepartamentoDto> list(@PathVariable Integer id){
		return repoDep.findById(id);
	}
	
	
	//Metodo para alterar dados do departamento
	@SuppressWarnings("unlikely-arg-type")
	@RequestMapping(value = "/departamento/alterar/{departamentoId}", method = RequestMethod.POST)
	public ResponseEntity<DepartamentoDto> DepartamentoModel(@RequestBody DepartamentoDto depDto,
			@PathVariable Integer idDepto){
				Optional<DepartamentoDto> deptoDto = repoDep.findById(idDepto);
				if(deptoDto != null) {
					depDto.setNomeDepartamento(depDto.getNomeDepartamento());
					depDto.setLocal(depDto.getLocal());
					depDto.setOrcamento(depDto.getOrcamento());
					
					if(repoDep.save(depDto).getNomeDepartamento().equals(deptoDto)) {
						return ResponseEntity.ok().build();
					}else {
						return ResponseEntity.badRequest().build();
					}
				}
			return ResponseEntity.ok().build();
	}
	
	//Metodo para deletar um departamento
	@RequestMapping(value = "/departamento/deletar/{departamentoId}" , method = RequestMethod.DELETE)
	public ResponseEntity<DepartamentoDto> deletar(Integer id, DepartamentoDto dep){
		Optional<DepartamentoDto> dto = repoDep.findById(id);
		
		if(dto.isPresent()) {
			repoDep.delete(dep);
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
}

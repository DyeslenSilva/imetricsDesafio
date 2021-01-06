package com.example.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.model.EmpregadoDto;
import com.example.model.LoginDto;
import com.example.repo.EmpregadoRepo;

@Controller(value = "acesso-controller")
public class AcessoController {
	
	private EmpregadoRepo repoEmpregado;
	
	@RequestMapping(value = "/empregado",method = RequestMethod.GET)
	public ModelAndView acessoView() {
		return new ModelAndView("empregado");
	}
	
	//Metodo para cadastro de empregados
	@RequestMapping(value ="/acesso/cadastrar", method = RequestMethod.POST)
	public EmpregadoDto cadastrar(EmpregadoDto dto, RedirectAttributes red) {
			return repoEmpregado.save(dto);
	}
	
	//Metodo para listar todos os empregados cadastrados
	@RequestMapping(value = "/acesso/list_all", method = RequestMethod.GET)
	public List<EmpregadoDto> listAllEmpregados() {
		return repoEmpregado.findAll();
	}
	
	//Metodo para listar empregados por Id
	@RequestMapping(value = "/acesso/list/{acessoId}", method = RequestMethod.GET)
	public Optional<EmpregadoDto> list(@PathVariable Integer idEmpregado){
		return repoEmpregado.findById(idEmpregado);
	}
	
	
	//Metodo para alterar um empregado
	@RequestMapping(value = "/acesso/alterar/{acessoId}")
	public ResponseEntity<EmpregadoDto> alterar(@RequestBody EmpregadoDto dto,
			@PathVariable Integer idEmpregado){
		EmpregadoDto empregadoDto = repoEmpregado.findOne(idEmpregado);
		if(empregadoDto != null) {
			empregadoDto.setDepartamentoId(dto.getDepartamentoId());
			empregadoDto.setNome(dto.getNome());
			empregadoDto.setCpf(dto.getCpf());
			empregadoDto.setSexo(dto.getSexo());
			empregadoDto.setCargo(dto.getCargo());
			empregadoDto.setSalario(dto.getSalario());
			empregadoDto.setComissao(dto.getComissao());
			empregadoDto.setTipoContratacao(dto.getTipoContratacao());
		
			if(repoEmpregado.save(empregadoDto).getDepartamentoId().equals(idEmpregado)) {
				return ResponseEntity.ok().build();
			}else {
				return ResponseEntity.badRequest().build();
			}
		}
		return ResponseEntity.ok().build();
	}

	//Metodo para um empregado realizar login
	@RequestMapping(value = "/acesso/login" ,method = RequestMethod.GET)
	public ResponseEntity<LoginDto> login(Integer idEmpregado){
		Optional<EmpregadoDto> dto = repoEmpregado.findById(idEmpregado);
		if(dto.isPresent()) {
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	//Metodo para apagar um empregado
	@RequestMapping(value = "/acesso/deletar/{acessoId}" , method = RequestMethod.DELETE)
	public ResponseEntity<EmpregadoDto> deletar(Integer id, EmpregadoDto empregado){
		Optional<EmpregadoDto> dto = repoEmpregado.findById(id);
		
		if(dto.isPresent()) {
			repoEmpregado.delete(empregado);
			return new  ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
}
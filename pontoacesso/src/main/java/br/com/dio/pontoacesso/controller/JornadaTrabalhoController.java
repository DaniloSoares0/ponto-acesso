package br.com.dio.pontoacesso.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.pontoacesso.model.JornadaTrabalho;
import br.com.dio.pontoacesso.service.JornadaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Jornada Trabalho")
@RequestMapping("/api/v1/jornada")
public class JornadaTrabalhoController {

	@Autowired
	private JornadaService jornadaService;

	@ApiOperation(value = "Cria uma jornada.")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public JornadaTrabalho createJornada(@RequestBody @Valid JornadaTrabalho jornadaTrabalho) {
		return jornadaService.save(jornadaTrabalho);
	}

	@GetMapping
	@ApiOperation(value = "Busca todas as jornadas.")
	public List<JornadaTrabalho> getJornadaList(){
		return jornadaService.findAll();
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Busca Jornadas por id.")
	public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("id") Long id) throws Exception {
		return ResponseEntity.ok(jornadaService.getById(id).orElseThrow(() -> new NoSuchElementException("Não encontrado!")));
	}

	@PutMapping
	@ApiOperation(value = "Atualiza uma jornada.")
	public JornadaTrabalho updateJornada(@RequestBody @Valid JornadaTrabalho jornadaTrabalho){
		return jornadaService.update(jornadaTrabalho);
	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta uma jornada.")
	public ResponseEntity deleteByID(@PathVariable("id") Long id) throws Exception {

		try {
			jornadaService.delete(id);
			return ResponseEntity.status(200).build();
		}catch (Exception e){
			e.printStackTrace();
			return ResponseEntity.status(404).build();

		}
	}


}

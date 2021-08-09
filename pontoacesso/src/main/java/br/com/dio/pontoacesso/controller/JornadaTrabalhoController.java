package br.com.dio.pontoacesso.controller;

import java.util.List;
import java.util.NoSuchElementException;

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
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/jornada")
public class JornadaTrabalhoController {

	private JornadaService jornadaService;

	@PostMapping
	public JornadaTrabalho createJornada(JornadaTrabalho JornadaTrabalho) {
		return jornadaService.save(JornadaTrabalho);
	}

	@GetMapping
	public List<JornadaTrabalho> getJornadaList(){
		return jornadaService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<JornadaTrabalho>  getJornadaByID(@PathVariable("id") Long idJornada) throws Exception {
		return  ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));
	}

	@PutMapping
	public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
		return jornadaService.update(jornadaTrabalho);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteByID(@PathVariable("id") Long id) throws Exception {

		try {
			jornadaService.delete(id);
		}catch (Exception e){
			e.printStackTrace();
		}

		return ResponseEntity.ok(null);

	}


}

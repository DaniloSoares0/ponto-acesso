package br.com.dio.pontoacesso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.dio.pontoacesso.model.JornadaTrabalho;
import br.com.dio.pontoacesso.repository.JornadaRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JornadaService {

	private JornadaRepository jornadaRepository;

	public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll(){
		return jornadaRepository.findAll();
	}

	public Optional<JornadaTrabalho> getById(Long id) {
		return Optional.of(jornadaRepository.getById(id));
	}

	public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	public void delete(Long id) {
		jornadaRepository.deleteById(id);
	}
}

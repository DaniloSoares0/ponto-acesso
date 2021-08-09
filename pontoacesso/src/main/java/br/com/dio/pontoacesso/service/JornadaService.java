package br.com.dio.pontoacesso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.pontoacesso.model.JornadaTrabalho;
import br.com.dio.pontoacesso.repository.JornadaRepository;

@Service
public class JornadaService {
	
	@Autowired
	private JornadaRepository jornadaRepository;

	public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll(){
		return jornadaRepository.findAll();
	}

	public Optional<JornadaTrabalho> getById(Long id) {
		return jornadaRepository.findById(id);
	}

	public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	public void delete(Long id) {
		jornadaRepository.deleteById(id);
	}
}

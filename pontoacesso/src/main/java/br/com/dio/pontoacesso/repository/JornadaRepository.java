package br.com.dio.pontoacesso.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.pontoacesso.model.JornadaTrabalho;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

	 Optional<JornadaTrabalho> findByDescricao(String descricao);
}

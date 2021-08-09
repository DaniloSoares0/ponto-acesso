package br.com.dio.pontoacesso.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movimentacao")
public class Movimentacao {

    @EmbeddedId
	private MovimentacaoId id;
	
	@Column(name ="data_entrada")
	private LocalDateTime dataEntrada;
	
	@Column(name ="data_saida")
	private LocalDateTime dataSaida;

	@Column(name ="periodo")
	private BigDecimal periodo;
	
	private Ocorrencia ocorrencia;
	
	private Calendario calendario;
	
	

	@Embeddable
	@EqualsAndHashCode
	@NoArgsConstructor
	@AllArgsConstructor
	public class MovimentacaoId implements Serializable{

		private static final long serialVersionUID = -9052362453984631147L;

		@Column(name ="id_movimento")
		private Long idMovimento;

		@Column(name ="id_usuario")
		private Long idUsuario;
	}
}

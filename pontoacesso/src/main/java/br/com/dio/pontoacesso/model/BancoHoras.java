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
@Table(name = "banco_horas")
public class BancoHoras {

	@EmbeddedId
	private BancoHorasId bancoHorasid;
	
	private LocalDateTime dataTrabalhada;
	
	private BigDecimal quantidadeHorasTrab;
	
	private BigDecimal saldoHorasTrab;
	

	@Embeddable
	@EqualsAndHashCode
	@NoArgsConstructor
	@AllArgsConstructor
	public class BancoHorasId implements Serializable {

		private static final long serialVersionUID = 8750607140169081828L;

		@Column(name ="banco_horas_id")
		private Long bancoHorasId;

		@Column(name ="movimentacao_id")
		private Long movimentacaoId;

		@Column(name ="usuario_id")
		private Long usuarioId;
	
	}
}

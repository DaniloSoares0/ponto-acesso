package br.com.dio.pontoacesso.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@Builder
@Audited
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 7105520373580248257L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="nome")
	private String nome;
	
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	
	@ManyToOne
	private Empresa empresa;
	
	@ManyToOne
	private NivelAcesso nivelAcesso;
	
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;
	
	@Column(name ="tolerancia")
	private BigDecimal tolerancia;
	
	@Column(name ="inicio_jornada")
	private LocalDateTime inicioJornada;
	
	@Column(name ="final_jornada")
	private LocalDateTime finalJornada;

}

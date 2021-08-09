package br.com.dio.pontoacesso.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name = "calendario")
public class Calendario implements Serializable {

	private static final long serialVersionUID = 3630839376382811075L;

	@Id
	private Long id;
	@ManyToOne
	
	private TipoData tipoData;
	
	@Column(name ="descricao")
	private String descricao;
	
	@Column(name ="dataEspecial")
	private LocalDateTime dataEspecial;
}

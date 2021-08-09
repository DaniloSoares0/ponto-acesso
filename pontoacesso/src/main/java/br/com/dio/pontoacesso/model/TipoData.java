package br.com.dio.pontoacesso.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tipo_data")
public class TipoData implements Serializable {

	private static final long serialVersionUID = -2841574020334473929L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private TipoData tipoData;
	
	@Column(name ="descricao")
	private String descricao;
	
	@Column(name ="data_especial")
	private LocalDateTime dataEspecial;
}

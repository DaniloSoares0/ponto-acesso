package br.com.dio.pontoacesso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Audited
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jornada_trabalho")
public class JornadaTrabalho implements Serializable {

	private static final long serialVersionUID = -4403940595957836608L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name ="descricao")
	private String descricao;

}

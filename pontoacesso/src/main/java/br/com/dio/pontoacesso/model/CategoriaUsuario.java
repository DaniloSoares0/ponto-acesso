package br.com.dio.pontoacesso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "categoria_usuario")
public class CategoriaUsuario implements Serializable {

	private static final long serialVersionUID = -8209513203063450500L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="descricao")
	private String descricao;
}

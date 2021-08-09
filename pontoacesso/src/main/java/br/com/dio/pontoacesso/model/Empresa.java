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
@Table(name = "empresa")
public class Empresa implements Serializable{

	private static final long serialVersionUID = 1678733152843458595L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name ="descricao")
	private String descricao;

	@Column(name ="cnpj")
	private String cnpj;

	@Column(name ="endereco")
	private String endereco;

	@Column(name ="bairro")
	private String bairro;

	@Column(name ="cidade")
	private String cidade;

	@Column(name ="estado")
	private String estado;

	@Column(name ="telefone")
	private String telefone;
}

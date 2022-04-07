package br.com.flettieri.tokiomarineservice.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EntidadeBase implements Serializable {

	private static final long serialVersionUID = -6244844540488460447L;

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;

	@Column(name = "data_atualizacao")
	private LocalDateTime dataAtualizacao;
	
	@Column(name = "data_desativacao")
	private LocalDateTime dataDesativacao;
	
	@PrePersist
	private void prePersistEntidade() {
		this.setDataCriacao(LocalDateTime.now());
	}
	
	@PreUpdate
	private void preUpdateEntidade() {
		this.setDataAtualizacao(LocalDateTime.now());
	}
}

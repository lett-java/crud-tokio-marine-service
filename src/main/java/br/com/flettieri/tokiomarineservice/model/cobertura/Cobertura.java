package br.com.flettieri.tokiomarineservice.model.cobertura;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.flettieri.tokiomarineservice.model.EntidadeBase;
import br.com.flettieri.tokiomarineservice.model.seguro.Seguro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cobertura")
@DiscriminatorColumn(name = "tipo_cobertura", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cobertura extends EntidadeBase {
	
	private static final long serialVersionUID = 8509542674935850419L;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "fator_peso")
	private float fatorPeso;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "seguro_id",
			foreignKey = @ForeignKey(name = "fk_cobertura_seguro"))
	private Seguro seguro;
}

package br.com.flettieri.tokiomarineservice.model.seguro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.flettieri.tokiomarineservice.model.EntidadeBase;
import br.com.flettieri.tokiomarineservice.model.cliente.Cliente;
import br.com.flettieri.tokiomarineservice.model.cobertura.Cobertura;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seguro")
@DiscriminatorColumn(name = "tipo_seguro", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Seguro extends EntidadeBase {

	private static final long serialVersionUID = 8509542674935850419L;

	@Column(name = "valor")
	private BigDecimal valor;

	@OneToMany(mappedBy = "seguro")
	private List<Cobertura> coberturas = new ArrayList<Cobertura>();

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "cliente_id",
			foreignKey = @ForeignKey(name = "fk_seguro_cliente"))
	private Cliente cliente;
	
	@PrePersist
	public void calculaValorContratado() {
		
	}
}
















package br.com.flettieri.tokiomarineservice.model.cliente;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.flettieri.tokiomarineservice.model.EntidadeBase;
import br.com.flettieri.tokiomarineservice.model.seguro.Seguro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cliente")
@DiscriminatorColumn(name = "tipo_cliente", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cliente extends EntidadeBase {

	private static final long serialVersionUID = 338931228521362030L;

	@Column(name = "nome")
	private String nome;
	
	@OneToMany(mappedBy = "cliente")
	private List<Seguro> seguros = new ArrayList<Seguro>();
}

package br.com.flettieri.tokiomarineservice.model.seguro;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("Automovel")
public class SeguroAutomovel extends Seguro {

	private static final long serialVersionUID = -3609844342250055668L;
	
	
}

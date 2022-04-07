package br.com.flettieri.tokiomarineservice.model.cobertura;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("Roubo")
public class CoberturaRoubo extends Cobertura {

	private static final long serialVersionUID = -3609844342250055668L;
	
	
}

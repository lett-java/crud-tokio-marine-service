package br.com.flettieri.tokiomarineservice.model.seguro;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("Residencial")
@AllArgsConstructor
public class SeguroResidencial extends Seguro {

	private static final long serialVersionUID = -3609844342250055668L;
	
	
}

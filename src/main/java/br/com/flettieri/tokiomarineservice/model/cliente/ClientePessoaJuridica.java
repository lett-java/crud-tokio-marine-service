package br.com.flettieri.tokiomarineservice.model.cliente;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("PessoaJuridica")
public class ClientePessoaJuridica extends Cliente {

	private static final long serialVersionUID = -6726646431610885922L;
	
	@Column(name = "cnpj")
	private String cnpj;

	
	
}

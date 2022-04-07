package br.com.flettieri.tokiomarineservice.enums;

import lombok.Getter;

@Getter
public enum TipoDocumentoEnum {

	CPF("Cpf"),
	CNPJ("Cnpj");
	
	private String descricao;
	
	TipoDocumentoEnum(String descricao) {
		this.descricao = descricao;
	}
	
}

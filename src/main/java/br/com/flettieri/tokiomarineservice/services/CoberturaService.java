package br.com.flettieri.tokiomarineservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flettieri.tokiomarineservice.model.cobertura.Cobertura;
import br.com.flettieri.tokiomarineservice.repositories.CoberturaRepository;

@Service
public class CoberturaService {

	@Autowired
	private CoberturaRepository coberturaRepository;

	public Cobertura salvar(Cobertura cobertura) {
		return coberturaRepository.save(cobertura);
	}
}

package br.com.flettieri.tokiomarineservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flettieri.tokiomarineservice.model.cliente.Cliente;
import br.com.flettieri.tokiomarineservice.model.seguro.Seguro;
import br.com.flettieri.tokiomarineservice.repositories.SeguroRepository;

@Service
public class SeguroService {

	@Autowired
	private SeguroRepository seguroRepository;

	public Seguro salvar(Seguro seguro, Long clienteId) {
		seguro.setCliente(new Cliente());
		
		seguro.getCliente().setId(clienteId);
		
		return seguroRepository.save(seguro);
	}
}

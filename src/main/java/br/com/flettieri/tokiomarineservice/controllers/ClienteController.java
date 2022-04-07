package br.com.flettieri.tokiomarineservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flettieri.tokiomarineservice.model.cliente.Cliente;
import br.com.flettieri.tokiomarineservice.model.cliente.ClientePessoaFisica;
import br.com.flettieri.tokiomarineservice.model.cliente.ClientePessoaJuridica;
import br.com.flettieri.tokiomarineservice.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/salvar-pessoa-fisica")
	public ResponseEntity<Cliente> salvarClientePF(@RequestBody ClientePessoaFisica cliente){
		return ResponseEntity.ok().body(clienteService.salvar(cliente));
	}

	@PostMapping("/salvar-pessoa-juridica")
	public ResponseEntity<Cliente> salvarClientePJ(@RequestBody ClientePessoaJuridica cliente){
		return ResponseEntity.ok().body(clienteService.salvar(cliente));
	}
	
}

package br.com.flettieri.tokiomarineservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flettieri.tokiomarineservice.model.cobertura.Cobertura;
import br.com.flettieri.tokiomarineservice.model.cobertura.CoberturaDanosPessoais;
import br.com.flettieri.tokiomarineservice.model.cobertura.CoberturaIncendio;
import br.com.flettieri.tokiomarineservice.model.cobertura.CoberturaRoubo;
import br.com.flettieri.tokiomarineservice.services.CoberturaService;

@RestController
@RequestMapping("/cobertura")
public class CoberturaController {

	@Autowired
	private CoberturaService coberturaService;
	
	@PostMapping("/salvar-danos-pessoais")
	public ResponseEntity<Cobertura> salvarCoberturaDanosPessoais(@RequestBody CoberturaDanosPessoais cobertura){
		return ResponseEntity.ok().body(coberturaService.salvar(cobertura));
	}

	@PostMapping("/salvar-incendio")
	public ResponseEntity<Cobertura> salvarCoberturaIncendio(@RequestBody CoberturaIncendio cobertura){
		return ResponseEntity.ok().body(coberturaService.salvar(cobertura));
	}
	
	@PostMapping("/salvar-Roubo")
	public ResponseEntity<Cobertura> salvarCoberturaRoubo(@RequestBody CoberturaRoubo cobertura){
		return ResponseEntity.ok().body(coberturaService.salvar(cobertura));
	}
	
}

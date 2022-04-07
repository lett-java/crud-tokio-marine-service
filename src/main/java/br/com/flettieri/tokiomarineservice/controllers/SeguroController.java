package br.com.flettieri.tokiomarineservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flettieri.tokiomarineservice.model.seguro.Seguro;
import br.com.flettieri.tokiomarineservice.services.SeguroService;

@RestController
@RequestMapping("/seguro")
public class SeguroController {

	@Autowired
	private SeguroService seguroService;
	
	@PostMapping("/salvar")
	public ResponseEntity<Seguro> salvarProposta(@RequestBody Seguro seguro){
		return ResponseEntity.ok().body(seguroService.salvar(seguro));
	}
	
}

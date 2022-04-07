package br.com.flettieri.tokiomarineservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.flettieri.tokiomarineservice.model.cobertura.Cobertura;

@Repository
public interface CoberturaRepository extends JpaRepository<Cobertura, Long> {

}

package br.com.flettieri.tokiomarineservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.flettieri.tokiomarineservice.model.seguro.Seguro;

@Repository
public interface SeguroRepository extends JpaRepository<Seguro, Long>{

}

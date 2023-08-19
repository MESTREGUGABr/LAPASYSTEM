package br.edu.ufape.poo.lapa.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.lapa.negocio.basico.Animal;

@Repository
public interface InterfaceColecaoAnimal extends JpaRepository<Animal , Long>{

}

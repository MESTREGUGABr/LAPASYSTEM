package br.edu.ufape.poo.lapa.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;

@Repository
public interface InterfaceColecaoVeterinario extends JpaRepository <Veterinario, Long> {

}

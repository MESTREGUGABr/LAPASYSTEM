package br.edu.ufape.poo.lapa.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;

@Repository
public interface InterfaceColecaoVeterinario extends JpaRepository <Veterinario, Long> {

	Veterinario findByEmail(String email);

	List<Veterinario> findByNome(String nome);
}

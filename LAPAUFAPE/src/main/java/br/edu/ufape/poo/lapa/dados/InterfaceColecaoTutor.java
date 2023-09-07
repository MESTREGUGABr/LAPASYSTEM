package br.edu.ufape.poo.lapa.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.lapa.negocio.basico.Tutor;

@Repository
public interface InterfaceColecaoTutor extends JpaRepository<Tutor, Long>{
	
	Tutor findByEmail(String email);

	List<Tutor> findByNome(String nome);

}

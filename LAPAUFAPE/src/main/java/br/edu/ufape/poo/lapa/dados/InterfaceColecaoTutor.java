package br.edu.ufape.poo.lapa.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.lapa.negocio.basico.Tutor;

@Repository
public interface InterfaceColecaoTutor extends JpaRepository<Tutor, Long>{
	
	public Tutor findByEmail(String email);

}

package br.edu.ufape.poo.lapa.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.lapa.negocio.basico.ParteNecropsia;

@Repository
public interface InterfaceColecaoParteNecropsia extends JpaRepository <ParteNecropsia, Long>{

}

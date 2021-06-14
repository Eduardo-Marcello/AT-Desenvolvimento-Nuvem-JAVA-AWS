package br.edu.infnet.Dr4AT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.Dr4AT.negocio.Cotacao;

@Repository
public interface ICotacaoRepository extends JpaRepository<Cotacao, Integer> {
	
}

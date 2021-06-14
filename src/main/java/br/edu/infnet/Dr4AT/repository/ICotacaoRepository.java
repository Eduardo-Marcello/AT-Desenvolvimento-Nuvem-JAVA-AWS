package br.edu.infnet.Dr4AT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.infnet.Dr4AT.negocio.Cotacao;

@Repository
public interface ICotacaoRepository extends JpaRepository<Cotacao, Integer> {
	
	@Query(value = "SELECT c FROM Cotacao c WHERE c.produto.getId LIKE '%' || :keyword || '%'")
    public Cotacao searchList(@Param("keyword") Integer keyword);
}

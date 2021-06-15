package br.edu.infnet.Dr4AT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.infnet.Dr4AT.negocio.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Short> {
	@Query(value = "SELECT p FROM Produto p WHERE p.nomeProduto LIKE '%' || :keyword || '%'")
    public Produto search(@Param("keyword") String keyword);
	public List<Produto> findCotacoes();

}

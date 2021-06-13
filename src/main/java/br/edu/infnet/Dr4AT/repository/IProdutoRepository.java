package br.edu.infnet.Dr4AT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.Dr4AT.negocio.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {

}

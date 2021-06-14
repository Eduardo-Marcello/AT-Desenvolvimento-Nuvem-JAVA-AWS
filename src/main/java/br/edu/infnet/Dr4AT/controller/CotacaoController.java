package br.edu.infnet.Dr4AT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.Dr4AT.negocio.Cotacao;
import br.edu.infnet.Dr4AT.negocio.Produto;
import br.edu.infnet.Dr4AT.service.AmazonClient;
import br.edu.infnet.Dr4AT.service.CotacaoService;
import br.edu.infnet.Dr4AT.service.ProdutoService;

@RestController
public class CotacaoController {
	
	@Autowired
	private CotacaoService cotacaoService;
	
	@Autowired
	private ProdutoService produtoService;
	private AmazonClient amazonClient;
	Produto produto = new Produto();

	@Autowired
	public CotacaoController(CotacaoService cotacaoService, AmazonClient amazonClient) {
		this.cotacaoService = cotacaoService;
		this.amazonClient = amazonClient;
	}
	
	@PostMapping("/registraCotacao")
	Cotacao registra(Double preco, String keyword) {
		return cotacaoService.registra(preco, produto);
	}
	
	@PostMapping("/ListCotacoes")
	List<Cotacao> findList(String keyword) {
		List<Cotacao> c = cotacaoService.findCotacoes(keyword);
		return c;
	}
	
	@DeleteMapping(value = "/deletaCotacao/{id}")
	public void excluir(@PathVariable Integer id) {
		cotacaoService.excluir(id);	
	}
}

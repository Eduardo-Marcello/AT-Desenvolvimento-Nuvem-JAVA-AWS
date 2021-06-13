package br.edu.infnet.Dr4AT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.Dr4AT.negocio.Produto;
import br.edu.infnet.Dr4AT.service.AmazonClient;
import br.edu.infnet.Dr4AT.service.ProdutoService;

@RestController
public class ProdutoController {

	private ProdutoService produtoService;
	private AmazonClient amazonClient;

	@Autowired
	public ProdutoController(ProdutoService produtoService, AmazonClient amazonClient) {
		this.produtoService= produtoService;
		this.amazonClient = amazonClient;
	}
	
	@PostMapping("/registraProduto")
	Produto registra(int codigoProduto, String nomeProduto, String classificacao) {
		return produtoService.registra(codigoProduto,nomeProduto,classificacao);
	}
	
	@DeleteMapping(value = "/deletaProduto/{id}")
	public void excluir(@PathVariable Integer id) {
		produtoService.excluir(id);	
	}
	
}

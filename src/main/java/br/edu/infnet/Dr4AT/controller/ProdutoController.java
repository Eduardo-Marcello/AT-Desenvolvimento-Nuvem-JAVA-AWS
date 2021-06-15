package br.edu.infnet.Dr4AT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.Dr4AT.negocio.Produto;
import br.edu.infnet.Dr4AT.service.AmazonClient;
import br.edu.infnet.Dr4AT.service.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	private AmazonClient amazonClient;

	@Autowired
	public ProdutoController(ProdutoService produtoService, AmazonClient amazonClient) {
		this.produtoService= produtoService;
		this.amazonClient = amazonClient;
	}
	
	@PostMapping("/registraProduto")
	public Produto registra(int codigoProduto, String nomeProduto, String classificacao) {
		return produtoService.registra(codigoProduto,nomeProduto,classificacao);
	}
	
	@PostMapping("/ListaCotacoes")
	public List<Produto> listagemCotacoes(){
		
		return produtoService.findListagem();
	}
	
	@DeleteMapping(value = "/deletaProduto/{id}")
	public void excluir(@PathVariable Short id) {
		produtoService.excluir(id);	
	}
	
}

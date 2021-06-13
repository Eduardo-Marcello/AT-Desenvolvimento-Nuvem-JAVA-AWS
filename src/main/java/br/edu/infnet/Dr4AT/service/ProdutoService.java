package br.edu.infnet.Dr4AT.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.Dr4AT.negocio.Produto;
import br.edu.infnet.Dr4AT.repository.IProdutoRepository;

@Service
public class ProdutoService {

		private IProdutoRepository pr;
		
		public ProdutoService(IProdutoRepository pr) {
	        this.pr = pr;
	    }
		
		public Produto registra(int codigoProduto, String nomeProduto, String classificacao) {
			Produto produto = new Produto(codigoProduto, nomeProduto, classificacao);
			return this.pr.save(produto);
		}
		
		public void excluir(Integer id) {
			this.pr.deleteById(id);
		}
		
}

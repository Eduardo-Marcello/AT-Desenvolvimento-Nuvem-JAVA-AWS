package br.edu.infnet.Dr4AT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.Dr4AT.negocio.Produto;
import br.edu.infnet.Dr4AT.repository.IProdutoRepository;

@Service
public class ProdutoService {
	
		@Autowired
		private IProdutoRepository pr;
		
		public ProdutoService(IProdutoRepository pr) {
	        this.pr = pr;
	    }
		
		public Produto registra(int codigoProduto, String nomeProduto, String classificacao) {
			Produto produto = new Produto(codigoProduto, nomeProduto, classificacao);
			return this.pr.save(produto);
		}
		
		public Produto findByKeyword(String keyword) {
			return pr.search(keyword);
		}
		
		public Integer findIdByKeyword(String keyword) {
			return pr.search(keyword).getId();
		}
		
		public void excluir(Integer id) {
			this.pr.deleteById(id);
		}
		
}

package br.edu.infnet.Dr4AT.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.Dr4AT.negocio.Cotacao;
import br.edu.infnet.Dr4AT.negocio.Produto;
import br.edu.infnet.Dr4AT.repository.ICotacaoRepository;

@Service
public class CotacaoService {
	
	@Autowired
	private ICotacaoRepository cr;
	@Autowired
	ProdutoService ps;
	
	public CotacaoService(ICotacaoRepository cr) {
        this.cr = cr;
    }
	
	public Cotacao registra(Double preco, Produto produto) {
		Cotacao cotacao = new Cotacao(preco, produto);
		return this.cr.save(cotacao);
	}
	
	public void excluir(Short id) {
		this.cr.deleteById(id);
	}

	public List<Cotacao> findCotacoes(String keyword) {
		List<Cotacao> cotacoes = new ArrayList<Cotacao>();
		List<Cotacao> c = cr.findAll();
		for(Cotacao cos: c) {
			if(cos.getProduto().getIdProduto() == ps.findIdByKeyword(keyword)) {
				cotacoes.add(cos) ;
			}
		}
		return cotacoes;
	}
	
}

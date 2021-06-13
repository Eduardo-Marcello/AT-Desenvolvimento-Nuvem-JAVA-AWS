package br.edu.infnet.Dr4AT.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
	private Integer id;
	private int codigoProduto;
	private String nomeProduto;
	private String classificacao;
	
	public Produto() {
		
	}
	
	public Produto(int codigoProduto, String nomeProduto, String classificacao) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.classificacao = classificacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public String toString() {
		return "Produtos [id=" + id + ", codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto
				+ ", classificacao=" + classificacao + "]";
	}
	
	
}

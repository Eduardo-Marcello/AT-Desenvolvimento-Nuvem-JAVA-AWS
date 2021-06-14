package br.edu.infnet.Dr4AT.negocio;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Integer id;
	@Column(name = "codigo_produto")
	private int codigoProduto;
	@Column(name = "nome_produto")
	private String nomeProduto;
	@Column(name = "classificacao")
	private String classificacao;

	@OneToMany(mappedBy = "produto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Cotacao> cotacoes;

	public Set<Cotacao> getEmails() {
		return cotacoes;
	}

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

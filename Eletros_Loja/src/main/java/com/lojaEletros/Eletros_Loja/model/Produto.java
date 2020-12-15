package com.lojaEletros.Eletros_Loja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long produtoId;

	@NotBlank
	@Size(min=2, max=50)
	private String nome;
	
	@NotNull
	private double preco;
	
	@NotNull
	@Min(0)
	private int quantidade;
	
	@NotBlank
	@Size(min=2, max=50)
	private String marca;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produtoModel")
	private Categoria categoriaModel;
	
	@ManyToOne
	@JsonIgnoreProperties("produtoModel")
	private TipoEletro tipoEletroModel;
	
	
	public long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(long produtoId) {
		this.produtoId = produtoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Categoria getCategoriaModel() {
		return categoriaModel;
	}

	public void setCategoriaModel(Categoria categoriaModel) {
		this.categoriaModel = categoriaModel;
	}

	public TipoEletro getTipoEletroObj() {
		return tipoEletroModel;
	}

	public void setTipoEletroObj(TipoEletro tipoEletroModel) {
		this.tipoEletroModel = tipoEletroModel;
	}
}

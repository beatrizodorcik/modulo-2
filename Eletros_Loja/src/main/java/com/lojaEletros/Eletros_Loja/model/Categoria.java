package com.lojaEletros.Eletros_Loja.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long categoriaId;
	
	@NotBlank
	@Size(min=2, max=50)
	@Column(name="descricao")
	private String categoriaDescricao;
	
	
	@OneToMany(mappedBy="categoriaModel", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("categoriaModel")
	private List<Produto> produtoModel;
	

	public long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getCategoriaDescricao() {
		return categoriaDescricao;
	}

	public void setCategoriaDescricao(String categoriaDescricao) {
		this.categoriaDescricao = categoriaDescricao;
	}

	public List<Produto> getProdutoModel() {
		return produtoModel;
	}

	public void setProdutoModel(List<Produto> produtoModel) {
		this.produtoModel = produtoModel;
	}
}

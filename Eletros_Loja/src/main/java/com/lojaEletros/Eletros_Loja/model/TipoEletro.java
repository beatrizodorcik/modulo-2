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
@Table(name="tb_tipoeletro")
public class TipoEletro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@Size(min=2, max=150)
	private String descricao;
	
	@NotNull
	@Column(name = "disponivel")
	private boolean ativo;
	

	@OneToMany(mappedBy="tipoEletroModel", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("tipoEletroModel")
	private List<Produto> produtoModel;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<Produto> getProdutoModel() {
		return produtoModel;
	}

	public void setProdutoObj(List<Produto> produtoModel) {
		this.produtoModel = produtoModel;
	}
}

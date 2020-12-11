package com.Escola.minhaEscola.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_alunos")
public class Alunos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	
	@OneToMany(mappedBy = "alunos", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("alunos")
	private List<Turma> turma;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}

}

package com.Escola.minhaEscola.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "turma")
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 30)
	private String turma;
	
	@NotNull
	private boolean ativo;
	
	@ManyToOne
	@JsonIgnoreProperties("turma")
	private Alunos alunos;

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTurma() {
		return turma;
	}


	public void setTurma(String turma) {
		this.turma = turma;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public Alunos getAlunos() {
		return alunos;
	}


	public void setAlunos(Alunos alunos) {
		this.alunos = alunos;
	}

	
}

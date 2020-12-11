package com.Escola.minhaEscola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Escola.minhaEscola.model.Alunos;

public interface AlunosRepository extends JpaRepository<Alunos, Long>{
	public List<Alunos> findAllByNomeContainingIgnoreCase(String nome);

}

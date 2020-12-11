package com.farmacia.ecommercefarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.ecommercefarmacia.model.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long>{
	public List<Produtos> findAllByDescricaoContainigIgnoreCase(String descricao);

}

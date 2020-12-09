package com.farmacia.ecommercefarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.ecommercefarmacia.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public static final List<Categoria> findAllByCategoria = null;

}

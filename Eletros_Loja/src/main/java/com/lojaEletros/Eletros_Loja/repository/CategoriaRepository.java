package com.lojaEletros.Eletros_Loja.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.lojaEletros.Eletros_Loja.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}

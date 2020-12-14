package com.lojaEletros.Eletros_Loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lojaEletros.Eletros_Loja.model.TipoEletro;

@Repository
public interface TipoEletroRepository extends JpaRepository<TipoEletro, Long> {
	public List<TipoEletro> findAllByIdTipoEletro = null;

}

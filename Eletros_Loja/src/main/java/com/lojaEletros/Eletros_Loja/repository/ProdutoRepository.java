package com.lojaEletros.Eletros_Loja.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lojaEletros.Eletros_Loja.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	@Query (value="select * from tb_produto where preco > :valor1 and preco < :valor2", nativeQuery=true)
	public List<Produto> RangePreco(@Param("valor1") double valor1, @Param("valor2") double valor2);
	
	@Query (value="select * from tb_produto where tipo_eletro_obj_id = :tipoId and preco <= :valor", nativeQuery=true)
	public List<Produto> RangePrecoTipo(@Param("tipoId") int tipoId, @Param("valor") double valor);
}

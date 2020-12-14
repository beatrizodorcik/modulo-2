package com.lojaEletros.Eletros_Loja.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lojaEletros.Eletros_Loja.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	public List<Produto> findByPreco(double preco);

}

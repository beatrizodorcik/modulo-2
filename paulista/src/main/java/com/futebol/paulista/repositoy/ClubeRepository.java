package com.futebol.paulista.repositoy;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.futebol.paulista.model.Clube;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClubeRepository extends JpaRepository<Clube, Long> {
	public List<Clube> findAllByNomeContainingIgnoreCase(String nome);

}

package com.futebol.paulista.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.futebol.paulista.model.Times;

@Repository
public interface TimesRepository extends JpaRepository<Times, Long> {
	public List<Times> findAllByTimesContainingIgnoreCase (String divisao);

}

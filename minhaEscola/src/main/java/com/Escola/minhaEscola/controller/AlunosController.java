package com.Escola.minhaEscola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Escola.minhaEscola.model.Alunos;
import com.Escola.minhaEscola.repository.AlunosRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/alunos")
public class AlunosController {
	
	@Autowired
	private AlunosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Alunos>> getAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Alunos> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Alunos> post (@RequestBody Alunos alunos){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(alunos));
	}
	
	@PutMapping
	public ResponseEntity<Alunos> put (@RequestBody Alunos alunos){
		return ResponseEntity.ok(repository.save(alunos));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}

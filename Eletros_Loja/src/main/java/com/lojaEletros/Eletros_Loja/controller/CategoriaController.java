package com.lojaEletros.Eletros_Loja.controller;

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
import com.lojaEletros.Eletros_Loja.model.Categoria;
import com.lojaEletros.Eletros_Loja.repository.CategoriaRepository;


@RestController
@RequestMapping("/categoria")
@CrossOrigin(value="*", allowedHeaders="*")
public class CategoriaController {
	@Autowired
	private CategoriaRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> Todos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{categoriaId}")
	public ResponseEntity<Categoria> PorID(@PathVariable long categoriaId){
		return repositorio.findById(categoriaId).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.badRequest().build());
	}

	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(post));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put (@RequestBody Categoria put){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(repositorio.save(put));
	}
	
	@DeleteMapping("/{categoriaId}")
	public void DeletePorId(@PathVariable long categoriaId){
		repositorio.deleteById(categoriaId);
	}
}
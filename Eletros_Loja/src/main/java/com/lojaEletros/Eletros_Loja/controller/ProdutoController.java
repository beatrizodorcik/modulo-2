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

import com.lojaEletros.Eletros_Loja.model.Produto;
import com.lojaEletros.Eletros_Loja.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(value="*", allowedHeaders="*")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Produto>> Todos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{produtoId}")
	public ResponseEntity<Produto> PorId(@PathVariable long produtoId){
		return repositorio.findById(produtoId).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.badRequest().build());
	}
	
	@GetMapping("/porRange/{valor1}/{valor2}")
	public ResponseEntity<List<Produto>> TodosRange(@PathVariable double valor1, @PathVariable double valor2){
		return ResponseEntity.ok(repositorio.RangePreco(valor1, valor2));
	}
	
	@GetMapping("/porTipo/{tipoId}/{valor}")
	public ResponseEntity<List<Produto>> TodosRangeTipo(@PathVariable int tipoId, @PathVariable double valor){
		return ResponseEntity.ok(repositorio.RangePrecoTipo(tipoId, valor));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post (@RequestBody Produto post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(post));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto put){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(repositorio.save(put));
	}
	
	@DeleteMapping("/{produtoId}")
	public void DeletarPorId(@PathVariable long produtoId) {
		repositorio.deleteById(produtoId);
	}
}
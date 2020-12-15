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

import com.lojaEletros.Eletros_Loja.model.TipoEletro;
import com.lojaEletros.Eletros_Loja.repository.TipoEletroRepository;


@RestController
@RequestMapping("/tipo")
@CrossOrigin(value="*", allowedHeaders="*")
public class TipoEletroController {
	@Autowired
	private TipoEletroRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<TipoEletro>> Todos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoEletro> PegarPorID(@PathVariable int id){
		return repositorio.findById((long) id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.badRequest().build());
	}
	
	@PostMapping
	public ResponseEntity<TipoEletro> post (@RequestBody TipoEletro post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(post));
	}
	
	@PutMapping
	public ResponseEntity<TipoEletro> put (@RequestBody TipoEletro put){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(repositorio.save(put));
	}

	@DeleteMapping("/{id}")
	public void DeletarPorID(@PathVariable int id) {
		repositorio.deleteById((long) id);
	}
}

package com.softskillsgeneration.softskills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/soft")
public class SoftController {
	
	@GetMapping
	public String softskills() {
		return "Habilidades e Mentalidades aprimoradas no aprendizado de Spring Boot";
	}
	

	@GetMapping("/habilidade1")
	public String hab1() {
		return "Uma das habilidades que desenvolvi ao aprender e aplicar os conhecimentos de Spring Boot foi a Comunicação, uma vez que pedi ajuda aos amigos da GenBr - Turma 13 para entender conceitos que tinham ficados abertos na minha mente (eles são demais e excelentes professores <3";
	}
	
	@GetMapping("/habilidade2")
	public String hab2() {
		return "Outra habilidade desenvolvida foi a de Atenção aos Detalhes, já que assim como em qualquer aprendizado, se atentar aos detalhes ajuda e é necessário para entender e evitar erros de sintaxe";
	}
	
	@GetMapping("/mentalidade1")
	public String ment1() {
		return "Uma das mentalidades desenvolvidas ao aprender e praticar Spring Boot foi a de Responsabilidade Pessoal, pelo fato de entender que é um conhecimento necessário para minha formação e que preciso me desenvolver e aprender de fato";
	}
	
	@GetMapping("/mentalidade2")
	public String ment2() {
		return "E outra mentalidade desenvolvida foi a de Persistência, pois é preciso e muita para conectar os assuntos e entender o motivo de consolidar bem o conhecimento para gerar um projeto completo ao final do curso!";
	}	
}


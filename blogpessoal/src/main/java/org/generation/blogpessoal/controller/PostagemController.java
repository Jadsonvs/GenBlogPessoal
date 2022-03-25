package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Informar ao Spring que essa é uma classe Repository
@RequestMapping("/postagens") //Informaar por qual uri essa classe será acessada
@CrossOrigin //Permitir que nossa classe aceite qualquer tipo de requisição
public class PostagemController {

	@Autowired //Injeção de dependência/ todos os serviços do tipo postagem repository sejam acessados a partir do Controller
	public PostagemRepository repository; // injetar nossa classe Repository dentro da nossa classe Controller
	
	@GetMapping /*Expor para nossa API que esse método trata-se de um GET. Caso venha requisição para o a uri /postagens
	 e o método dessa requisição for o método GET, ele vai disparar o método findAll*/
	public ResponseEntity<List<Postagem>> GetAll() { //método para requisição de todas as postagens. Método findAll
		return ResponseEntity.ok(repository.findAll());
	}
	
}

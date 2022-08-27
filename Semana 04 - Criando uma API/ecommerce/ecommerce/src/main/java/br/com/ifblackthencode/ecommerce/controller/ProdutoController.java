package br.com.ifblackthencode.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifblackthencode.ecommerce.model.Produto;
import br.com.ifblackthencode.ecommerce.services.IProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private IProdutoService service;
	
	@GetMapping("/produtos")
	public ArrayList<Produto> recuperartodoMundo(){
		return service.recuperarTodos();
	}


}

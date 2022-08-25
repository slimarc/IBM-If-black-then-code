package br.com.ifblackthencode.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifblackthencode.exercicio.model.Produto;

@RestController
public class ProdutoController {
	
	// -> recuperando dados
	@GetMapping("/produto") 
	public Produto exibirProduto(){
		Produto p = new Produto();
		p.setId(123123);
		p.setNome("Celular de última geração");
		p.setPreco(3750.00);
		p.setQtdEstoque(7);
		return p;
	}
	
	// -> enviar dados
	// POST
	@PostMapping("/produto")
	public String inserirProduto(@RequestBody Produto p) {
		System.out.println("Recebido "+p.getId()+" - "+p.getNome()+" - "+p.getPreco()+" - "+p.getQtdEstoque());
		return "Produto recebido";
	}
	

}

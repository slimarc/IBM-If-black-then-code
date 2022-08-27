package br.com.ifblackthencode.ecommerce.services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifblackthencode.ecommerce.dao.ProdutoDAO;
import br.com.ifblackthencode.ecommerce.model.Produto;

@Service
public class ProdutoServiceImpl implements IProdutoService{

	@Autowired
	private ProdutoDAO dao;
	
	@Override 
	public ArrayList<Produto> recuperarTodos() {
		return (ArrayList<Produto>)dao.findAll();
	}
	
	@Override
	public Produto recuperarPeloCodigo(Integer codigo) {
		return dao.findById(codigo).orElse(null);
	}
	
	@Override
	public Produto cadastrarNovo(Produto novo) {
		return dao.save(novo);
	}

}

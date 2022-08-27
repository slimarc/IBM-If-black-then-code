package br.com.ifblackthencode.ecommerce.services;

import java.util.ArrayList;

import br.com.ifblackthencode.ecommerce.model.Produto;

public interface IProdutoService {
	public ArrayList<Produto> recuperarTodos();
	public Produto recuperarPeloCodigo(Integer codigo);
	public Produto cadastrarNovo(Produto novo);
}

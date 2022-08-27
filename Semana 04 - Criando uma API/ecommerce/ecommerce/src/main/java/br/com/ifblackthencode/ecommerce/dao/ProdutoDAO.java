package br.com.ifblackthencode.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ifblackthencode.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{

}

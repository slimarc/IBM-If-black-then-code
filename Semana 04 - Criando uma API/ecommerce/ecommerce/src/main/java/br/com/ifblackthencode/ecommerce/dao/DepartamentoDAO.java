package br.com.ifblackthencode.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ifblackthencode.ecommerce.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

}

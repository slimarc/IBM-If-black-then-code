package br.com.ifblackthencode.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // indica qeu a classe é armazenavel no banco
@Table(name="departamento") //nome da tabela
public class Departamento {
	@Column(name="codigo") //nome da coluna
	@Id					   //indica que o atributo trata-se de uma primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //identifica que é auto-incremente
	private Integer codigo;
	
	@Column(name="nome", length=50, nullable = false)
	private String nome;
	
	@Column(name="descricao", nullable = true, columnDefinition = "TEXT")
	private String descricao;
	
	@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("departamento")
	private List<Produto> listaProdutos;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Produto> getListProdutos() {
		return listaProdutos;
	}
	public void setListProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	

}

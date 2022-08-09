
//definir novo tipo de dado que será usado por outras classes
public class Produto {
	//declarando as variavéis que compõe a estrutura
	int codigo;
	private String descricao;
	private double preco;
	
	//MÉTODO CONSTRUTOR = COSTUMIZAR FORMAS QUE CRIA-SE OBJETOS
	/*
	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	public Produto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao; 
		this.preco = 0.0;
	}
	public Produto(int codigo) {
		this(codigo, "", 0.0); //Um construtor chamando outro 
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo; //this serve para diferenciar o elemento da estrutura da classe, diferenciando quem é atributo e quem é parametro. Se não tem é parametro, se tem é atributo.
	}
	public int getCodigo() {
		return this.codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPreco() {
		return this.preco;
	}
	*/
	
	public Produto(int codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	//retorno vazio 
	public void mostrarAnuncio() {
		System.out.println("-------PRODUTO-------");
		System.out.println(codigo + ": " + descricao);
		System.out.printf("R$ %.2f%n", preco);
	}
	
	/*
	void modificarPreco(double novoPreco) {
		preco = novoPreco;
	}
	*/
	public void aplicarDesconto(double percentual){//parametro
		preco = preco - (preco * percentual) /100; 
	}
	
	public double simularDesconto(double percentual) {
		double precoSimulado;
		precoSimulado = preco - preco * percentual/100;
		return precoSimulado;
	}
}

//VARIÁVEIS = ATRIBUTOS
//FUNCIONALIDADES = MÉTODOS

/*Declarar atributos como private
 * e metodos como public
 */

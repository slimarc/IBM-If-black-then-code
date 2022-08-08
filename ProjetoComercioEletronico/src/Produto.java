
//definir novo tipo de dado que será usado por outras classes
public class Produto {
	//declarando as variavéis que compõe a estrutura
	int codigo;
	String descricao;
	double preco; 
	
	//retorno vazio 
	void mostrarAnuncio() {
		System.out.println("-------PRODUTO-------");
		System.out.println(codigo + ": " + descricao);
		System.out.printf("R$ %.2f%n", preco);
	}
	void modificarPreco(double novoPreco) {
		preco = novoPreco;
	}
	void aplicarDesconto(double percentual){//parametro
		preco = preco - (preco * percentual) /100; 
	}
}

//VARIÁVEIS = ATRIBUTOS
//FUNCIONALIDADES = MÉTODOS
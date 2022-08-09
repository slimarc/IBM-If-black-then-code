import java.util.ArrayList;

public class OperacaoBancoDados {
	public static void main(String[] args) {
		
	// criando um procedimento de inserção de registros com ArrayList
	ArrayList<String> nomeClientes = new ArrayList<String>();
	nomeClientes.add("Petrolina");
	nomeClientes.add("Givanildo");
	nomeClientes.add("Adroaldo");
	nomeClientes.add("Tarciano");
	
	//Visualizando os registros alocado na variavel
	System.out.println(nomeClientes);
	
	//Visualizando um registro específico dentro da base
	System.out.println(nomeClientes.get(1));
	
	// criando um procedimento de inserção de registros com ArrayList e set
	ArrayList<String> marcas = new ArrayList<String>();
	marcas.add("Fiat");
	marcas.add("Chevrolet");
	marcas.add("Ford");
	marcas.add("BMW");
	
	//com o set é possível inserir um novo valor dentro do registro
	marcas.set(0, "Volkswagen");
	System.out.println(marcas);
	
	//removendo registros dentro da estrutura de ArrayList
	marcas.remove(3);
	System.out.println(marcas);
	
	//retornando a quantidade de registros de um ArrayList
	System.out.println(marcas.size());
	
	/*
	//como utilizar um size dentro do nosso laço de repetição 
	for(contador=0; contador<=marcas.size; contador++) {
		
	}
	*/
	/*
	for(String contador: marcas) {
		System.out.println(contador);
	}
	*/
	for(int contador=0; contador<marcas.size(); contador++) {
		System.out.println(marcas.get(contador));
	}
	
	
	
	}
}

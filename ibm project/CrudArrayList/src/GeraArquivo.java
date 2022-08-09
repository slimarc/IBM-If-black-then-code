import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeraArquivo {

	public static void main(String[] args) throws IOException {
		ArrayList<String> nomeClientes = new ArrayList<String>();
		nomeClientes.add("Petrolina");
		nomeClientes.add("Givanildo");
		nomeClientes.add("Adroaldo");
		nomeClientes.add("Tarciano");
		nomeClientes.add("Paulo");
		nomeClientes.add("Ricardo");
		nomeClientes.add("Joao");
		nomeClientes.add("Felipe");
		
		FileWriter arquivo = new FileWriter("C:\\criando arquivo em java\\clientes.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		for(String contador: nomeClientes) {
			gravarArquivo.println(nomeClientes);
		}
		
		
		arquivo.close();
		System.out.println("Criação de arquivo na unidade C:\\criando arquivo em java\\clientes.txt");

	}

}

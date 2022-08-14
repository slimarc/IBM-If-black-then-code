
public class BancoDeDados {

	public static void main(String[] args) {
		Sistema sintaxeBanco = new Sistema();
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			//permite chamar a opção read do CRUD
			sintaxeBanco.listaClientes();
			
			//Permite chamar a opção Insert do CRUD
			//sintaxeBanco.inserirContatos("Samira Pereira");
			
			//Chamando opção upadate do CRUD
			//sintaxeBanco.updateContato("32", "Samira Pereira");
			
			//Chamando opção delete do CRUD
			//sintaxeBanco.deleteContato("21");
			System.out.println("Conexão com o banco de dados foi com êxito.");
		}else {
			System.out.println("Não foi possível conectar ao banco de dados");
		}
	}

}

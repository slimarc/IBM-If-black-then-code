import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Sistema {
	private Connection connection=null;
	private java.sql.Statement statement=null;
	private ResultSet resultset=null;
	

	// passagem de parametros para o conexao do banco de dados
	public void conectar() {
		//Criação da variável para se conetarr o dataBase
		String servidor = "jdbc:mysql://localhost/farmacia";
		//Usuário do banco de dados
		String usuario = "root";
		//Senha do usuário do banco de dados
		String senha = "mysql";
		//Vinculando o driver de conexão
		String driver="com.mysql.cj.jdbc.Driver";
		
		//Permite verificar o tratamento da exceção caso o banco de dados falhar
		try{
			Class.forName(driver);
			this.connection=DriverManager.getConnection(servidor,usuario,senha);
			this.statement=this.connection.createStatement();
		}catch (Exception e){
			System.out.println("Error:"+e.getMessage());
		}
		
	}
	
	public boolean estaConectado() {
		if(this.connection !=null) {
			return true;
		}else{
			return false;
		}
	}
	
	//Criando o metódo para fazer a consulta de dados em SQL para trazer os registros
	public void listaClientes(){
		System.out.println("\tLISTA DE CLIENTES");
		try {
		//tratando a exceção do nosso retorno do slect
		String query="select c.idCliente,c.nomeCliente,c.cpfCliente,c.telCliente,c.emailCliente,e.rua,e.bairro,e.cidade,e.estado,e.clientes_idCliente\r\n"
				+ "from\r\n"
				+ "clientes as c,\r\n"
				+ "endereço as e\r\n"
				+ "where(c.idCliente=e.clientes_idCliente)";
		this.resultset=this.statement.executeQuery(query);
		this.statement=this.connection.createStatement();
		
		//criar laço de repetição
		while(this.resultset.next()) {
			String id = resultset.getString("idCliente");
			String nome = resultset.getString("nomeCliente");
			String cpf = resultset.getString("cpfCliente");
			String tel = resultset.getString("telCliente");
			String rua = resultset.getString("rua");
			String bairro = resultset.getString("bairro");
			String cidade = resultset.getString("cidade");
			String estado = resultset.getString("estado");
		
			System.out.println("************DADOS*************");
			System.out.println("Código do cliente: "+ id);
			System.out.println("Nome: "+ nome);
			System.out.println("Cpf: "+ cpf);
			System.out.println("Telefone: "+ tel);
			System.out.println("***********ENDEREÇO***********");
			System.out.println("Rua: "+rua);
			System.out.println("Bairro: "+bairro);
			System.out.println("Cidade: "+cidade);
			System.out.println("Estado: "+estado);
		}
	}catch(Exception e) {
		System.out.println("Error"+e.getMessage());
	}	
		
	}
	
	//Criando o método de inserção de Registros
	
	public void inserirClientes(String nomeCliente, String cpfCliente, String telCliente, String emailCliente) {
		//Linha de execução da sintaxe de insert em SQL
		try {
			if(nomeCliente.trim().equals("") || cpfCliente.trim().equals("") || telCliente.trim().equals("") ||emailCliente.trim().equals("") ){
				System.out.println("Cliente não cadastrado");
			}else {
				String query="Insert into clientes (nomeCliente, cpfCliente, telCliente, emailCliente) values ('"+nomeCliente+"','"+cpfCliente+"','"+telCliente+"','"+emailCliente+"');";
				System.out.println(query);
				this.statement.executeUpdate(query);
			}		
		}catch(Exception e){
			System.out.println("Error: "+e.getMessage());
			
		} 
	}
	
	
	/*
	public void updateClientes(String id, String contatos) {
		try {
			//linha de execução da sintaxe de update em SQL
			String query="update contatos set clientes=('"+clientes+"') where id=('"+id+"');";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}
	
	public void deleteContato(String id) {
		try {
			//linha de execução da sintaxe de delete em SQL
			String query="delete from contatos where id=('"+id+"');";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
		*/	

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
	private Connection connection=null;
	private java.sql.Statement statement=null;
	private ResultSet resultset=null; 
	

	// passagem de parametros para o conexao do banco de dados
	public void conectar() {
		//Criação da variável para se conetarr o dataBase
		String servidor = "jdbc:mysql://localhost/ibm";
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
	public void listaContatos(){
		System.out.println("\tLISTA DE CONTATOS");
		try {
		//tratando a exceção do nosso retorno do slect
		String query="Select * from contatos";
		this.resultset=this.statement.executeQuery(query);
		this.statement=this.connection.createStatement();
		
		//criar laço de repetição
		while(this.resultset.next()) {
			String meuID = resultset.getString("id");
			String meuNome = resultset.getString("contatos");
			
			System.out.println("****************************************");
			System.out.println("Id do contato: "+meuID);
			System.out.println("Nome do contato: "+meuNome);
		}
	}catch(Exception e) {
		System.out.println("Error"+e.getMessage());
	}	
		
	}
	
	//Criando o método de inserção de Registros
	public void inserirContatos(String contatos) {
		try {
			//Linha de execução da sintaxe de insert em SQL
			String query="Insert into contatos (contatos) value ('"+contatos+"');";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e){
			System.out.println("Error: "+e.getMessage());
			
		}
	}
	
	public void updateContato(String id, String contatos) {
		try {
			//linha de execução da sintaxe de update em SQL
			String query="update contatos set contatos=('"+contatos+"') where id=('"+id+"');";
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
			

}

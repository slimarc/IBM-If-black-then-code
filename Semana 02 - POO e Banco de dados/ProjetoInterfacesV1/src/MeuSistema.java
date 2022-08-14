
public class MeuSistema {
	public static void main(String[] args) {
		InterfaceBD ibd;
		
		ibd = new BDMySQL();
		//conectar no banco de dados
		ibd.conectar();
		
		//recuperar dados
		ibd.executar("SELECT * FROM tb_clientes");
		
		
		//desconectar
		ibd.desconectar();
		
	}
}

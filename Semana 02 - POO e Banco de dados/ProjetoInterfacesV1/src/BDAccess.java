
public class BDAccess implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Conectando no banco");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do banco");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("ms-aceess>"+comando);
		
	}
	
}

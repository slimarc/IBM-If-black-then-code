
public class UsaInterface {
	public static void main(String[] args) {
		
		
		InterfaceServico i;
		
		i = new InterfaceServico() {
			public void executa(int valor) {
				System.out.println("Executando algo - "+valor);
			}
		};
		
		i.executa(10); 
		
		InterfaceServico i2 = (valor) ->{
			System.out.println("Executa de outra forma - "+valor);
		};
		
		i2.executa(20);
	}
}

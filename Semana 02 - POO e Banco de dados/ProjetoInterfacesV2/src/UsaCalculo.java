
public class UsaCalculo {
	public static void main(String[] args) {
		// chamando método do objeto
		
		ObjetoCalculo o = new ObjetoCalculo();
		o.realizaAlgumCalculo();
		
		InterfaceModulo1 i1 = o;
		i1.calcularValores();
		
		InterfaceModulo2 i2 = o;
		i2.efetivarConta();
		
	
		
	}
}


public class ObjetoCalculo implements InterfaceModulo1, InterfaceModulo2{
	public void realizaAlgumCalculo() {
		System.out.println("Calculo feito");
	}

	@Override
	public void efetivarConta() {
		// TODO Auto-generated method stub
		realizaAlgumCalculo();
	}

	@Override
	public void calcularValores() {
		// TODO Auto-generated method stub
		realizaAlgumCalculo();

	}
}

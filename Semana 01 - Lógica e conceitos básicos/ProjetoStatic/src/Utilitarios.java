//métodos estaticos não é necessario dar new
public class Utilitarios {
	
	public static final double pi=3.14;//final torna uma constante obrigando a ter um valor inicial e nao poder mexer mais
	
	public static int soma(int x, int y) {
		return x+y;
	}
	
	public static int potencia(int x, int y) {
		if (y==0) {
			return 1;
		}
		else {
			int potencia=1;
			for (int cont=1; cont<=y; cont++) {
				potencia = potencia *x;
			}
			return potencia;
		}
	}
	
	
	
}

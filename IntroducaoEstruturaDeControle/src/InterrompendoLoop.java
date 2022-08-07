import java.util.Scanner;
public class InterrompendoLoop {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for (int contador=1; contador<=10; contador++) {
			System.out.println("Contador = "+contador);
			if (contador==5) {
				break;
			}

		}
		System.out.println("Fim do programa");	
		teclado.close();		
	}

}

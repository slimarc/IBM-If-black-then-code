import java.util.Scanner;

public class WhileTrue {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador = 1;
		
		while(true) {
			if (contador == 5) {
				break;
			}
			System.out.println("Contador = "+contador);
			contador++;
		}
		System.out.println("Fim do programa");

		teclado.close();
	}

}

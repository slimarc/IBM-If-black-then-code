import java.util.Scanner;

public class ProcessaTabuada {
	
	public static void main(String[] args) {
		// criando um laço de repetição
		for(int numero=1; numero<=9; numero++){
			System.out.println();
			System.out.println("Tabuada do "+numero);
			System.out.println();
			for(int contador=1; contador<=10; contador++) {
				System.out.println(numero+" x "+contador+" = "+(numero*contador));
			}
			
		}
		
	}

}

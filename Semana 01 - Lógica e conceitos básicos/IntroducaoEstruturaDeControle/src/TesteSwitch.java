import java.util.Scanner;
	public class TesteSwitch{
			public static void main() {
				Scanner teclado = new Scanner(System.in);
				int valor;
				System.out.println("Digite um valor inteiro");
				valor = teclado.nextInt();
				
				switch(valor) {
					case 1:
						System.out.println("Digitou o valor 1");
						break;
					case 2:
						System.out.println("Digitou o valor 2");
						break;
					case 3:
						System.out.println("Digitou o valor 3");
						break;
					default:
						System.out.println("Digitou outro valor");
						break;
				}
			}
	}
	
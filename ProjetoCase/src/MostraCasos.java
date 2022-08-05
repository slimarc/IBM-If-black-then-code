import java.util.Scanner;
	public class MostraCasos {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int opcao = 2;
			String [] carros = {"Sandero", "Fusion","Prisma"};
			
			System.out.println("Escolha a opção abaixo: ");
			System.out.println("1 - Mostrar carro da marca honda ");
			System.out.println("2 - Mostrar todos os carros");
			
			switch (opcao) {
			case 1:
				System.out.println("Nao temos carros para alocar");
				break;
			case 2:
				System.out.println(carros[0]);
				System.out.println(carros[1]);
				System.out.println(carros[2]);
			default:
				System.out.println("Não temos opção");
				
			input.close();
			}
		}
	
	}

import java.util.Scanner;
	public class DDD {
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			int ddd = input.nextInt();
		
			switch(ddd){
				case 61:
					System.out.println("Brasilia");
					break;
				case 71:
					System.out.println("Salvador");
					break;
				case 11:
					System.out.println("São Paulo");
					break;
				case 21:
					System.out.println("Rio de Janeiro");
					break;
				case 32:
					System.out.println("Juiz de Fora");
					break;
				case 27:
					System.out.println("Vitoria");
					break;
				case 31:
					System.out.println("Belo Horizonte");
				default:
					System.out.println("DDD não cadastrado");
				
			input.close();	
			}	
		}
	
	}

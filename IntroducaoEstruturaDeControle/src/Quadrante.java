import java.util.Scanner;
	public class Quadrante{
		public static void main(String args[]) {
			Scanner teclado = new Scanner(System.in);
			double x, y;
			
			do{
				System.out.println("Insira x: ");
				x = teclado.nextDouble();
				System.out.println("Insira y: ");
				y = teclado.nextDouble();
				
				if (x>0 && y>0) {
					System.out.println("("+x+", "+y+")");
					System.out.println("Primeiro quadrante");
				}
				else if (x<0 && y>0) {
					System.out.println("("+x+", "+y+")");
					System.out.println("Segundo quadrante");
				}
				else if (x<0 && y<0) {
					System.out.println("("+x+", "+y+")");
					System.out.println("Terceiro quadrante");
				}
				else if (x>0 && y<0){
					System.out.println("("+x+", "+y+")");
					System.out.println("Quarto quadrante");
				}
			
			}while(x!=0 && y!=0);
			
			teclado.close();
		}
	}
import java.util.Scanner;
	public class TesteIf{
		public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, media;
		System.out.print("Digite a nota 1: ");
		n1 = teclado.nextDouble();
		System.out.print("Digite a nota 2: ");
		n2 = teclado.nextDouble();
		
		media = (n1 + n2)/2;
		
		System.out.println("Sua média final foi: "+media);
		
		if(media>=6) {
			System.out.println("Você foi aprovado!");
		}else {
			System.out.println("Você foi reprovado. Estude mais.");
		}
		
		System.out.println("Até breve.");
		
		teclado.close();
		
	}
}
import java.util.Scanner;
	public class TesteVetor {
		public static void main(String arg[]){
			Scanner teclado = new Scanner(System.in);
			double vetor1[];
			
			vetor1 = new double[10];
			
			System.out.println("Insira os valores do vetor: ");
			
			for (int pos=0; pos<10; pos++) {
				vetor1[pos] = teclado.nextDouble();
			}
			//length é o comprimento do array
			for (int pos=0; pos<vetor1.length; pos++) {
				System.out.printf("%.1f\t", vetor1[pos]);
			}
			teclado.close();
	}

}

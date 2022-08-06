import java.util.Scanner;
	public class IfsAninhados2{
		public static void main(String args[]) {
			Scanner teclado = new Scanner(System.in);
			double soma, nota, media;
			
			soma=0; 
			
			for(int avaliacao=1; avaliacao<=2; avaliacao++) {
				System.out.println("Insira a nota da avaliação " + avaliacao + ": ");
				nota = teclado.nextDouble();
				soma += nota;
			}
			
			media = soma/2;
	
			System.out.println("A média do aluno foi: "+media);
			
			if (media>=9) {
				System.out.println("Conceito A");
			}
			else if (media>=8 && media<9){
				System.out.println("Conceito B");
			}
			else if(media>=7 && media<8){
				System.out.println("Conceito C");
			}
			else if(media>=6 && media<7){
				System.out.println("Conceito D");
			}
			else{
				System.out.println("Conceito F");
			}
	
			teclado.close();
		}
	
	}

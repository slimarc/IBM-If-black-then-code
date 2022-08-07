import java.util.Scanner;
	public class ExercicioQuadradoECubo{
		public static void main(String args[]){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Insira o valor de N");
			int N = teclado.nextInt();
			
			
			if (N>1 && N<1000) {
				//for de quantas linhas vao ser impressas
				for (int nLinhas=1; nLinhas<=N; nLinhas++) {
					System.out.println(nLinhas + " " + (nLinhas*nLinhas)+" "+(nLinhas*nLinhas*nLinhas));
				}
			}else{
				System.out.println("N precisa ser maior que 1 e menor que 1000");
			}
			
			teclado.close();
		}
	}
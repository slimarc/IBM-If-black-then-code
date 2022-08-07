import java.util.Scanner;

	public class EstruturaDeRepeticao2{
		public static void main(String args[]) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Insira o valor para obter a tabuada");
			int valor = teclado.nextInt();
			int contador;
			
			contador=1;
			do{
				System.out.println(valor + " x " + contador + " = " + contador*valor );
				contador+=1;
			}while(contador<=10);//executa pelo emnos uma vez 
			
			teclado.close();
			}
	}
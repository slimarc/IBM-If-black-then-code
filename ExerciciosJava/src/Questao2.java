/* Exercicio 02
 * Para calcular:
 * A) Área de um quadrado, dados seus lados
 * B) Área de um retangulo, dados suas base e sua altura
 * C) Área de um triângulo, dados sua base e sua altura
 * D) Área de um losango, dadas suas diagonais
 * E) Área de um trapézio dadas suas bases e sua altura
 * F) Volume de um paralelepípedo, dada duas dimensões
 * G) Volume de um cubo, dado seu lado
 * H) Volume d eum cilindro, dado seu diâmetro e considerando pi=3,14
*/
import java.util.Scanner;

	public class Questao2{
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			double area, lado; 
			
			//ENTRADA DE DADOS
			System.out.println("Insira o lado do quadrado: ");
			lado = input.nextDouble();
			
			//PROCESSAMENTO
			area = lado*lado;
			
			//SAÍDA
			System.out.printf("A area do quadrado inserido é: %.2f cm2", area);
			
			input.close();
			
	}
	
}
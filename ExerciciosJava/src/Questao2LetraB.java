/* Exercicio 02
 * Para calcular:
 * A) Área de um quadrado, dados seus lados
 * B) Área de um retangulo, dados suas base e sua altura
 * C) Área de um triângulo, dados sua base e sua altura
 * D) Área de um losango, dadas suas diagonais
 * E) Área de um trapézio dadas suas bases e sua altura
 * F) Volume de um paralelepípedo, dada duas dimensões
 * 
*/
import java.util.Scanner;
	public class Questao2LetraB {
		public static void main (String args[]){
			Scanner input = new Scanner(System.in);
			double area, base, altura;
			
			//ENTRADA DE DADOS
			System.out.println("Insira a base do retângulo: ");
			base = input.nextDouble();
			System.out.println("Insira a altura do retângulo");
			altura = input.nextDouble();
			
			//PROCESSAMENTO
			area = base * altura;
			
			//SAÍDA
			System.out.printf("A area do retângulo é de: %.3f cm²", area);
			
			input.close();
		}

}

	
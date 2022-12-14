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
	public class Questao2LetraC {
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			double area, base, altura;
			
			//ENTRADA DE DADOS
			System.out.println("Insira a base do triângulo: ");
			base = input.nextDouble();
			System.out.println("Insira a altura do triângulo: ");
			altura = input.nextDouble();
			
			//PROCESSAMENTO DE DADOS
			area = (base * altura)/2;
			
			//SAÍDA DE DADOS
			System.out.printf("A área do triângulo é de: %.3f cm²", area);
			
			input.close();
		}
}

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
	public class Questao2LetraF{
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			double base, altura, profundidade, volume;
			
			//ENTRADA DE DADOS
			System.out.println("Insira a base do paralelepípedo: ");
			base = input.nextDouble();
			System.out.println("Insira a altura do paralelepípedo: ");
			altura = input.nextDouble();
			System.out.println("Insira a profundidade do paralelepípedo: ");
			profundidade = input.nextDouble();
			
			//PROCESSAMENTO DE DADOS
			volume = base * altura * profundidade;
			
			//SAÍDA DE DADOS
			System.out.printf("O volume do paralelepípedo é: %.3f cm³", volume);
			input.close(); 
		}
	}
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
	public class Questao2LetraH{
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			double pi, raio, altura, volume;
			
			//ENTRADA DE DADOS
			System.out.println("Insira o valor do raio do cilindro: ");
			raio = input.nextDouble();
			System.out.println("Insira o valor da altura do cilindro: ");
			altura = input.nextDouble();
			
			//PROCESSAMENTO DE DADOS
			pi = 3.14;
			volume = pi * (raio * raio ) * altura;
			
			//SAÍDA DE DADOS
			System.out.printf("O volume do cilíndro é de: %.3f cm³", volume);
			
			input.close();
		}
	}
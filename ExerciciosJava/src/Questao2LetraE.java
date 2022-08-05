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
	public class Questao2LetraE{
		public static void main(String args []){
			Scanner input = new Scanner(System.in);
			double baseMaior, baseMenor, altura, area;
			
			//ENTRADA DE DADOS
			System.out.println("Insira a base maior do trapézio: ");
			baseMaior = input.nextDouble();
			System.out.println("Insira a base menor do trapézio: ");
			baseMenor = input.nextDouble();
			System.out.println("Insira a altura do trapézio: ");
			altura = input.nextDouble();
			
			//PROCESSAMENTO
			area = ((baseMaior + baseMenor) * altura) / 2;
			
			//SAÍDA
			System.out.printf("A area do trapézio é de: %.3f cm²", area);
			
			input.close();
		}
	}
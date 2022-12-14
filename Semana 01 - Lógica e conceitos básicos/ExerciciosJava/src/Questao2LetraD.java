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
	public class Questao2LetraD{
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			float diagonalMaior, diagonalMenor, area;
			
			//ENTRADA DE DADOS
			System.out.println("Insira a diagonal maior do losango: ");
			diagonalMaior = input.nextFloat(); 
			System.out.println("Insira a diagonal menor do losango: ");
			diagonalMenor = input.nextFloat();
			
			//PROCESSAMENTO E SAÍDA DE DADOS
			if(diagonalMaior>=diagonalMenor){
				area = (diagonalMaior * diagonalMenor) / 2;
				System.out.printf("A área do losango é de: %.2f cm²", area);
			}else{
				System.out.println("Insira as diagonais novamente!");
				}
				
			input.close();
		}
	}
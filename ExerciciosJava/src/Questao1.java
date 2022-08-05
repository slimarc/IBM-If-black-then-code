/*Exercicio 01
  Insirir um inteiro de 3 digítos e imprimir ele invertido
*/

import java.util.Scanner;

public class Questao1{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int valorInicial, cent, dezena, unid, resto;
		int valorFinal;
		
		// ENTRADA DE DADOS
		System.out.println("Insira um valor de 3 dígitos: ");
		valorInicial = input.nextInt();
		
		// PROCESSAMENTO DE DADOS
		cent = valorInicial/100;  // ex: 125 / 100 = 1,  logo centena   = 1
		resto = valorInicial%100; // ex: 125 % 100 = 25, logo o resto   = 25
		dezena = resto/10;        // ex:  25 / 10  = 5,  logo a dezena  = 2
		unid = resto%10; 		  // ex:  25 % 10  = 5,  logo a unidade = 5
		
		valorFinal = (unid * 100) + (dezena * 10) + cent; 
		
		// SAÍDA DE DADOS
		System.out.printf("O valor invertido é: %d", valorFinal); 
		
		input.close();
	}
}
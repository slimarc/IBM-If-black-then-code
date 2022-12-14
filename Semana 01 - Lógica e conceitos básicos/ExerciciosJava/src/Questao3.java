/*Exercicio 3
 *Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salário mínimo,
 *faça um algoritmo que receba o valor do salário mínimo e a quantidade de kw
 *gasta por uma residência e calcule:
 *a) O valor em reais de cada kw
 *b) O valor em reais a ser pago
 *c) O novo valor a ser pago por essa residÊncia com um desconto de 10%
 */
import java.util.Scanner;

	public class Questao3{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			double salarioMin, valorCentKw, quantidadeKw, valor1KwReal, valorKwFinal, valorKwDesc;

			//ENTRADA DE DADOS
			System.out.println("Insira o valor do salário mínimo: ");
			salarioMin = input.nextDouble();
			System.out.println("\nInsira a quantidade de kW gasta na residência: ");
			quantidadeKw = input.nextDouble();
			
			//PROCESSAMENTO DE DADOS
			valorCentKw = salarioMin/7;
			valor1KwReal = valorCentKw/100;
			valorKwFinal = valor1KwReal * quantidadeKw;
			valorKwDesc = valorKwFinal - (valorKwFinal * 0.1);
			
			//SAIDA DE DADOS
			System.out.printf("\nO valor de 100kW baseado no salário mínimo de R$ %.2f é de R$ %.2f%n", salarioMin, valorCentKw);
			System.out.printf("O valor em reais a cada kW é de: R$ %.2f%n", valor1KwReal);
			System.out.printf("O valor total em reais a ser pago é de: R$ %.2f%n", valorKwFinal);
			System.out.printf("O valor total com o desconto de 10% é de: R$ %.2f%n", valorKwDesc);
			
			input.close();
		}
	}

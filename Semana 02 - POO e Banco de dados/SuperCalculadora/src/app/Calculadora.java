package app;

import java.util.Scanner;

import core.Calcula;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int escolha;
		double num1, num2;
		Calcula resultado = new Calcula(0.0, 0.0);
		
		do {
			System.out.println("-----SUPER CALCULADORA-----");
			System.out.println("1) ADIÇÃO");
			System.out.println("2) SUBTRAÇÃO");
			System.out.println("3) MULTIPLICAÇÃO");
			System.out.println("4) DIVISÃO");
			System.out.println("0) SAIR");
			escolha = teclado.nextInt();
			
			switch(escolha){
						case 1:
							System.out.println("ADIÇÃO - INSIRA OS VALORES");
							num1 = teclado.nextDouble();
							num2 = teclado.nextDouble();
							resultado.adicao(num1, num2);
							break;
						case 2:
							System.out.println("ADIÇÃO - INSIRA OS VALORES");
							num1 = teclado.nextDouble();
							num2 = teclado.nextDouble();
							resultado.subtracao(num1, num2);
							break;
						case 3:
							System.out.println("ADIÇÃO - INSIRA OS VALORES");
							num1 = teclado.nextDouble();
							num2 = teclado.nextDouble();
							resultado.multiplicacao(num1, num2);
							break;
						case 4:
							System.out.println("ADIÇÃO - INSIRA OS VALORES");
							num1 = teclado.nextDouble();
							num2 = teclado.nextDouble();
							resultado.divisao(num1, num2);
							break;
						case 0:
							System.out.println("SAINDO DO PROGRAMA");
							break;
						default:
							System.out.println("INSIRA UMA OPÇÃO VÁLIDA");
							
			}
			
		}while(escolha != 0);
		
		
		teclado.close();
	}

}

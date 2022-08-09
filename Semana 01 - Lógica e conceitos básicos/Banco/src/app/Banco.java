package app;

import java.util.Scanner;

import cores.ContaBancaria;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria conta = new ContaBancaria(2882,34,"Ricardo","985.564.231-00", 2500.00);
		
		do{
			System.out.println("------SEU BANCO------");
			System.out.println("\tMENU");
			System.out.println("1 - Deposito");
			System.out.println("2 - Saque");
			System.out.println("3 - Info");
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();
			switch(opcao) {
				case 1:
					System.out.println(">>>> DEPOSITO - Digite o valor:");
					valor = teclado.nextDouble();
					conta.depositar(valor);
					break;
				case 2:
					System.out.println(">>>> SAQUE - Digite o valor: ");
					valor = teclado.nextDouble();
					if (conta.sacar(valor)){
						System.out.println("\t SAQUE EFETUADO!");
					}else {
						System.out.println("\t SALDO INSUFICIENTE");
					}
					break;
				case 3:
					System.out.println(">>>> INFORMAÇÕES: "+conta.exibirDados());
					break;
				case 0:
					System.out.println(">>>> ENCERRANDO O PROGRAMA");
					break;
				default:
					System.out.println(">>>> OPÇÃO INVÁLIDA");
			}
			
		}while(opcao != 0);
		
		
		teclado.close();
	}
}
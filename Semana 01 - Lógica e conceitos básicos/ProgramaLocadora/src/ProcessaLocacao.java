//Atividade solicitada durante mentoria do dia 05/08 da Semana 01 do projeto IBM - If black, then code 
import java.util.Scanner;

	public class ProcessaLocacao {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String[] carros = new String[10];
			String [] ordem = {"1", "2","3","4", "5", "6", "7", "8", "9", "10"};
			int opcao;

			System.out.println("Cadastre os dez carros: ");
			//For para preencher vetor carros
			for(int pos=0; pos<=9; pos++) {
				carros[pos] = input.nextLine();
			}
			
			System.out.println("\nSelecione a opção que você dejesa: ");
			System.out.println("\n1 - Mostrar carros disponiveis. ");
			System.out.println("\n2 - Selecione seu carro. ");
			System.out.println("\n3 - Encerre o progama.");
			opcao = input.nextInt();
			
			switch (opcao) {
					case 1:
						//For para imprimir os carros cadastrados
						System.out.println("Os disponivéis são: ");
						for(int pos=0; pos<=9; pos++) {
							System.out.println(ordem[pos]+" - "+ carros[pos]);
						}
					case 2:
						int carro;
						System.out.println("Digite a opção corresponde ao carro que você deseja: ");
						carro = input.nextInt();
						if (carro>=1 && carro<=10){
							for(int pos=0; pos<=carro; pos++) {
							}
							System.out.println("O carro selecionado foi o: " + carros[carro-1]);
						}else{
							System.out.println("Insira uma opção válida.");
							break;
						}
					case 3:
						System.out.println("Programa encerrado, até logo.");
						break;
					default:
						System.out.println("Insira uma opção válida");
						break;
					}
			
			input.close();
		}
	}
	


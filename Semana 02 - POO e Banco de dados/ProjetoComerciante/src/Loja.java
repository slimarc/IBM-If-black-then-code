import java.util.Scanner;
public class Loja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] produtos= new String[10];
		
		int opcao;
		
		System.out.println("\nSelecione a opção que você dejesa: ");
		System.out.println("\n1 - Cadastre os produtos. ");
		System.out.println("\n2 - Mostrar produtos. ");
		System.out.println("\n3 - Selecione o produto. ");
		System.out.println("\n4 - Encerre o progama.");
		opcao = input.nextInt();
		
	
		switch (opcao) {
				case 1:

					System.out.println("Cadastre os produtos: ");
					for(int pos=0; pos<=9; pos++) {
						produtos[pos] = input.nextLine();
					}
			
				case 2:
					System.out.println("Os produtos disponiveis são: ");
					for(int pos=0; pos<=9; pos++) {
						System.out.println(produtos[pos]);
					}
				case 3:
					int produto;
					System.out.println("Digite a opção corresponde ao produto que você deseja: ");
					produto = input.nextInt();
					if (produto>=1 && produto<=10){
						for(int pos=0; pos<=produto; pos++) {
						}
						System.out.println("O produto selecionado foi o: " + produtos[produto-1]);
					}else{
						System.out.println("Insira uma opção válida.");
						break;
					}
				case 4:
					System.out.println("Programa encerrado, até logo.");
					break;
				default:
					System.out.println("Insira uma opção válida");
					break;
				}
		
		input.close();
	}

		
		
		
		
		
		
}



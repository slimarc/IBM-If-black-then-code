import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String Nome, Email;
		int idade;
		
		System.out.println("Digite o seu nome: ");
		Nome = teclado.nextLine();
		
		System.out.println("Digite seu email: ");
		Email = teclado.nextLine();
		
		System.out.println("Insira a idade: ");
		idade = teclado.nextInt();
		
		//chamando a classe
		
		MandaMensagem executar = new MandaMensagem();
		executar.Mensagem(Nome, Email, idade);
		
		teclado.close();
	}

}

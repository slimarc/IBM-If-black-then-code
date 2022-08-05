import java.util.Scanner;

public class LeiturasDiversas{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.println("Insira seu nome: ");
		//para entrada de strings pode-se usar nextLine(); ou next();, sendo que apenas o next considera o espaço ou enter como a última entrada. 
		nome = input.nextLine();
		System.out.println("O nome inserido foi: "+nome);
		input.close();
	}
}
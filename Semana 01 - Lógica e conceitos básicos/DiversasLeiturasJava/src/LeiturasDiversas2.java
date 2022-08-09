import java.util.Scanner;

public class LeiturasDiversas2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int codigo;
		double preco;
		String nome, texto;
	
		System.out.print("Digite o codigo do produto: ");
		texto = input.nextLine();
		codigo = Integer.parseInt(texto);
		System.out.print("Digite o nome do produto: ");
		nome = input.nextLine();
		System.out.print("Digite o preço do produto: ");
		texto = input.nextLine();
		preco = Double.parseDouble(texto);
		// após da leitura como texto e a conversão é necessário usar leitura internacional
		System.out.println("O produto inserido foi "+nome+" de código "+ codigo+" no valor de "+preco);
		//%d para chamar inteiro no print, %s para string e %f para float ou double
		//%.xf para definir o numero de casas decimais 
		System.out.printf("Você digitou %d - %s R$ %.2f\n", codigo, nome, preco);
		input.close();
	}
}

/*Conversões:

String para double:
Double.parseDouble(Nome da variável string);

String para int:
Integer.parseInt(Nome da variável string);

String para float:
Float.parseFloat(Nome da variável string);

Int, Float, Double para String:
toString() to String(tipo);
String.valueOf(int, float ou double);

*/  
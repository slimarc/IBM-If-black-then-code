import java.util.Scanner;

public class ProcessaCalculos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com o primeiro valor: ");
		int valor1 = input.nextInt();
		System.out.println("Entre com o segundo valor: ");
		int valor2 = input.nextInt(); 
		System.out.println("Os valores digitados foram: "+valor1+" e "+valor2);
		System.out.println("A soma dos valores foi de: " + (valor1+valor2));
		input.close();
	}

}

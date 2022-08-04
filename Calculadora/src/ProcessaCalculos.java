import java.util.Scanner;

public class ProcessaCalculos {

	public static void main(String[] args) {
		System.out.println("Entre com o primeiro valor: ");
		Scanner numero1= new Scanner(System.in); int valor1 = numero1.nextInt();
		System.out.println("Entre com o segundo valor: ");
		Scanner numero2= new Scanner(System.in); int valor2 = numero2.nextInt(); 
		System.out.println("Os valores digitados foram: "+valor1+" e "+valor2);
		System.out.println("A soma dos valores foi de: " + (valor1+valor2));
				
	}

}

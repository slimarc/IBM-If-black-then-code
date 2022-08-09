import java.util.Scanner;
public class Continue {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		/*
		for(int contador=1; contador<=10; contador++) {
			if(contador==5) {
				continue;//ele ignora as proximas instruções
			}
			System.out.println("Contador ="+contador);
		*/
		
		int contador=1;
		while(contador<=10) {
			if(contador ==5) {
				continue;// ao usar no while ele trava pois o valor do contador não é alterado
			}
			System.out.println("Contador = "+contador);
			contador++;
		}
		
		teclado.close();
	}

}

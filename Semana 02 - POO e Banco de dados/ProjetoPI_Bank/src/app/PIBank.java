package app;

import core.Conta;
import core.ContaEspecial;

public class PIBank {

	public static void main(String[] args) {
		Conta c1 = new Conta("Ricardo", "154.478.654-00", 21545, 500);
		Conta c2 = new ContaEspecial("Jose", "154.355.654-00", 3264, 400.00, 400.00);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.debitar(80);
		c2.debitar(480);
		
		System.out.println("\n****************************");
		System.out.println(c1);
		System.out.println(c2);
	}

}

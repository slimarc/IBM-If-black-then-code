import java.util.Scanner;
public class EmpregadoTeste {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		Empregado e1, e2;
		
		String nome1, nome2;
		double salario1, salario2;
		
		
		System.out.println("Insira nome do primeiro funcionario: ");
		nome1 = teclado.nextLine();
		System.out.println("Insira o salário do funcionário: ");
		salario1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Insira nome do segundo funcionario: ");
		nome2 = teclado.nextLine();
		System.out.println("Insira o salário do funcionário: ");
		salario2 = Double.parseDouble(teclado.nextLine());
		
		e1 = new Empregado(nome1, salario1);
		e2 = new Empregado(nome2, salario2);
		
		//antes do reajusto
		
		System.out.println("-----INFORMAÇÕES ORIGINAIS------");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(50.0);
		
		System.out.println("-------SALÁRIOS REAJUSTADOS--------");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		teclado.close();
	}
}

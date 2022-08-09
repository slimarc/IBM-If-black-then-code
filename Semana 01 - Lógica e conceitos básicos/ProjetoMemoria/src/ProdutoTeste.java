
public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1, p2;
		
		p1 = new Produto(12354, "Computador", 3000);
		System.out.println("P1 = "+p1.exibir());
		
		p2 = p1;
		//essa atribuição não funciona, já que não está criando um novo espaço de memóri.
		p2.setPreco(1500.00);
		System.out.println("P1 = "+p1.exibir());
		System.out.println("P1 = "+p2.exibir());
	}

}

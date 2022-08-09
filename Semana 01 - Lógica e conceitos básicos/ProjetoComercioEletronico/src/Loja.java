
public class Loja {
	public static void main(String[] args) {
		Produto p, p2, p3;	
		p  = new Produto(54262, "Computador", 3000.00);
		p2 = new Produto(32654,"Mouse", 32);
		p3 = new Produto(32147,"Teclado", 54);
		
		/*
		p.setCodigo(1313123);
		p.setDescricao("Computador");
		p.setPreco(2500.00);
		
		p2.setCodigo(121354);
		p2.setDescricao("Mouse");
		p2.setPreco(30.0);
		
		p3.setCodigo(234234);
		p3.setDescricao("Teclado");
		p3.setPreco(40.0);
		*/
		System.out.println("---preços antes dos descontos-----");
		p.mostrarAnuncio(); 
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
		
		System.out.println("***************************");
		p.aplicarDesconto(10);
		p.mostrarAnuncio();
		p2.setPreco(20.0);
		p3.aplicarDesconto(10);
		
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
		
		System.out.println("O preco do "+p.getDescricao()+" com mais 15% de desconto fica R$ "+p.simularDesconto(15));
		p.mostrarAnuncio();
	}

}

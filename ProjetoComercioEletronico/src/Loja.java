
public class Loja {
	public static void main(String[] args) {
		Produto p, p2, p3;	
		p = new Produto();
		p2 = new Produto();
		p3 = new Produto();
		
		p.codigo = 527894;
		p.descricao = "Computador";
		p.preco = 2500.00;
		
		p2.codigo = 121354;
		p2.descricao = "Mouse";
		p2.preco = 30.0;
		
		p3.codigo = 234234;
		p3.descricao = "Teclado";
		p3.preco = 40.0;
		
		System.out.println("---preços antes dos descontos-----");
		p.mostrarAnuncio(); 
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
		
		System.out.println("***************************");
		p.aplicarDesconto(10);
		p.mostrarAnuncio();
		p2.modificarPreco(20);
		p3.aplicarDesconto(10);
		
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
		
		double precoP = p.simularDesconto(15);
		System.out.println("O preco do"+p.descricao+"com mais 15% de desconto fica R$ "+precoP);
		p.mostrarAnuncio();
	}

}
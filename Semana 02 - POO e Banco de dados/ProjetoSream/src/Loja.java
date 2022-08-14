import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loja {
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "computador", 1500));
		lista.add(new Produto(2, "teclado", 700));
		lista.add(new Produto(3, "impressora", 400));
		lista.add(new Produto(4, "mouse", 150));
		
		lista.stream().forEach((p) -> {
			System.out.println(p);
		});
		
		System.out.println("\nProdutos em ordem alfabetica");
		lista.stream().sorted(Comparator.comparing(p->p.getNome()))
			.forEach(p -> System.out.println(p));
		
		System.out.println("\nProdutos em ordem de Preco");
		lista.stream().sorted(Comparator.comparing(p->p.getPreco()))
			.forEach(p -> System.out.println(p));
		
		System.out.println("\nObtendo o produto mais caro");
		Produto produtoMaisCaro;
		produtoMaisCaro = lista.stream().max(Comparator.comparing(p -> p.getPreco()))
				.orElse(null);
		if (produtoMaisCaro != null) {
			System.out.println("Produto mais caro = "+produtoMaisCaro);
		}
		
	}
}

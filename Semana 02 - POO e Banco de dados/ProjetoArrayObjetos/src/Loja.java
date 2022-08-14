import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		/*
		Produto lista[];
		lista = new Produto[5];
		
		lista[0] = new Produto(1,"PC", 1500);
		lista[1] = new Produto(2,"Mouse", 30);
		lista[2] = new Produto(3,"Teclado", 320);
		lista[3] = new Produto(4,"Monitor", 1200);
		lista[4] = new Produto(5,"Impressora", 420);
		
		*/
		
		
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "computador", 1500));
		lista.add(new Produto(2,"Mouse", 30));
		lista.add(new Produto(3,"Teclado", 320));
		lista.add(new Produto(4,"Monitor", 1200));
		lista.add(new Produto(5,"Impressora", 420));
		
		lista.remove(2);
		
		for(Produto p : lista) {
			System.out.println(p);
		}
		
		
		/*
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		*/
	}
}

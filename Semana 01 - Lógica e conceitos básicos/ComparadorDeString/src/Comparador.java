	
public class Comparador {
	public static void main(String[] args) {
		String s1, s2;
		
		/*
		s1 = "Oi tudo bem?";
		s2 = "Oi tudo bem?";
		*/
		
		s1 = new String("Oi tudo bem?");
		s2 = new String("Oi tudo bem?");
		
		//string não é um elemento que necessita de new, ele é uma classe em java
		
		if (s1 == s2) { // não é uma comparação de conteudo, mas compara se estão apontando para o mesmo espaço de memoria
			System.out.println("mesmo endereco de memoria");
		}else {
			System.out.println("endereco diferentes na memoria");
		}
		
		if (s1.equals(s2)) {//comparando conteúdos
			System.out.println("conteudos iguais");
		}else {
			System.out.println("conteudos diferentes");
		}
		
	}
}

//Em java Strings são objetos imutáveis.
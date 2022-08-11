package userinterface;

import core.Estudante;
import core.Pessoa;

public class Universidade {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ricardo", "ricardo@gmail.com", "82994249");
	//	p.setNome("Ricardo");
	//	p.setEmail("ricardolima@gmail.com");
	//	p.setTelefone("8299-4249");
		
		System.out.println(p.exibirInfo());
		
		System.out.println("Insira nome");
		
		Estudante e = new Estudante("José","jose@gmail.com", "95516799", 95467, "engenharia");
	//	e.setNome("Jose");
	//	e.setEmail("jose@gmail.com");
	//	e.setTelefone("96574-8546");
	//	e.setMatricula(1234548);
	//	e.setCurso("engenharia");
		
		System.out.println("\n"+e.exibirInfo());
		
	}

}

package core;
//subClasee
public class Estudante extends Pessoa{ //puxando herança
	private int Matricula;
	private String Curso;
	public Estudante (String nome, String email, String telefone, int Matricula, String Curso) {
		super(nome, email, telefone);
		this.Matricula = Matricula;
		this.Curso = Curso;
	}

	
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int Matricula) {
		this.Matricula = Matricula;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String Curso) {
		this.Curso = Curso;
	}
	
	//sobreescrita de método = redefinição
	public String exibirInfo() {
		return super.nome+"/"+super.email+"/"+super.telefone+"/"+this.Matricula+"/"+this.Curso;
		
	}
	
	
}

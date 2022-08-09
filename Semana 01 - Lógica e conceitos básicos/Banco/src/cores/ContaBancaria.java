package cores;

public class ContaBancaria {
	private int numConta;
	private int digVerf;
	private String nome;
	private String cpf;
	private double saldo;
	
	public ContaBancaria(int numConta, int digVerf, String nome, String cpf, double saldo) {
		this.numConta = numConta;
		this.digVerf = digVerf;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public String exibirDados() {
		return "Contas: "+numConta+"-"+digVerf+" : "+nome+" ("+cpf+") "+String.format("%.2f", saldo);
	}
	public boolean sacar(double valor) {
		if(saldo>=valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getDigVerf() {
		return digVerf;
	}

	public void setDigVerf(int digVerf) {
		this.digVerf = digVerf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	
}


public class MensagemJava {

	public static void main(String[] args) {
		// criando variaveis
		String nome="Ricardo";
		int idade=23;
		
		int num1=10;
		int num2=5;
		int result_subtração=num1-num2; 
		
		//mensagens
		System.out.println("O nome do usuário é: "+ nome + " e ele tem "+idade+" anos");
		System.out.println("Vamos fazer um super desenvolvimento");
		
		//calculando variaveis
		System.out.println("O resultado da subtração de "+num1+"-"+num2+" é igual a "+result_subtração);
		System.out.println("O resultado da soma de "+num1+"+"+num2+" é igual a "+(num1+num2));
		System.out.println("O resultado da multiplicação de "+num1+"*"+num2+" é igual a "+(num1*num2));
		System.out.println("O resultado da divisão de "+num1+"/"+num2+" é igual a "+(num1/num2));
}

}

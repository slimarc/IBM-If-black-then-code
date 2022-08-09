package core;

public class Calcula {
	private double num1, num2;

	public Calcula(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public void adicao(double num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public void subtracao(double num1, double num2) {
		System.out.println(num1-num2);
	}
	
	public void multiplicacao(double num1, double num2) {
		System.out.println(num1*num2);
	}
	public void divisao(double num1, double num2) {
		System.out.println(num1/num2);
	}
}

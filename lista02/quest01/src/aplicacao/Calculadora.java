package aplicacao;

public class Calculadora {
	private int [] num1 = new int[10];
	
	public int getNum1(int i) {
		return num1[i];
	}

	public void setNum1(int num1, int i) {
		this.num1 [i] = num1;
	}
	
	public void somaDosElementos(int num1, int num2, int i) {
		this.num1[i] = num1+num2;
	}
}

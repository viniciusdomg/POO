package aplicacao;

public class Calculadora {
	
	private double op1, op2;
	private String operador;
	
	public double getOp1() {
		return op1;
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public double getOp2() {
		return op2;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public Calculadora() {
		op1 = 0;
		op2 = 0;
	}
	
	private double soma() {
		return op1+op2;
	}
	
	private double subtracao() {
		return op1-op2;
	}
	
	private double multiplicacao() {
		return op1*op2;
	}
	
	private double divisao() {
		return op1/op2;
	}
	
	public double calcular() {
		double resultado;
		
		switch(operador) {
		case "+": resultado = soma();
			break;
		case "-": resultado = subtracao();
			break;
		case "*": resultado = multiplicacao();
			break;
		case "/": resultado = divisao();
			break;
		default: resultado = 0;
		}
		
		return resultado;
	}

}
